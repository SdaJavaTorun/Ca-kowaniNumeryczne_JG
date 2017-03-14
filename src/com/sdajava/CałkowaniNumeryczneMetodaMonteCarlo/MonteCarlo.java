package com.sdajava.CałkowaniNumeryczneMetodaMonteCarlo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class MonteCarlo {

    public int x1;  public int A;
    public int x2;  public int B;
    public int y1;  public int C;
    public int y2;  public int pole;
    public List<Punkt> lista = new ArrayList<Punkt>();
    public int c; int n;

    public void wpis (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj współczynniki równania");
        System.out.println("A*x^2 + B*x + C");
        System.out.println("Podaj A");
        this.A = sc.nextInt();
        System.out.println("Podaj B");
        this.B = sc.nextInt();
        System.out.println("Podaj C");
        this.C = sc.nextInt();
        System.out.println("Podaje lewą granice zakresu X");
        this.x1 = sc.nextInt();
        System.out.println("Podaj prawą granice zakresu X");
        this.x2 = sc.nextInt();
        System.out.println("Podaj górną granice zakresu Y");
        this.y2 = sc.nextInt();
        System.out.println("Podaj dolną granice zakresu Y");
        this.y1 = sc.nextInt();
    }

    public void poleTrojkata(){
        this.pole = Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    public void losowanie(int n) {
        this.n = n;

        List<Punkt> lista = new ArrayList<Punkt>();
        for(int i = 0; i < n; i++) {
            Random ran = new Random();
            Punkt a = new Punkt();
            a.x = ran.nextInt(Math.abs(x2 - x1)) + x1;
            a.y = ran.nextInt(Math.abs(y2 - y1)) + y1;
            lista.add(a);
        }
        this.lista = lista;
    }
    public void wyliczanieC(){

        for (Punkt p : lista ){
            int y;
            y = this.A * p.x * p.x   +  this.B * p.x  + this.C;
            if (p.y > 0 && p.y < y){
                c++;
            }
            else if (p.y < 0 && p.y >= y){
                c--;
            }
        }
    }
    public void wyliczanieCalki(){
        double calka = this.pole * this.c / this.n;
        System.out.println("pole trojkata = " + this.pole);
        System.out.println("c = " + this.c);
        System.out.println("n = " + this.n);
        System.out.println("Calka = " + calka);
    }
}
