package com.example.calculator.lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String exit = "";

        while (!exit.equals("exit")) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            if (num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            Integer result = calculator.caculate(num1, num2, operator);

            System.out.println("결과: " + result);
            System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
            exit = sc.next();


        }

    }
}

