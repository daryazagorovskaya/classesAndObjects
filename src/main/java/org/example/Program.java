package org.example;
// 1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//
//Тестовый сценарий для проверки:
//1. Положите деньги на первые две карточки и снимите с третьей.
//2. Выведите на экран текущее состояние всех трех карточек.

public class Program {
    public static void main(String[] args) {

        CreditCard FirstCard = new CreditCard();
        FirstCard.currentSum = 500;
        FirstCard.numberOfAccount = 1;

        CreditCard SecondCard = new CreditCard();
        SecondCard.currentSum = 700;
        SecondCard.numberOfAccount = 2;

        CreditCard ThirdCard = new CreditCard();
        ThirdCard.currentSum = 600;
        ThirdCard.numberOfAccount = 3;

        FirstCard.addMoneyToCard();
        SecondCard.addMoneyToCard();
        ThirdCard.withdrawTheSumFromTheCard();


        FirstCard.displayInfo();
        SecondCard.displayInfo();
        ThirdCard.displayInfo();




    }
    }
