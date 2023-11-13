package Lab6;

public abstract class Shape {

    protected Integer l;
    public Shape(Integer l) {
        this.l = l;
    }


    public abstract   Double area();
    public abstract Integer parimeter();

    public void desen(){
        System.out.println("Drawing shape: " + area());
        System.out.println("Parimeter of shape: " + parimeter());

    }
    public void desen(String culoare){
        System.out.println("Area of shape: " + area());
        System.out.println("Perimeter of shape: " + parimeter());
        System.out.println("Color shape: " + culoare);
    }
    public static void afiseazaCeva(){
        System.out.println("Ceva");
    }
}
