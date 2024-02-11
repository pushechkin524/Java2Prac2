package org.example; // Объявление пакета

import java.util.Scanner; // Импорт класса Scanner из пакета java.util

public class HaversineDistanceCalculator { // Объявление класса HaversineDistanceCalculator

    public static void main(String[] args) { // Основной метод программы
        Scanner sc = new Scanner(System.in); // Создание объекта Scanner для ввода данных с консоли

        // Пример использования
        // Ввод координат начальной точки
        System.out.println("Введите широту начальной точки: ");
        double FirstCoordinate1 = sc.nextDouble(); // Ввод широты начальной точки
        System.out.println("Введите долготу начальной точки: ");
        double FirstCoordinate2 = sc.nextDouble(); // Ввод долготы начальной точки

        // Ввод координат конечной точки
        System.out.println("Введите широту конечной точки: ");
        double SecondCoordinate1 = sc.nextDouble(); // Ввод широты конечной точки
        System.out.println("Введите долготу конечной точки: ");
        double SecondCoordinate2 = sc.nextDouble(); // Ввод долготы конечной точки

        final double R = 6371; // Радиус Земли в километрах

        // Вычисление разницы между широтами и долготами
        double dLat = Math.toRadians(SecondCoordinate1 - FirstCoordinate1);
        double dLon = Math.toRadians(SecondCoordinate2 - FirstCoordinate2);

        // Вычисление гаверсинусового расстояния
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.cos(Math.toRadians(FirstCoordinate1)) * Math.cos(Math.toRadians(SecondCoordinate1)) *
                        Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;

        // Округление расстояния до трех знаков после запятой
        distance = Math.round(distance * 1000.0) / 1000.0;

        // Вывод расстояния между объектами
        System.out.println("Расстояние между объектами: " + distance + " километров");
    }
}
