package lab4;

public class Rectangle {
    private int width;
    private int length;

    // Constructor
    public Rectangle() {
        // Constructorul fără parametri poate fi gol sau poți inițializa width și length cu o valoare implicită.
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public int getArie(){
        return width * length;
    }

    public int getPerimetru(){
        return (2 * width) + (2 * length);
    }
}
