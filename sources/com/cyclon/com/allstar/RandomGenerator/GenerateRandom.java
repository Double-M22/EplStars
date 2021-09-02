package com.cyclon.com.allstar.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GenerateRandom {
    private static Random random = new Random();

    public static List<Integer> getRandomNumbers(int qstSize, int range) {
        List<Integer> randNumbers = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < qstSize) {
            uniqueNumbers.add(Integer.valueOf(random.nextInt(range)));
        }
        for (Integer intValue : uniqueNumbers) {
            randNumbers.add(Integer.valueOf(intValue.intValue()));
        }
        return randNumbers;
    }

    public static List<Integer> getRandomArrangement(int max) {
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> randArrangement = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            numbers.add(Integer.valueOf(i));
        }
        int range = max;
        while (randArrangement.size() < max) {
            int i2 = r.nextInt(range);
            randArrangement.add(numbers.get(i2));
            numbers.remove(i2);
            range--;
        }
        return randArrangement;
    }
}
