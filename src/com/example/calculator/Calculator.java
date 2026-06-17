package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<Integer> results = new ArrayList<>();

    public Integer caculate(int num1, int num2, char operator) {

        int result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("지원하지 않는 연산자입니다.");
                return;
            }
        }

    }

}
