package com.cyclon.com.allstar.Data;

public class Data {
    private String Ans;
    private int Id;
    private String Surname;
    private String opt_1;
    private String opt_2;
    private String opt_3;
    private String opt_4;

    Data(int Id2, String surname, String opt_12, String opt_22, String opt_32, String opt_42, String ans) {
        this.Id = Id2;
        this.Surname = surname;
        this.opt_1 = opt_12;
        this.opt_2 = opt_22;
        this.opt_3 = opt_32;
        this.opt_4 = opt_42;
        this.Ans = ans;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getOpt_1() {
        return this.opt_1;
    }

    public String getOpt_2() {
        return this.opt_2;
    }

    public String getOpt_3() {
        return this.opt_3;
    }

    public String getOpt_4() {
        return this.opt_4;
    }

    public String getAns() {
        return this.Ans;
    }
}
