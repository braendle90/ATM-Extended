package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner ScannerDeposit = new Scanner(System.in);


        double accountBalance = 230.33;

        while (true) {


            System.out.println("1.\t Einzahlen");
            System.out.println("2.\t Auszahlen");
            System.out.println("3.\t Kontostand");
            System.out.println("4.\t Beenden");

            int scannerInput = scanner.nextInt();


            switch (scannerInput) {


                case 1:
                    accountBalance = einzahlen(accountBalance);
                    break;
                case 2:
                    accountBalance = auszahlen(accountBalance);
                    break;
                case 3:
                    System.out.println(accountBalance);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bitte geben Sie eine gültige Zahl ein!");

            }


        }


    }

    private static double einzahlen(double accountBalance) {
        System.out.println("Bitte geben Sie ein wieviel sie einzahlen möchten?");
        Scanner ScannerDeposit = new Scanner(System.in);
        int intScannerDeposit = ScannerDeposit.nextInt();

        if (intScannerDeposit < 0) {
            System.out.println("Bitte geben Sie ein Gültige Zahl ein.");

        }
        if (intScannerDeposit >= 0) {
            accountBalance = accountBalance + intScannerDeposit;
            intScannerDeposit = 0;
            System.out.println("Sie haben noch "+accountBalance+"€ auf dem Konto");

        }


        return accountBalance;
    }

    private static double auszahlen(double accountBalance) {
        System.out.println("Bitte geben Sie ein wieviel sie auszahlen möchten?");
        Scanner ScannerWithdraw = new Scanner(System.in);
        int intScannerWithdraw = ScannerWithdraw.nextInt();

        if (intScannerWithdraw < 0) {
            System.out.println("Bitte geben Sie ein Gültige Zahl ein.");

        }
        if (intScannerWithdraw <= accountBalance) {
            accountBalance = accountBalance - intScannerWithdraw;
            intScannerWithdraw = 0;
            System.out.println("Sie haben noch "+accountBalance+"€ auf dem Konto");

        }
        if (intScannerWithdraw > accountBalance) {

            System.out.println("Der Betrag übersteigt Ihr Kontolimit");

        }


        return accountBalance;
    }






    }

