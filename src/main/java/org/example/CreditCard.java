package org.example;

import java.util.Scanner;

public class CreditCard {
    int numberOfAccount;
    int currentSum;

    void addMoneyToCard () { // позволяет начислять сумму на кредитную  карточку
        System.out.println("Add money to card: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        if (sum > 0)
            sum += currentSum;
        System.out.println(sum);
    }
        void withdrawTheSumFromTheCard () { // позволяет снимать с карточки некоторую сумму
            System.out.println("Withdraw money to card: ");
            Scanner scanner1 = new Scanner(System.in);
            int sum2 = scanner1.nextInt();
            if (sum2 <= currentSum)
             currentSum = currentSum - sum2;
                System.out.println(currentSum);
        }
      void displayInfo () { // выводит текущую информацию о карточке
        System.out.println("Card number: " + numberOfAccount + " Current sum: " + currentSum);

    }



}
