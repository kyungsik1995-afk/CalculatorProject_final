package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // main 메서드를 깜박하고 작성안하고 앱 클래스 안에 바로 스캐너 객체를 생성하려고 하니 'option + command + v' 단축키가 적용되지 않았다.
        String exit = "";

        while (!exit.equals("exit")) {

            // 양의 정수 (0을 포함)
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

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

            System.out.println("결과: " + result);
            System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
            exit = sc.next();


        }

    }
}
