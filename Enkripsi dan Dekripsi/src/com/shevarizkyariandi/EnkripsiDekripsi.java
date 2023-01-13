package com.shevarizkyariandi;

import java.util.Scanner;

public class EnkripsiDekripsi {
    public static void main(String[] args) {

        enkripsi();
        dekripsi();

    }

    public static void dekripsi() {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pesan yang dienkripsi: ");
        String encryptedMessage = input.nextLine();

        System.out.print("Masukkan kunci: ");
        String key = input.nextLine();

        String decryptedMessage = "";

        for (int i = 0; i < encryptedMessage.length(); i++) {
            decryptedMessage += String.valueOf((char) (encryptedMessage.charAt(i) ^ key.charAt(i % key.length())));
        }

        System.out.println("Pesan yang didekripsi: " + decryptedMessage);
    }

    public static void enkripsi(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan plaintext: ");
        String plaintext = sc.nextLine();
        System.out.print("Masukkan key: ");
        String key = sc.nextLine();

        // Enkripsi plaintext menggunakan metode XOR
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);
            char k = key.charAt(i % key.length());
            char c = (char)(p ^ k);
            ciphertext += c;
        }

        System.out.println("Ciphertext: " + ciphertext);

    }
}
