package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.R;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.LinearLayoutCompat, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.LinearLayoutCompat, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        int index = a.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.mWeightSum = a.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = a.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = a.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = a.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = a.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        a.recycle();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.mDivider) {
            this.mDivider = divider;
            boolean z = false;
            if (divider != null) {
                this.mDividerWidth = divider.getIntrinsicWidth();
                this.mDividerHeight = divider.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.mDividerPadding = padding;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = getVirtualChildAt(i);
            if (!(child == null || child.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (child.getTop() - ((LayoutParams) child.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(count) != 0) {
            View child2 = getVirtualChildAt(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = child2.getBottom() + ((LayoutParams) child2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    /* access modifiers changed from: package-private */
    public void drawDividersHorizontal(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i = 0; i < count; i++) {
            View child = getVirtualChildAt(i);
            if (!(child == null || child.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + lp.rightMargin;
                } else {
                    position2 = (child.getLeft() - lp.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, position2);
            }
        }
        if (hasDividerBeforeChildAt(count) != 0) {
            View child2 = getVirtualChildAt(count - 1);
            if (child2 != null) {
                LayoutParams lp2 = (LayoutParams) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - lp2.leftMargin) - this.mDividerWidth;
                } else {
                    position = child2.getRight() + lp2.rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, position);
        }
    }

    /* access modifiers changed from: package-private */
    public void drawHorizontalDivider(Canvas canvas, int top) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, top, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + top);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    public void drawVerticalDivider(Canvas canvas, int left) {
        this.mDivider.setBounds(left, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + left, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.mBaselineAligned = baselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.mUseLargestChild = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.mBaselineAlignedChildIndex;
        if (childCount > i) {
            View child = getChildAt(i);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.mBaselineChildTop;
                if (this.mOrientation == 1 && (majorGravity = this.mGravity & 112) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                }
                return ((LayoutParams) child.getLayoutParams()).topMargin + childTop + childBaseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    /* access modifiers changed from: package-private */
    public View getVirtualChildAt(int index) {
        return getChildAt(index);
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float weightSum) {
        this.mWeightSum = Math.max(0.0f, weightSum);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mOrientation == 1) {
            measureVertical(widthMeasureSpec, heightMeasureSpec);
        } else {
            measureHorizontal(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* access modifiers changed from: protected */
    public boolean hasDividerBeforeChildAt(int childIndex) {
        if (childIndex == 0) {
            if ((this.mShowDividers & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.mShowDividers & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            for (int i = childIndex - 1; i >= 0; i--) {
                if (getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureVertical(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.mTotalLength = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            r6 = 0
            r14 = 0
            int r15 = r7.mBaselineAlignedChildIndex
            boolean r10 = r7.mUseLargestChild
            r17 = 0
            r18 = 0
            r19 = r14
            r14 = r0
            r0 = r5
            r5 = r2
            r2 = r18
            r18 = r6
            r6 = r1
            r37 = r4
            r4 = r3
            r3 = r17
            r17 = r37
        L_0x0036:
            r20 = r4
            r1 = 8
            r22 = 1
            r23 = 0
            if (r2 >= r11) goto L_0x01bf
            android.view.View r4 = r7.getVirtualChildAt(r2)
            if (r4 != 0) goto L_0x0058
            int r1 = r7.mTotalLength
            int r21 = r7.measureNullChild(r2)
            int r1 = r1 + r21
            r7.mTotalLength = r1
            r31 = r11
            r26 = r13
            r4 = r20
            goto L_0x01b3
        L_0x0058:
            r26 = r3
            int r3 = r4.getVisibility()
            if (r3 != r1) goto L_0x006f
            int r1 = r7.getChildrenSkipCount(r4, r2)
            int r2 = r2 + r1
            r31 = r11
            r4 = r20
            r3 = r26
            r26 = r13
            goto L_0x01b3
        L_0x006f:
            boolean r1 = r7.hasDividerBeforeChildAt(r2)
            if (r1 == 0) goto L_0x007c
            int r1 = r7.mTotalLength
            int r3 = r7.mDividerHeight
            int r1 = r1 + r3
            r7.mTotalLength = r1
        L_0x007c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r3 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r1 = r3.weight
            float r27 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00bb
            int r0 = r3.height
            if (r0 != 0) goto L_0x00bb
            float r0 = r3.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            int r0 = r7.mTotalLength
            int r1 = r3.topMargin
            int r1 = r1 + r0
            r28 = r2
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
            r19 = 1
            r32 = r5
            r33 = r6
            r31 = r11
            r21 = r20
            r2 = r26
            r25 = r28
            r11 = 1073741824(0x40000000, float:2.0)
            r26 = r13
            r13 = r3
            r3 = r4
            goto L_0x012e
        L_0x00bb:
            r28 = r2
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r3.height
            if (r1 != 0) goto L_0x00cf
            float r1 = r3.weight
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cf
            r0 = 0
            r1 = -2
            r3.height = r1
            r2 = r0
            goto L_0x00d0
        L_0x00cf:
            r2 = r0
        L_0x00d0:
            r29 = 0
            int r0 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x00db
            int r0 = r7.mTotalLength
            r30 = r0
            goto L_0x00dd
        L_0x00db:
            r30 = 0
        L_0x00dd:
            r0 = r38
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r8 = r2
            r25 = r28
            r2 = r25
            r9 = r26
            r26 = r13
            r13 = r3
            r3 = r39
            r31 = r11
            r21 = r20
            r11 = 1073741824(0x40000000, float:2.0)
            r20 = r4
            r4 = r29
            r32 = r5
            r5 = r40
            r33 = r6
            r6 = r30
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x010b
            r13.height = r8
        L_0x010b:
            int r0 = r20.getMeasuredHeight()
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = r20
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r2 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r2
            if (r10 == 0) goto L_0x012d
            int r2 = java.lang.Math.max(r0, r9)
            goto L_0x012e
        L_0x012d:
            r2 = r9
        L_0x012e:
            if (r15 < 0) goto L_0x013b
            r4 = r25
            int r0 = r4 + 1
            if (r15 != r0) goto L_0x013d
            int r0 = r7.mTotalLength
            r7.mBaselineChildTop = r0
            goto L_0x013d
        L_0x013b:
            r4 = r25
        L_0x013d:
            if (r4 >= r15) goto L_0x014e
            float r0 = r13.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            goto L_0x014e
        L_0x0146:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x014e:
            r0 = 0
            if (r12 == r11) goto L_0x0159
            int r1 = r13.width
            r5 = -1
            if (r1 != r5) goto L_0x0159
            r18 = 1
            r0 = 1
        L_0x0159:
            int r1 = r13.leftMargin
            int r5 = r13.rightMargin
            int r1 = r1 + r5
            int r5 = r3.getMeasuredWidth()
            int r5 = r5 + r1
            int r6 = java.lang.Math.max(r14, r5)
            int r8 = r3.getMeasuredState()
            r9 = r33
            int r8 = android.view.View.combineMeasuredStates(r9, r8)
            if (r17 == 0) goto L_0x017b
            int r9 = r13.width
            r11 = -1
            if (r9 != r11) goto L_0x017b
            r9 = 1
            goto L_0x017c
        L_0x017b:
            r9 = 0
        L_0x017c:
            float r11 = r13.weight
            int r11 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r11 <= 0) goto L_0x0192
            if (r0 == 0) goto L_0x0187
            r11 = r1
            goto L_0x0188
        L_0x0187:
            r11 = r5
        L_0x0188:
            r14 = r21
            int r11 = java.lang.Math.max(r14, r11)
            r20 = r1
            r14 = r11
            goto L_0x01a3
        L_0x0192:
            r14 = r21
            if (r0 == 0) goto L_0x0198
            r11 = r1
            goto L_0x0199
        L_0x0198:
            r11 = r5
        L_0x0199:
            r20 = r1
            r1 = r32
            int r1 = java.lang.Math.max(r1, r11)
            r32 = r1
        L_0x01a3:
            int r1 = r7.getChildrenSkipCount(r3, r4)
            int r1 = r1 + r4
            r3 = r2
            r17 = r9
            r4 = r14
            r0 = r27
            r5 = r32
            r2 = r1
            r14 = r6
            r6 = r8
        L_0x01b3:
            int r2 = r2 + 1
            r8 = r39
            r9 = r40
            r13 = r26
            r11 = r31
            goto L_0x0036
        L_0x01bf:
            r4 = r2
            r9 = r3
            r1 = r5
            r31 = r11
            r26 = r13
            r3 = r20
            r2 = 8
            r11 = 1073741824(0x40000000, float:2.0)
            int r4 = r7.mTotalLength
            if (r4 <= 0) goto L_0x01e0
            r4 = r31
            boolean r5 = r7.hasDividerBeforeChildAt(r4)
            if (r5 == 0) goto L_0x01e2
            int r5 = r7.mTotalLength
            int r8 = r7.mDividerHeight
            int r5 = r5 + r8
            r7.mTotalLength = r5
            goto L_0x01e2
        L_0x01e0:
            r4 = r31
        L_0x01e2:
            if (r10 == 0) goto L_0x0244
            r5 = r26
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r8) goto L_0x01f0
            if (r5 != 0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r33 = r6
            goto L_0x0248
        L_0x01f0:
            r8 = 0
            r7.mTotalLength = r8
            r8 = 0
        L_0x01f4:
            if (r8 >= r4) goto L_0x0241
            android.view.View r13 = r7.getVirtualChildAt(r8)
            if (r13 != 0) goto L_0x0209
            int r11 = r7.mTotalLength
            int r20 = r7.measureNullChild(r8)
            int r11 = r11 + r20
            r7.mTotalLength = r11
            r33 = r6
            goto L_0x0238
        L_0x0209:
            int r11 = r13.getVisibility()
            if (r11 != r2) goto L_0x0217
            int r11 = r7.getChildrenSkipCount(r13, r8)
            int r8 = r8 + r11
            r33 = r6
            goto L_0x0238
        L_0x0217:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r2 = r7.mTotalLength
            int r21 = r2 + r9
            r33 = r6
            int r6 = r11.topMargin
            int r21 = r21 + r6
            int r6 = r11.bottomMargin
            int r21 = r21 + r6
            int r6 = r7.getNextLocationOffset(r13)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r2, r6)
            r7.mTotalLength = r6
        L_0x0238:
            int r8 = r8 + 1
            r6 = r33
            r2 = 8
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f4
        L_0x0241:
            r33 = r6
            goto L_0x0248
        L_0x0244:
            r33 = r6
            r5 = r26
        L_0x0248:
            int r2 = r7.mTotalLength
            int r6 = r38.getPaddingTop()
            int r8 = r38.getPaddingBottom()
            int r6 = r6 + r8
            int r2 = r2 + r6
            r7.mTotalLength = r2
            int r2 = r7.mTotalLength
            int r6 = r38.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r40
            r8 = r9
            r9 = 0
            int r11 = android.view.View.resolveSizeAndState(r2, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r11 & r9
            int r9 = r7.mTotalLength
            int r9 = r2 - r9
            if (r19 != 0) goto L_0x0305
            if (r9 == 0) goto L_0x0281
            int r13 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r13 <= 0) goto L_0x0281
            r21 = r0
            r26 = r2
            r27 = r3
            goto L_0x030b
        L_0x0281:
            int r1 = java.lang.Math.max(r1, r3)
            if (r10 == 0) goto L_0x02ec
            r13 = 1073741824(0x40000000, float:2.0)
            if (r5 == r13) goto L_0x02ec
            r13 = 0
        L_0x028c:
            if (r13 >= r4) goto L_0x02e3
            r21 = r0
            android.view.View r0 = r7.getVirtualChildAt(r13)
            if (r0 == 0) goto L_0x02d2
            r16 = r1
            int r1 = r0.getVisibility()
            r26 = r2
            r2 = 8
            if (r1 != r2) goto L_0x02a5
            r27 = r3
            goto L_0x02d8
        L_0x02a5:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            float r2 = r1.weight
            int r22 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r22 <= 0) goto L_0x02cb
            r22 = r1
            int r1 = r0.getMeasuredWidth()
            r24 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r27 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            r0.measure(r1, r3)
            goto L_0x02d8
        L_0x02cb:
            r22 = r1
            r24 = r2
            r27 = r3
            goto L_0x02d8
        L_0x02d2:
            r16 = r1
            r26 = r2
            r27 = r3
        L_0x02d8:
            int r13 = r13 + 1
            r1 = r16
            r0 = r21
            r2 = r26
            r3 = r27
            goto L_0x028c
        L_0x02e3:
            r21 = r0
            r16 = r1
            r26 = r2
            r27 = r3
            goto L_0x02f4
        L_0x02ec:
            r21 = r0
            r16 = r1
            r26 = r2
            r27 = r3
        L_0x02f4:
            r13 = r39
            r34 = r5
            r28 = r8
            r5 = r9
            r29 = r10
            r30 = r15
            r1 = r16
            r9 = r33
            goto L_0x043e
        L_0x0305:
            r21 = r0
            r26 = r2
            r27 = r3
        L_0x030b:
            float r0 = r7.mWeightSum
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 <= 0) goto L_0x0312
            goto L_0x0314
        L_0x0312:
            r0 = r21
        L_0x0314:
            r2 = 0
            r7.mTotalLength = r2
            r3 = 0
            r13 = r9
            r9 = r33
        L_0x031b:
            if (r3 >= r4) goto L_0x0424
            android.view.View r2 = r7.getVirtualChildAt(r3)
            r28 = r8
            int r8 = r2.getVisibility()
            r29 = r10
            r10 = 8
            if (r8 != r10) goto L_0x0337
            r34 = r5
            r33 = r13
            r30 = r15
            r13 = r39
            goto L_0x0415
        L_0x0337:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            float r10 = r8.weight
            int r30 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r30 <= 0) goto L_0x03af
            r30 = r15
            float r15 = (float) r13
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r13 = r13 - r15
            int r31 = r38.getPaddingLeft()
            int r32 = r38.getPaddingRight()
            int r31 = r31 + r32
            r32 = r0
            int r0 = r8.leftMargin
            int r31 = r31 + r0
            int r0 = r8.rightMargin
            int r0 = r31 + r0
            r31 = r10
            int r10 = r8.width
            r33 = r13
            r13 = r39
            int r0 = getChildMeasureSpec(r13, r0, r10)
            int r10 = r8.height
            if (r10 != 0) goto L_0x038a
            r10 = 1073741824(0x40000000, float:2.0)
            if (r5 == r10) goto L_0x0378
            r34 = r5
            goto L_0x038c
        L_0x0378:
            r34 = r5
            if (r15 <= 0) goto L_0x037f
            r5 = r15
            goto L_0x0380
        L_0x037f:
            r5 = 0
        L_0x0380:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r2.measure(r0, r5)
            r35 = r15
            goto L_0x03a1
        L_0x038a:
            r34 = r5
        L_0x038c:
            int r5 = r2.getMeasuredHeight()
            int r5 = r5 + r15
            if (r5 >= 0) goto L_0x0394
            r5 = 0
        L_0x0394:
            r35 = r15
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r2.measure(r0, r15)
        L_0x03a1:
            int r5 = r2.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r5)
            r0 = r32
            goto L_0x03ba
        L_0x03af:
            r34 = r5
            r31 = r10
            r5 = r13
            r30 = r15
            r13 = r39
            r33 = r5
        L_0x03ba:
            int r5 = r8.leftMargin
            int r10 = r8.rightMargin
            int r5 = r5 + r10
            int r10 = r2.getMeasuredWidth()
            int r10 = r10 + r5
            int r14 = java.lang.Math.max(r14, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x03d5
            int r15 = r8.width
            r32 = r0
            r0 = -1
            if (r15 != r0) goto L_0x03d7
            r0 = 1
            goto L_0x03d8
        L_0x03d5:
            r32 = r0
        L_0x03d7:
            r0 = 0
        L_0x03d8:
            if (r0 == 0) goto L_0x03dd
            r15 = r5
            goto L_0x03de
        L_0x03dd:
            r15 = r10
        L_0x03de:
            int r1 = java.lang.Math.max(r1, r15)
            if (r17 == 0) goto L_0x03ed
            int r15 = r8.width
            r35 = r0
            r0 = -1
            if (r15 != r0) goto L_0x03f0
            r15 = 1
            goto L_0x03f1
        L_0x03ed:
            r35 = r0
            r0 = -1
        L_0x03f0:
            r15 = 0
        L_0x03f1:
            int r0 = r7.mTotalLength
            int r17 = r2.getMeasuredHeight()
            int r17 = r0 + r17
            r36 = r1
            int r1 = r8.topMargin
            int r17 = r17 + r1
            int r1 = r8.bottomMargin
            int r17 = r17 + r1
            int r1 = r7.getNextLocationOffset(r2)
            int r1 = r17 + r1
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
            r17 = r15
            r0 = r32
            r1 = r36
        L_0x0415:
            int r3 = r3 + 1
            r8 = r28
            r10 = r29
            r15 = r30
            r13 = r33
            r5 = r34
            r2 = 0
            goto L_0x031b
        L_0x0424:
            r34 = r5
            r28 = r8
            r29 = r10
            r5 = r13
            r30 = r15
            r13 = r39
            int r2 = r7.mTotalLength
            int r3 = r38.getPaddingTop()
            int r8 = r38.getPaddingBottom()
            int r3 = r3 + r8
            int r2 = r2 + r3
            r7.mTotalLength = r2
        L_0x043e:
            if (r17 != 0) goto L_0x0445
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0445
            r14 = r1
        L_0x0445:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r0 = r0 + r2
            int r14 = r14 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r14, r0)
            int r2 = android.view.View.resolveSizeAndState(r0, r13, r9)
            r7.setMeasuredDimension(r2, r11)
            if (r18 == 0) goto L_0x0463
            r7.forceUniformWidth(r4, r6)
        L_0x0463:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    private void forceUniformWidth(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY);
        for (int i = 0; i < count; i++) {
            View child = getVirtualChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                if (lp.width == -1) {
                    int oldHeight = lp.height;
                    lp.height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    lp.height = oldHeight;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0642  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int r49, int r50) {
        /*
            r48 = this;
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = 0
            r7.mTotalLength = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r48.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r49)
            int r13 = android.view.View.MeasureSpec.getMode(r50)
            r6 = 0
            r14 = 0
            int[] r15 = r7.mMaxAscent
            if (r15 == 0) goto L_0x0025
            int[] r15 = r7.mMaxDescent
            if (r15 != 0) goto L_0x002e
        L_0x0025:
            r15 = 4
            int[] r10 = new int[r15]
            r7.mMaxAscent = r10
            int[] r10 = new int[r15]
            r7.mMaxDescent = r10
        L_0x002e:
            int[] r10 = r7.mMaxAscent
            int[] r15 = r7.mMaxDescent
            r17 = 3
            r18 = r6
            r6 = -1
            r10[r17] = r6
            r19 = 2
            r10[r19] = r6
            r20 = 1
            r10[r20] = r6
            r16 = 0
            r10[r16] = r6
            r15[r17] = r6
            r15[r19] = r6
            r15[r20] = r6
            r15[r16] = r6
            boolean r6 = r7.mBaselineAligned
            r22 = r14
            boolean r14 = r7.mUseLargestChild
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 != r9) goto L_0x005a
            r23 = 1
            goto L_0x005c
        L_0x005a:
            r23 = 0
        L_0x005c:
            r24 = 0
            r25 = 0
            r9 = r25
            r45 = r5
            r5 = r0
            r0 = r45
            r46 = r4
            r4 = r1
            r1 = r24
            r24 = r22
            r22 = r18
            r18 = r46
            r47 = r3
            r3 = r2
            r2 = r47
        L_0x0077:
            r28 = 0
            if (r9 >= r11) goto L_0x0260
            android.view.View r8 = r7.getVirtualChildAt(r9)
            if (r8 != 0) goto L_0x0097
            r30 = r1
            int r1 = r7.mTotalLength
            int r26 = r7.measureNullChild(r9)
            int r1 = r1 + r26
            r7.mTotalLength = r1
            r21 = r6
            r31 = r11
            r1 = r30
            r30 = r12
            goto L_0x0254
        L_0x0097:
            r30 = r1
            int r1 = r8.getVisibility()
            r31 = r2
            r2 = 8
            if (r1 != r2) goto L_0x00b4
            int r1 = r7.getChildrenSkipCount(r8, r9)
            int r9 = r9 + r1
            r21 = r6
            r1 = r30
            r2 = r31
            r31 = r11
            r30 = r12
            goto L_0x0254
        L_0x00b4:
            boolean r1 = r7.hasDividerBeforeChildAt(r9)
            if (r1 == 0) goto L_0x00c1
            int r1 = r7.mTotalLength
            int r2 = r7.mDividerWidth
            int r1 = r1 + r2
            r7.mTotalLength = r1
        L_0x00c1:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r1 = r2.weight
            float r29 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 != r0) goto L_0x012c
            int r0 = r2.width
            if (r0 != 0) goto L_0x012c
            float r0 = r2.weight
            int r0 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            if (r23 == 0) goto L_0x00ea
            int r0 = r7.mTotalLength
            int r1 = r2.leftMargin
            r32 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = r0 + r1
            r7.mTotalLength = r0
            goto L_0x00fa
        L_0x00ea:
            r32 = r3
            int r0 = r7.mTotalLength
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r0, r1)
            r7.mTotalLength = r1
        L_0x00fa:
            if (r6 == 0) goto L_0x0117
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L_0x01b6
        L_0x0117:
            r24 = 1
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L_0x01b6
        L_0x012c:
            r32 = r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.width
            if (r1 != 0) goto L_0x0140
            float r1 = r2.weight
            int r1 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x0140
            r0 = 0
            r1 = -2
            r2.width = r1
            r3 = r0
            goto L_0x0141
        L_0x0140:
            r3 = r0
        L_0x0141:
            int r0 = (r29 > r28 ? 1 : (r29 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x014b
            int r0 = r7.mTotalLength
            r33 = r0
            goto L_0x014d
        L_0x014b:
            r33 = 0
        L_0x014d:
            r34 = 0
            r0 = r48
            r35 = r30
            r1 = r8
            r37 = r2
            r36 = r31
            r2 = r9
            r39 = r3
            r38 = r32
            r3 = r49
            r40 = r4
            r4 = r33
            r30 = r12
            r12 = r5
            r5 = r50
            r21 = r6
            r31 = r11
            r11 = -1
            r6 = r34
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r39
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x017d
            r1 = r37
            r1.width = r0
            goto L_0x017f
        L_0x017d:
            r1 = r37
        L_0x017f:
            int r2 = r8.getMeasuredWidth()
            if (r23 == 0) goto L_0x0196
            int r3 = r7.mTotalLength
            int r4 = r1.leftMargin
            int r4 = r4 + r2
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getNextLocationOffset(r8)
            int r4 = r4 + r5
            int r3 = r3 + r4
            r7.mTotalLength = r3
            goto L_0x01ab
        L_0x0196:
            int r3 = r7.mTotalLength
            int r4 = r3 + r2
            int r5 = r1.leftMargin
            int r4 = r4 + r5
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.getNextLocationOffset(r8)
            int r4 = r4 + r5
            int r4 = java.lang.Math.max(r3, r4)
            r7.mTotalLength = r4
        L_0x01ab:
            if (r14 == 0) goto L_0x01b4
            r3 = r35
            int r3 = java.lang.Math.max(r2, r3)
            goto L_0x01b6
        L_0x01b4:
            r3 = r35
        L_0x01b6:
            r0 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x01c2
            int r2 = r1.height
            if (r2 != r11) goto L_0x01c2
            r22 = 1
            r0 = 1
        L_0x01c2:
            int r2 = r1.topMargin
            int r4 = r1.bottomMargin
            int r2 = r2 + r4
            int r4 = r8.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r8.getMeasuredState()
            r6 = r40
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r21 == 0) goto L_0x020d
            int r6 = r8.getBaseline()
            if (r6 == r11) goto L_0x0208
            int r11 = r1.gravity
            if (r11 >= 0) goto L_0x01e5
            int r11 = r7.mGravity
            goto L_0x01e7
        L_0x01e5:
            int r11 = r1.gravity
        L_0x01e7:
            r11 = r11 & 112(0x70, float:1.57E-43)
            int r26 = r11 >> 4
            r27 = -2
            r26 = r26 & -2
            int r26 = r26 >> 1
            r27 = r2
            r2 = r10[r26]
            int r2 = java.lang.Math.max(r2, r6)
            r10[r26] = r2
            r2 = r15[r26]
            r33 = r3
            int r3 = r4 - r6
            int r2 = java.lang.Math.max(r2, r3)
            r15[r26] = r2
            goto L_0x0211
        L_0x0208:
            r27 = r2
            r33 = r3
            goto L_0x0211
        L_0x020d:
            r27 = r2
            r33 = r3
        L_0x0211:
            int r2 = java.lang.Math.max(r12, r4)
            if (r18 == 0) goto L_0x021e
            int r3 = r1.height
            r6 = -1
            if (r3 != r6) goto L_0x021e
            r3 = 1
            goto L_0x021f
        L_0x021e:
            r3 = 0
        L_0x021f:
            float r6 = r1.weight
            int r6 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r6 <= 0) goto L_0x0233
            if (r0 == 0) goto L_0x022b
            r6 = r27
            goto L_0x022c
        L_0x022b:
            r6 = r4
        L_0x022c:
            r11 = r36
            int r6 = java.lang.Math.max(r11, r6)
            goto L_0x0244
        L_0x0233:
            r11 = r36
            if (r0 == 0) goto L_0x023a
            r6 = r27
            goto L_0x023b
        L_0x023a:
            r6 = r4
        L_0x023b:
            r12 = r38
            int r6 = java.lang.Math.max(r12, r6)
            r38 = r6
            r6 = r11
        L_0x0244:
            int r11 = r7.getChildrenSkipCount(r8, r9)
            int r9 = r9 + r11
            r18 = r3
            r4 = r5
            r0 = r29
            r1 = r33
            r3 = r38
            r5 = r2
            r2 = r6
        L_0x0254:
            int r9 = r9 + 1
            r8 = r49
            r6 = r21
            r12 = r30
            r11 = r31
            goto L_0x0077
        L_0x0260:
            r21 = r6
            r31 = r11
            r30 = r12
            r11 = r2
            r2 = r3
            r6 = r4
            r12 = r5
            r3 = r1
            int r1 = r7.mTotalLength
            if (r1 <= 0) goto L_0x027f
            r1 = r31
            boolean r4 = r7.hasDividerBeforeChildAt(r1)
            if (r4 == 0) goto L_0x0281
            int r4 = r7.mTotalLength
            int r5 = r7.mDividerWidth
            int r4 = r4 + r5
            r7.mTotalLength = r4
            goto L_0x0281
        L_0x027f:
            r1 = r31
        L_0x0281:
            r4 = r10[r20]
            r5 = -1
            if (r4 != r5) goto L_0x0298
            r4 = 0
            r8 = r10[r4]
            if (r8 != r5) goto L_0x0298
            r4 = r10[r19]
            if (r4 != r5) goto L_0x0298
            r4 = r10[r17]
            if (r4 == r5) goto L_0x0294
            goto L_0x0298
        L_0x0294:
            r40 = r6
            r5 = r12
            goto L_0x02cb
        L_0x0298:
            r4 = r10[r17]
            r5 = 0
            r8 = r10[r5]
            r9 = r10[r20]
            r5 = r10[r19]
            int r5 = java.lang.Math.max(r9, r5)
            int r5 = java.lang.Math.max(r8, r5)
            int r4 = java.lang.Math.max(r4, r5)
            r5 = r15[r17]
            r8 = 0
            r9 = r15[r8]
            r8 = r15[r20]
            r40 = r6
            r6 = r15[r19]
            int r6 = java.lang.Math.max(r8, r6)
            int r6 = java.lang.Math.max(r9, r6)
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r4 + r5
            int r6 = java.lang.Math.max(r12, r6)
            r5 = r6
        L_0x02cb:
            if (r14 == 0) goto L_0x0347
            r4 = r30
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r6) goto L_0x02da
            if (r4 != 0) goto L_0x02d6
            goto L_0x02da
        L_0x02d6:
            r26 = r5
            goto L_0x034b
        L_0x02da:
            r6 = 0
            r7.mTotalLength = r6
            r6 = 0
        L_0x02de:
            if (r6 >= r1) goto L_0x0342
            android.view.View r8 = r7.getVirtualChildAt(r6)
            if (r8 != 0) goto L_0x02f4
            int r9 = r7.mTotalLength
            int r12 = r7.measureNullChild(r6)
            int r9 = r9 + r12
            r7.mTotalLength = r9
            r26 = r5
            r30 = r6
            goto L_0x033b
        L_0x02f4:
            int r9 = r8.getVisibility()
            r12 = 8
            if (r9 != r12) goto L_0x0304
            int r9 = r7.getChildrenSkipCount(r8, r6)
            int r6 = r6 + r9
            r26 = r5
            goto L_0x033d
        L_0x0304:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            if (r23 == 0) goto L_0x0322
            int r12 = r7.mTotalLength
            r26 = r5
            int r5 = r9.leftMargin
            int r5 = r5 + r3
            r30 = r6
            int r6 = r9.rightMargin
            int r5 = r5 + r6
            int r6 = r7.getNextLocationOffset(r8)
            int r5 = r5 + r6
            int r12 = r12 + r5
            r7.mTotalLength = r12
            goto L_0x033b
        L_0x0322:
            r26 = r5
            r30 = r6
            int r5 = r7.mTotalLength
            int r6 = r5 + r3
            int r12 = r9.leftMargin
            int r6 = r6 + r12
            int r12 = r9.rightMargin
            int r6 = r6 + r12
            int r12 = r7.getNextLocationOffset(r8)
            int r6 = r6 + r12
            int r6 = java.lang.Math.max(r5, r6)
            r7.mTotalLength = r6
        L_0x033b:
            r6 = r30
        L_0x033d:
            int r6 = r6 + 1
            r5 = r26
            goto L_0x02de
        L_0x0342:
            r26 = r5
            r30 = r6
            goto L_0x034b
        L_0x0347:
            r26 = r5
            r4 = r30
        L_0x034b:
            int r5 = r7.mTotalLength
            int r6 = r48.getPaddingLeft()
            int r8 = r48.getPaddingRight()
            int r6 = r6 + r8
            int r5 = r5 + r6
            r7.mTotalLength = r5
            int r5 = r7.mTotalLength
            int r6 = r48.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r5, r6)
            r6 = r49
            r8 = 0
            int r9 = android.view.View.resolveSizeAndState(r5, r6, r8)
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r9 & r8
            int r8 = r7.mTotalLength
            int r8 = r5 - r8
            if (r24 != 0) goto L_0x0419
            if (r8 == 0) goto L_0x0386
            int r30 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r30 <= 0) goto L_0x0386
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0422
        L_0x0386:
            int r2 = java.lang.Math.max(r2, r11)
            if (r14 == 0) goto L_0x03f9
            r12 = 1073741824(0x40000000, float:2.0)
            if (r4 == r12) goto L_0x03f9
            r12 = 0
        L_0x0391:
            if (r12 >= r1) goto L_0x03ee
            r31 = r0
            android.view.View r0 = r7.getVirtualChildAt(r12)
            if (r0 == 0) goto L_0x03db
            r16 = r2
            int r2 = r0.getVisibility()
            r33 = r5
            r5 = 8
            if (r2 != r5) goto L_0x03ac
            r35 = r3
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x03e3
        L_0x03ac:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r5 = r2.weight
            int r17 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1))
            if (r17 <= 0) goto L_0x03d2
            r17 = r2
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r35 = r3
            int r3 = r0.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r0.measure(r5, r3)
            goto L_0x03e3
        L_0x03d2:
            r17 = r2
            r35 = r3
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x03e3
        L_0x03db:
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x03e3:
            int r12 = r12 + 1
            r2 = r16
            r0 = r31
            r5 = r33
            r3 = r35
            goto L_0x0391
        L_0x03ee:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0403
        L_0x03f9:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0403:
            r12 = r50
            r34 = r1
            r25 = r9
            r36 = r11
            r2 = r16
            r5 = r26
            r26 = r14
            r45 = r40
            r40 = r4
            r4 = r45
            goto L_0x0611
        L_0x0419:
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0422:
            float r0 = r7.mWeightSum
            int r5 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r5 <= 0) goto L_0x0429
            goto L_0x042b
        L_0x0429:
            r0 = r31
        L_0x042b:
            r5 = -1
            r10[r17] = r5
            r10[r19] = r5
            r10[r20] = r5
            r12 = 0
            r10[r12] = r5
            r15[r17] = r5
            r15[r19] = r5
            r15[r20] = r5
            r15[r12] = r5
            r5 = -1
            r7.mTotalLength = r12
            r12 = 0
            r2 = r12
            r12 = r8
            r8 = r5
            r5 = r40
        L_0x0446:
            if (r2 >= r1) goto L_0x05ae
            r36 = r11
            android.view.View r11 = r7.getVirtualChildAt(r2)
            if (r11 == 0) goto L_0x0590
            r26 = r14
            int r14 = r11.getVisibility()
            r34 = r1
            r1 = 8
            if (r14 != r1) goto L_0x0467
            r40 = r4
            r25 = r9
            r1 = r12
            r27 = -2
            r12 = r50
            goto L_0x059d
        L_0x0467:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            float r1 = r14.weight
            int r37 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r37 <= 0) goto L_0x04db
            float r6 = (float) r12
            float r6 = r6 * r1
            float r6 = r6 / r0
            int r6 = (int) r6
            float r0 = r0 - r1
            int r12 = r12 - r6
            int r37 = r48.getPaddingTop()
            int r38 = r48.getPaddingBottom()
            int r37 = r37 + r38
            r38 = r0
            int r0 = r14.topMargin
            int r37 = r37 + r0
            int r0 = r14.bottomMargin
            int r0 = r37 + r0
            r37 = r1
            int r1 = r14.height
            r25 = r9
            r39 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
            int r0 = getChildMeasureSpec(r12, r0, r1)
            int r1 = r14.width
            if (r1 != 0) goto L_0x04b7
            if (r4 == r9) goto L_0x04a7
            goto L_0x04b7
        L_0x04a7:
            if (r6 <= 0) goto L_0x04ac
            r1 = r6
            goto L_0x04ad
        L_0x04ac:
            r1 = 0
        L_0x04ad:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r1, r0)
            r40 = r4
            goto L_0x04ca
        L_0x04b7:
            int r1 = r11.getMeasuredWidth()
            int r1 = r1 + r6
            if (r1 >= 0) goto L_0x04bf
            r1 = 0
        L_0x04bf:
            r40 = r4
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r4, r0)
        L_0x04ca:
            int r1 = r11.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            int r5 = android.view.View.combineMeasuredStates(r5, r1)
            r0 = r38
            r1 = r39
            goto L_0x04e6
        L_0x04db:
            r37 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
        L_0x04e6:
            if (r23 == 0) goto L_0x04fd
            int r4 = r7.mTotalLength
            int r6 = r11.getMeasuredWidth()
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.getNextLocationOffset(r11)
            int r6 = r6 + r9
            int r4 = r4 + r6
            r7.mTotalLength = r4
            goto L_0x0515
        L_0x04fd:
            int r4 = r7.mTotalLength
            int r6 = r11.getMeasuredWidth()
            int r6 = r6 + r4
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.getNextLocationOffset(r11)
            int r6 = r6 + r9
            int r6 = java.lang.Math.max(r4, r6)
            r7.mTotalLength = r6
        L_0x0515:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x0520
            int r4 = r14.height
            r6 = -1
            if (r4 != r6) goto L_0x0520
            r4 = 1
            goto L_0x0521
        L_0x0520:
            r4 = 0
        L_0x0521:
            int r6 = r14.topMargin
            int r9 = r14.bottomMargin
            int r6 = r6 + r9
            int r9 = r11.getMeasuredHeight()
            int r9 = r9 + r6
            int r8 = java.lang.Math.max(r8, r9)
            r39 = r0
            if (r4 == 0) goto L_0x0536
            r0 = r6
            goto L_0x0537
        L_0x0536:
            r0 = r9
        L_0x0537:
            int r0 = java.lang.Math.max(r3, r0)
            if (r18 == 0) goto L_0x0546
            int r3 = r14.height
            r41 = r0
            r0 = -1
            if (r3 != r0) goto L_0x0548
            r0 = 1
            goto L_0x0549
        L_0x0546:
            r41 = r0
        L_0x0548:
            r0 = 0
        L_0x0549:
            if (r21 == 0) goto L_0x0583
            int r3 = r11.getBaseline()
            r18 = r0
            r0 = -1
            if (r3 == r0) goto L_0x057e
            int r0 = r14.gravity
            if (r0 >= 0) goto L_0x055b
            int r0 = r7.mGravity
            goto L_0x055d
        L_0x055b:
            int r0 = r14.gravity
        L_0x055d:
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r42 = r0 >> 4
            r27 = -2
            r42 = r42 & -2
            int r42 = r42 >> 1
            r43 = r0
            r0 = r10[r42]
            int r0 = java.lang.Math.max(r0, r3)
            r10[r42] = r0
            r0 = r15[r42]
            r44 = r1
            int r1 = r9 - r3
            int r0 = java.lang.Math.max(r0, r1)
            r15[r42] = r0
            goto L_0x0589
        L_0x057e:
            r44 = r1
            r27 = -2
            goto L_0x0589
        L_0x0583:
            r18 = r0
            r44 = r1
            r27 = -2
        L_0x0589:
            r0 = r39
            r3 = r41
            r1 = r44
            goto L_0x059d
        L_0x0590:
            r34 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r26 = r14
            r27 = -2
            r12 = r50
        L_0x059d:
            int r2 = r2 + 1
            r6 = r49
            r12 = r1
            r9 = r25
            r14 = r26
            r1 = r34
            r11 = r36
            r4 = r40
            goto L_0x0446
        L_0x05ae:
            r34 = r1
            r40 = r4
            r25 = r9
            r36 = r11
            r1 = r12
            r26 = r14
            r12 = r50
            int r2 = r7.mTotalLength
            int r4 = r48.getPaddingLeft()
            int r6 = r48.getPaddingRight()
            int r4 = r4 + r6
            int r2 = r2 + r4
            r7.mTotalLength = r2
            r2 = r10[r20]
            r4 = -1
            if (r2 != r4) goto L_0x05de
            r2 = 0
            r6 = r10[r2]
            if (r6 != r4) goto L_0x05de
            r2 = r10[r19]
            if (r2 != r4) goto L_0x05de
            r2 = r10[r17]
            if (r2 == r4) goto L_0x05dc
            goto L_0x05de
        L_0x05dc:
            r6 = r8
            goto L_0x060d
        L_0x05de:
            r2 = r10[r17]
            r4 = 0
            r6 = r10[r4]
            r9 = r10[r20]
            r11 = r10[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r6 = java.lang.Math.max(r6, r9)
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r15[r17]
            r4 = r15[r4]
            r9 = r15[r20]
            r11 = r15[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = java.lang.Math.max(r6, r4)
            int r6 = r2 + r4
            int r6 = java.lang.Math.max(r8, r6)
        L_0x060d:
            r8 = r1
            r2 = r3
            r4 = r5
            r5 = r6
        L_0x0611:
            if (r18 != 0) goto L_0x0618
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x0618
            r5 = r2
        L_0x0618:
            int r0 = r48.getPaddingTop()
            int r1 = r48.getPaddingBottom()
            int r0 = r0 + r1
            int r5 = r5 + r0
            int r0 = r48.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r1 = r25 | r1
            int r3 = r4 << 16
            int r3 = android.view.View.resolveSizeAndState(r0, r12, r3)
            r7.setMeasuredDimension(r1, r3)
            if (r22 == 0) goto L_0x0642
            r1 = r49
            r3 = r34
            r7.forceUniformHeight(r3, r1)
            goto L_0x0646
        L_0x0642:
            r1 = r49
            r3 = r34
        L_0x0646:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    private void forceUniformHeight(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), BasicMeasure.EXACTLY);
        for (int i = 0; i < count; i++) {
            View child = getVirtualChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                if (lp.height == -1) {
                    int oldWidth = lp.width;
                    lp.width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    lp.width = oldWidth;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int getChildrenSkipCount(View child, int index) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int measureNullChild(int childIndex) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void measureChildBeforeLayout(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* access modifiers changed from: package-private */
    public int getLocationOffset(View child) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getNextLocationOffset(View child) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.mOrientation == 1) {
            layoutVertical(l, t, r, b);
        } else {
            layoutHorizontal(l, t, r, b);
        }
    }

    /* access modifiers changed from: package-private */
    public void layoutVertical(int left, int top, int right, int bottom) {
        int childTop;
        int paddingLeft;
        int gravity;
        int childLeft;
        int paddingLeft2 = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft2) - getPaddingRight();
        int count = getVirtualChildCount();
        int i = this.mGravity;
        int majorGravity = i & 112;
        int minorGravity = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - this.mTotalLength) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - this.mTotalLength;
        }
        int i2 = 0;
        while (i2 < count) {
            View child = getVirtualChildAt(i2);
            if (child == null) {
                childTop += measureNullChild(i2);
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int gravity2 = lp.gravity;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int layoutDirection = ViewCompat.getLayoutDirection(this);
                int absoluteGravity = GravityCompat.getAbsoluteGravity(gravity, layoutDirection) & 7;
                if (absoluteGravity == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft2) + lp.leftMargin) - lp.rightMargin;
                } else if (absoluteGravity != 5) {
                    childLeft = lp.leftMargin + paddingLeft2;
                } else {
                    childLeft = (childRight - childWidth) - lp.rightMargin;
                }
                if (hasDividerBeforeChildAt(i2) != 0) {
                    childTop += this.mDividerHeight;
                }
                int childTop2 = childTop + lp.topMargin;
                int i3 = layoutDirection;
                int i4 = gravity;
                paddingLeft = paddingLeft2;
                setChildFrame(child, childLeft, childTop2 + getLocationOffset(child), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + lp.bottomMargin + getNextLocationOffset(child);
                i2 += getChildrenSkipCount(child, i2);
                childTop = childTop3;
            } else {
                paddingLeft = paddingLeft2;
            }
            i2++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutHorizontal(int r34, int r35, int r36, int r37) {
        /*
            r33 = this;
            r6 = r33
            boolean r7 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r33)
            int r8 = r33.getPaddingTop()
            int r9 = r37 - r35
            int r0 = r33.getPaddingBottom()
            int r10 = r9 - r0
            int r0 = r9 - r8
            int r1 = r33.getPaddingBottom()
            int r11 = r0 - r1
            int r12 = r33.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r13 = r0 & r1
            r14 = r0 & 112(0x70, float:1.57E-43)
            boolean r15 = r6.mBaselineAligned
            int[] r5 = r6.mMaxAscent
            int[] r4 = r6.mMaxDescent
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r33)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r13, r3)
            r16 = 2
            r2 = 1
            if (r0 == r2) goto L_0x004e
            r1 = 5
            if (r0 == r1) goto L_0x0042
            int r0 = r33.getPaddingLeft()
            goto L_0x005b
        L_0x0042:
            int r0 = r33.getPaddingLeft()
            int r0 = r0 + r36
            int r0 = r0 - r34
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L_0x005b
        L_0x004e:
            int r0 = r33.getPaddingLeft()
            int r1 = r36 - r34
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x005b:
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0067
            int r1 = r12 + -1
            r2 = -1
            r18 = r1
            r19 = r2
            goto L_0x006b
        L_0x0067:
            r18 = r1
            r19 = r2
        L_0x006b:
            r1 = 0
            r2 = r1
        L_0x006d:
            if (r2 >= r12) goto L_0x0177
            int r1 = r19 * r2
            int r1 = r18 + r1
            r20 = r7
            android.view.View r7 = r6.getVirtualChildAt(r1)
            if (r7 != 0) goto L_0x0091
            int r21 = r6.measureNullChild(r1)
            int r0 = r0 + r21
            r22 = r3
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r12
            r21 = 1
            goto L_0x0165
        L_0x0091:
            r21 = r2
            int r2 = r7.getVisibility()
            r22 = r3
            r3 = 8
            if (r2 == r3) goto L_0x0154
            int r23 = r7.getMeasuredWidth()
            int r24 = r7.getMeasuredHeight()
            r2 = -1
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            r25 = r2
            r2 = -1
            if (r15 == 0) goto L_0x00bd
            r26 = r9
            int r9 = r3.height
            if (r9 == r2) goto L_0x00bf
            int r9 = r7.getBaseline()
            goto L_0x00c1
        L_0x00bd:
            r26 = r9
        L_0x00bf:
            r9 = r25
        L_0x00c1:
            int r2 = r3.gravity
            if (r2 >= 0) goto L_0x00c9
            r2 = r14
            r27 = r2
            goto L_0x00cb
        L_0x00c9:
            r27 = r2
        L_0x00cb:
            r2 = r27 & 112(0x70, float:1.57E-43)
            r28 = r12
            r12 = 16
            if (r2 == r12) goto L_0x0107
            r12 = 48
            if (r2 == r12) goto L_0x00f5
            r12 = 80
            if (r2 == r12) goto L_0x00de
            r2 = r8
            r12 = r2
            goto L_0x0114
        L_0x00de:
            int r2 = r10 - r24
            int r12 = r3.bottomMargin
            int r2 = r2 - r12
            r12 = -1
            if (r9 == r12) goto L_0x00f3
            int r12 = r7.getMeasuredHeight()
            int r12 = r12 - r9
            r25 = r4[r16]
            int r25 = r25 - r12
            int r2 = r2 - r25
            r12 = r2
            goto L_0x0114
        L_0x00f3:
            r12 = r2
            goto L_0x0114
        L_0x00f5:
            int r2 = r3.topMargin
            int r2 = r2 + r8
            r12 = -1
            if (r9 == r12) goto L_0x0104
            r12 = 1
            r17 = r5[r12]
            int r17 = r17 - r9
            int r2 = r2 + r17
            r12 = r2
            goto L_0x0114
        L_0x0104:
            r12 = 1
            r12 = r2
            goto L_0x0114
        L_0x0107:
            r12 = 1
            int r2 = r11 - r24
            int r2 = r2 / 2
            int r2 = r2 + r8
            int r12 = r3.topMargin
            int r2 = r2 + r12
            int r12 = r3.bottomMargin
            int r2 = r2 - r12
            r12 = r2
        L_0x0114:
            boolean r2 = r6.hasDividerBeforeChildAt(r1)
            if (r2 == 0) goto L_0x011d
            int r2 = r6.mDividerWidth
            int r0 = r0 + r2
        L_0x011d:
            int r2 = r3.leftMargin
            int r25 = r0 + r2
            int r0 = r6.getLocationOffset(r7)
            int r2 = r25 + r0
            r0 = r33
            r29 = r8
            r8 = r1
            r1 = r7
            r17 = r21
            r21 = 1
            r30 = r9
            r9 = r3
            r3 = r12
            r31 = r4
            r4 = r23
            r32 = r5
            r5 = r24
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r9.rightMargin
            int r0 = r23 + r0
            int r1 = r6.getNextLocationOffset(r7)
            int r0 = r0 + r1
            int r25 = r25 + r0
            int r0 = r6.getChildrenSkipCount(r7, r8)
            int r2 = r17 + r0
            r0 = r25
            goto L_0x0165
        L_0x0154:
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r12
            r17 = r21
            r21 = 1
            r8 = r1
            r2 = r17
        L_0x0165:
            int r2 = r2 + 1
            r7 = r20
            r3 = r22
            r9 = r26
            r12 = r28
            r8 = r29
            r4 = r31
            r5 = r32
            goto L_0x006d
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    private void setChildFrame(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.mOrientation != orientation) {
            this.mOrientation = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int gravity) {
        if (this.mGravity != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= GravityCompat.START;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.mGravity = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i = this.mGravity;
        if ((8388615 & i) != gravity) {
            this.mGravity = (-8388616 & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i = this.mGravity;
        if ((i & 112) != gravity) {
            this.mGravity = (i & -113) | gravity;
            requestLayout();
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.gravity = -1;
            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.LinearLayoutCompat_Layout);
            this.weight = a.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = a.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a.recycle();
        }

        public LayoutParams(int width, int height) {
            super(width, height);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int width, int height, float weight2) {
            super(width, height);
            this.gravity = -1;
            this.weight = weight2;
        }

        public LayoutParams(ViewGroup.LayoutParams p) {
            super(p);
            this.gravity = -1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams source) {
            super(source);
            this.gravity = -1;
            this.weight = source.weight;
            this.gravity = source.gravity;
        }
    }
}
