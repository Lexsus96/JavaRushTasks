package com.javarush.task.task20.task2025;

import java.util.*;

/* 
Алгоритмы-числа
*/
public class Solution {
    static ArrayList<ArrayList<Long>> pows;
    
    public static long[] getNumbers(long N) {
        if (N <= 0) return new long[0];

        TreeSet<Long> list = new TreeSet<>();
        addFirstNumbers(list, N);

        int pow = (int) stringSize(N);
        pows = new ArrayList<>(pow);
        calculatePows(pow);
        
        int[] number = new int[pow];
        Arrays.fill(number, 9);
        while (number[number.length - 1] != 0) {
            ArrayList<Long> sum = calculateSum(number);
            HashSet<Long> goodSum;
            if (! (goodSum = checkNumber(number, sum)).isEmpty()) {
                for (long yy: goodSum) {
                    if (yy < N) {
                        list.add(yy);
                    }
                }

            }
            minus(number);
        }
        return makeResult(list);
    }
    public static void addFirstNumbers (TreeSet<Long> list, long N) {
        for (int i = 1; i < (N>10?10:N); i++) {
            list.add((long) i);
        }
    }
    public static ArrayList<Long> calculateSum (int[] number) {
        long sum = 0;
        int zeros = 0;
        int i = 0;
        while(i < number.length && number[i++] == 0) zeros++;
        ArrayList<Long> result = new ArrayList<>();
        for (int j = number.length - zeros; j <= number.length; j++) {
            sum = 0;
            for (int n : number) {
                sum += pows.get(j - 1).get(n);
            }
            if (stringSize(sum) == j) {
                result.add(sum);
                result.add((long) j);
            }
        }
        return result;
    }
    public static HashSet<Long> checkNumber(int[] number, ArrayList<Long> sums) {
        HashSet<Long> result = new HashSet<>();
        for (int z = 0; z < sums.size(); z += 2) {
            long currentSum = sums.get(z);
            if (currentSum == 4150) {
                z++;
                z--;
            }
            long p = sums.get(z + 1);
            long sum = currentSum;
            if (sum <= 0) continue;
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i : number) {
                list.add(i);
            }
            boolean isSum = true;
            while (sum > 0) {
                int k = (int) (sum % 10);
                if (list.contains(k)) {
                    list.remove(new Integer(k));
                } else {
                    isSum = false;
                    break;
                }
                sum /= 10;
            }
            if (isSum) {
                for (int i : list) {
                    if (i != 0) {
                        isSum = false;
                        break;
                    }
                }
            }
            if (isSum) {
                result.add(currentSum);
            }
        }
        return result;
    }

    public static void minus(int[] number) {
        int i = 0;
        while (i < number.length && number[i] == 0) {
            i++;
        }
        if (i == 0) {
            number[i]--;
        } else if (i < number.length) {
            number[i]--;
            for (int j = 0; j < i; j++) {
                number[j] = number[i];
            }
        }
    }
    public static void calculatePows(int pow) {
        if (pows != null && pow <= pows.size()) return;
        for (int i = 1; i < pow + 1; i++) {
            ArrayList<Long> newPows = new ArrayList<>(10);
            newPows.add((long) 0);
            newPows.add((long) 1);
            if (i > 1) {
                for (int j = 2; j < 10; j++) {
                    newPows.add(pows.get(i - 2).get(j) * j);
                }
            } else {
                for (int j = 2; j < 10; j++) {
                    newPows.add((long) j);
                }
            }
            pows.add(newPows);
        }
    }
    public static long pow(long i, long j) {
        long sum = 1;
        for (int k = 0; k < j; k++) {
            sum *= i;
        }
        return sum;
    }
    static int stringSize(long x) {
        long p = 10;
        for (int i = 1; i < 19; i++) {
            if (x < p)
                return i;
            p = 10 * p;
        }
        return 19;
    }
    public static long[] makeResult(TreeSet<Long> list) {
        long[] result = new long[list.size()];
        int j = 0;
        for(long i: list) {
            result[j] = i;
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(99)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
