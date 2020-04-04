package com.pailsom.leetcode.mock;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Pyramid {
    private static int current = 0;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        StringBuilder output = new StringBuilder();
        List<String> testCasesData = IntStream.range(0, testCases).mapToObj(v -> sc.nextLine()).collect(Collectors.toList());
        testCasesData.forEach(data -> {
            String token[] = data.split(" ");
            int h = Integer.parseInt(token[1]);
            int direction = Integer.parseInt(token[2]);
            String str = token[0];
            int start = 0;
            boolean flag = true;

            for (int i = 1; i <= h; i++) {
                int k = i;
                if (direction == -1) {
                    k = h - i + 1;
                }
                int size = 2 * k - 1;
                IntStream.range(k, h).mapToObj(l -> " ").forEach(System.out::print);

                String displayString = IntStream.range(start, start + size)
                        .mapToObj(value -> Pyramid.getNext(str))
                        .collect(Collectors.joining(""));
                System.out.println(flag ? displayString : new StringBuilder(displayString).reverse().toString());
                start = start + size;
                flag = flag ? false : true;
            }
        });
    }

    private static String getNext(String str) {
        char c = str.charAt(current);
        current = (current + 1) > (str.length() - 1) ? 0 : (current + 1);
        return String.valueOf(c);
    }
}