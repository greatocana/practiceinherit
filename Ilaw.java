package Newpack;

import javax.swing.*;

public class Ilaw {
    public String color;
    public int pieces;
    static boolean clicked = false;

   public Ilaw(String color, int pieces){
       this.color = color;
       this.pieces = pieces;
   }
   public void result(){
       System.out.println(this.pieces + " " + this.color+ " " + "lights...");
   }

    public static Boolean nakaOn() {
        return true;
    }
    public static boolean nakaOff() {
        return false;

    }

    public static void add(String s){
        System.out.println(s + "!!!");
    }
}
