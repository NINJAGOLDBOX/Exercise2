package com.company.Slye;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] monday = {45,0.95};
        double[] tuesday = {29,0.60};
        double[] wednesday = {10,0.25};
        double[] thursday = {22,0.05};
        double[] friday = {41,0.00};
        double[] saturday = {28,0.75};
        double[] sunday = {33,0.90};
        double[][] weather = {monday,tuesday,wednesday,thursday,friday,saturday,sunday};
        String[] week = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int i;

        for(i=0;i<weather.length;i++){
            if(weather[i][0]<=32 && weather[i][1]>0.50){
                System.out.println(week[i]);
            }
        }
    }
}
