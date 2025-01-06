package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking) {
            if(clock<8 && clock>=0 ) {
                return true;
            } else if(clock>20 && clock<=23) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if((firstAge>=13 && firstAge<=19) || (secondAge>=13 && secondAge<=19) || (thirdAge>=13 && thirdAge<=19)) {
           return true;
       } else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
       if(isSummer) {
         if(temp<=45 && temp>=25) {
             return true;
         } else {
             return false;
         }
       } else if(temp>=25 && temp<=35) {
           return true;
       } else {
           return false;
       }
    }

    public static double area(double width, double height) {
       if(width>0 && height>0) {
           return width*height;
       } else {
           return -1;
       }
    }

    public static double area(double radius) {
       if(radius>0) {
           return radius*radius*Math.PI;
       } else {
           return -1;
       }
    }
}
