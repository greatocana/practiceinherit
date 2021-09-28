package Newpack;

public class Poste extends Ilaw{
    private float length;

    public Poste(String color, int pieces, float length) {
        super(color, pieces);
        this.length = length;
    }

    public void result(){
        System.out.println(this.length + " meter " + this.pieces + " " + this.color+ " " + "lights ");
    }
}
