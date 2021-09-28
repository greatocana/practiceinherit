package Newpack;

public class Ilawmain {
    public static void main(String[] args) {

        Ilaw I = new Ilaw("red",21);
        I.result();
        Poste P = new Poste("red", 12, 100f); //inherit
        P.result();

        Boolean Light = I.nakaOn();
        System.out.println(Light);
        I.add("hoi");

    }
}
