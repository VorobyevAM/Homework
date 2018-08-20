import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int a = 1 + (int) (Math.random()*(100));//Рандомное число от 1 до 100 включительно
        System.out.println("Игра началась!");
        int a1;
        int j = 0;
        int area=0;
        do {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);//Ввод числа с консоли
            String number;//Ввод числа с консоли
            number = scanner.nextLine();//Ввод числа с консоли
            int num = Integer.parseInt(number);//Преобразование введеной строки в число

            a1 = Math.abs(num - a);//Модуль числа для того чтобы определить приближаемся ли мы к загаданному числу или нет
            j++;//Счетчик попыток
            //System.out.println(j);//Счетчик для логики итераций
            if (j==1){
                area=a1;//Запомним значение модуля после первой итерации
            }
            if (j == 1) {
                ////Констатная чтобы определить близко или далеко первое число(если она мень 20, то близко)
                if (a1 < 20) {
                    if (num==a){
                        System.out.println("С победой!!! Ты угадал число.");
                    }
                    else {
                        System.out.println("Тепло!");
                    }
                } else {
                    if (num==a) {
                        System.out.println("С победой!!! Ты угадал число.");
                    }
                    else {
                        System.out.println("Холодно!");
                    }
                }
            }
            else {
                if (area<a1) {if (num==a){System.out.println("С победой!!! Ты угадал число.");
                }
                else {
                    System.out.println("Холоднее!");
                    area = a1;//Присваиваем области новое значение модуля
                }
                }
                else { if (num==a){
                    System.out.println("С победой!!! Ты угадал число.");
                }
                else {
                    System.out.println("Теплее ;) Ты на пути к цели!");
                    area = a1;//Присваиваем области новое значение модуля
                }
                }
            }
        }
        while (a1>0);
    }
}
