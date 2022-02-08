package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Validator validator1 = new Validator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя:");
        String firstName = scanner.next();

        System.out.println("Введите свое фамилия:");
        String secondName = scanner.next();

        System.out.println("Введите свой возраст:");
        int age = scanner.nextInt();
        while (!validator1.checkAge(age)){
            System.out.println("Введите свой возраст:");
            age = scanner.nextInt();
        }

        System.out.println("Введите ваш пол(М/Ж)");
        String gender = scanner.next();
        while (!validator1.checkGender(gender)){
            System.out.println("Введите свой пол:");
            gender = scanner.next();
        }

        System.out.println("Введите свою дату рождения[dd/mm/yyyy]:");
        String dateOfBirth = scanner.next();
        while (!validator1.checkDateOfBirth(dateOfBirth)){
            System.out.println("Введите свою дату рождения[dd/mm/yyyy]:");
            dateOfBirth = scanner.next();
        }

        System.out.println("Введите свой пароль:");
        String password = scanner.next();
        while (!validator1.checkPassword(password)){
            System.out.println("Введите свой пароль:");
            password = scanner.next();
        }

        User user111 = new User(firstName, secondName, age, gender, password, dateOfBirth);
        user111.print();
    }
}
