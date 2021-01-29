

public class Triangle extends Shape {

     int h;
     int w;
     int hyp;

     public Triangle(int h, int w, int hyp){

         this.h = h;
         this.w = w;
         this.hyp = hyp;
     }

    @Override
    void display() {

        System.out.println("Type: Triangle" + " " + "Height: " + h + " " + "width: " + w + " " +  "Hypothenus: " + hyp);
    }
}
