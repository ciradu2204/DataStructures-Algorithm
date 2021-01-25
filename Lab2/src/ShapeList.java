public class ShapeList {

    ADTList<Shape> list = new ADTList<>();

    public int count(){
        return list.length();
    }



    public String AddShape(Shape object){

         list.insert(object);

         if(list.find(object)){
             return "Ok";
         }else{
             return "Error";
         }

    }


    public void DisplayShape(){

        for(int i = 0; i<list.length(); i++){

            list.get(i).display();


        }
    }

}
