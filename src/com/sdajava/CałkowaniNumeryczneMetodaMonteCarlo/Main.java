package com.sdajava.CałkowaniNumeryczneMetodaMonteCarlo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MonteCarlo zad = new MonteCarlo();
        zad.wpis();
        zad.poleTrojkata();
        zad.losowanie(30);
        zad.wyliczanieC();
        zad.wyliczanieCalki();
    }
}
