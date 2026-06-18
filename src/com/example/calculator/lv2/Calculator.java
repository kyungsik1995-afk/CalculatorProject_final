package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Integer> results = new ArrayList<>();

    public Integer caculate(int num1, int num2, char operator) {

        int result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
            }
            default -> throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
            }

            results.add(result);
            return result;
        }

        public List<Integer> getResults() {
            return results;
    }


    public void removeResult() {
        results.remove(0);
    }

    }

