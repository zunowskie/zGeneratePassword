package ru.zunowskie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("███████╗░██████╗░███████╗███╗░░██╗███████╗██████╗░░█████╗░████████╗███████╗██████╗░░█████╗░░██████╗░██████╗░██╗░░░░░░░██╗░█████╗░");
        System.out.println("╚════██║██╔════╝░██╔════╝████╗░██║██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██╔══██╗██╔══██╗██╔════╝██╔════╝░██║░░██╗░░██║██╔══██╗");
        System.out.println("░░███╔═╝██║░░██╗░█████╗░░██╔██╗██║█████╗░░██████╔╝███████║░░░██║░░░█████╗░░██████╔╝███████║╚█████╗░╚█████╗░░╚██╗████╗██╔╝██║░░██║");
        System.out.println("██╔══╝░░██║░░╚██╗██╔══╝░░██║╚████║██╔══╝░░██╔══██╗██╔══██║░░░██║░░░██╔══╝░░██╔═══╝░██╔══██║░╚═══██╗░╚═══██╗░░████╔═████║░██║░░██║");
        System.out.println("███████╗╚██████╔╝███████╗██║░╚███║███████╗██║░░██║██║░░██║░░░██║░░░███████╗██║░░░░░██║░░██║██████╔╝██████╔╝░░╚██╔╝░╚██╔╝░╚█████╔╝");
        System.out.println("╚══════╝░╚═════╝░╚══════╝╚═╝░░╚══╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝░░╚═╝╚═════╝░╚═════╝░░░░╚═╝░░░╚═╝░░░╚════╝░");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите желаемую длину пароля: ");
        int length = scanner.nextInt();

        System.out.print("Введите количество паролей для генерации: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String password = generatePassword(length);
            System.out.println((i + 1) + ": " + password);
        }

        scanner.close();
    }

    private static String generatePassword(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}