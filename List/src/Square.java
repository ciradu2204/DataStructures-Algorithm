public class Square extends Shape {

    int side;

    public Square(int side){
        this.side = side;
    }


    @Override
    void display() {
        System.out.println("Square" + " " + "Side: " + side);
    }
}
