public class stackImpl<E> implements ADTStack<Object> {

    Object list[];
    int length;
    int capacity;


    public stackImpl(int capacity) {

        list = new Object[capacity];
        length = -1;
        this.capacity = capacity;

    }

    @Override
    public int size() {

        return length;
    }

    @Override
    public boolean isEmpty() {

        if(length == -1){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean isFull() {
        if(length == capacity){
            return true;
        }else{
            return false;
        }
    }


@Override
    public void push(Object o) {

        if(!isFull()){
            length++;
            list[length] = o;
        }


    }

    @Override
    public Object pop() {

        Object poppedElement;
        if(!isEmpty()){

            poppedElement = (E) list[length];
            length--;

        }else{
            return  -1;
        }

        return poppedElement;
    }
}
