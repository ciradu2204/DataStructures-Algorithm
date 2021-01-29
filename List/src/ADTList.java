

public class ADTList<E> implements  IADTList<E>{

    Object list[];
    int capacity = 10;
    int length;

    @Override
    public int length() {
        return length;
    }

    public ADTList() {

       list = new Object[capacity];
       length =0;

    }

    @Override
    public void printList() {

       for(int i= 0; i<length; i++){
           System.out.println(list[i]);
       }

    }

    @Override
    public void insert(E s) {


        if (length >= capacity) {
            capacity = capacity + 5;

        }
        list[length] = s;


        length++;
    }

    @Override
    public void remove(E s) {

        if(length == 0){
            System.out.println("The list is empty");
        }

        int index = 0;

        for(int i=0; i<length; i++){

            if(s.equals(list[i])){

                index = i;
                break;

            }
        }

        length--;

        if(index >0){

            for(int i = index ; i<length; i++){

                list[i] = list[i+1];
            }

        }



    }

    public E get(int e){

        for(int i=0; i<length; i++){

            if(list[e].equals(list[i])){
                return (E) list[i];
            }

        }

        return (E) new IndexOutOfBoundsException();
    }

    @Override
    public boolean find(E s) {

        for(int i= 0; i<length; i++){

            if(s.equals(list[i])){

                return true;
            }


        }

        return false;
    }
}
