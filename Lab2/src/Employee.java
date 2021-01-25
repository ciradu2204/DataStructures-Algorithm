public class Employee {

 public static void main(String[] args){

     ADTList<Integer> list = new ADTList<>();
     list.insert(2);
     list.remove(2);
     list.insert(5);
     list.insert(7);
     list.insert(9);
     list.printList();


     Square square1 = new Square(3);
     Square square2 = new Square(4);
     Square square3 = new Square(5);
     Triangle triangle1 = new Triangle(1,2, 4 );
     Triangle triangle2 = new Triangle(3, 4, 5);

     ShapeList shapeList = new ShapeList();
     shapeList.AddShape(square1);
     shapeList.AddShape(square2);
     shapeList.AddShape(square3);
     shapeList.AddShape(triangle1);
     shapeList.AddShape(triangle2);

     shapeList.DisplayShape();



 }


}
