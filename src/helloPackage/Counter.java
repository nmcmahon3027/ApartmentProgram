package helloPackage;

import java.util.Scanner;

public class Counter {

    int bedThree;
    int bedOne;
    int bedS;
    int bedTwo;
    int permitParking;


    public Counter(){
        bedThree = 6;
        bedOne = 10;
        bedS = 8;
        bedTwo = 18;
        permitParking = 5;

    }
    public Counter(int init){
        bedOne = init;
        bedThree = init;
        bedS = init;
        bedTwo = init;
        permitParking = init;
    }
    public int getValue(){
        return bedOne;

    }
    public void decrement(){
        bedThree--;
        bedOne --;
        bedS--;
        bedTwo--;
        permitParking --;

    }
    public String toString(){
        return "" + bedOne;
    }



    }

