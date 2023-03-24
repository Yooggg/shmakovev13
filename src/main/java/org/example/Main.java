package org.example;

import org.example.dao.CarEntranceDao;
import org.example.model.CarEntrance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        while (var != 0) {
            switch (var){
                case 1 -> {
                    CarEntrance carEntrance = new CarEntrance();
                    CarEntranceDao carEntranceDao = new CarEntranceDao();

                    System.out.println("Введите номер автомобиля - ");
                    carEntrance.setNumber(scanner.next());
                    System.out.println("Введите дату проезда автомобиля - ");
                    carEntrance.setDate(scanner.next());

                    carEntranceDao.create(carEntrance);
                }
            }
            menu();
            var = scanner.nextInt();
        }
    }

    public static void menu(){
        System.out.println("1 - Добавить данные, 0 - Выход");
    }
}