package Lab6;

public class Square extends Shape implements Exemplu{

    public Square(Integer l) {
        super(l);
    }

    @Override
    public Double area() {
        return (double)(l * l);
    }

    @Override
    public Integer parimeter() {

        return l * 4;
    }
    @Override
    public  void methodExemplu(){


    }
}
