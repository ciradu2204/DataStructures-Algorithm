import java.util.HashMap;

public class main {

    public static void main (String[] args){

        //test the implementation

        stackImpl stack = new stackImpl(5);
        System.out.println( stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());

        //check if an element is a palindrome

        String s1 = "Geeks";
        System.out.println(isPalindrome(s1));



        //check if an expression is balanced using stacks
        String expression = "()[][[[]]]";
        System.out.println(isBalanced(expression));




    }

    public static boolean isBalanced(String expression){

        stackImpl<Character> stack3 = new stackImpl(expression.length());
        HashMap<Character, Character> hashmap = new HashMap<>();
        hashmap.put('}', '{');
        hashmap.put(']', '[');
        hashmap.put(')', '(');

        for(int i=0; i<expression.length(); i++){

            if(hashmap.containsKey(expression.charAt(i))){

                Character poppedElement = stack3.isEmpty()? '#': (Character) stack3.pop();
                if(poppedElement != hashmap.get(expression.charAt(i))) {
                    return false;
                }
            }else{

                stack3.push(expression.charAt(i));

            }


        }

        return true;




    }


    public static  boolean isPalindrome(String element){

        stackImpl stack2 = new stackImpl(element.length());

        for(int i=0; i<element.length(); i++){
            stack2.push(element.charAt(i));
        }

        //since I want to do many modification on the string, it's better to use the string builder as it takes less memory
        StringBuilder s2 = new StringBuilder();

        while(!stack2.isEmpty()){

            s2.append(stack2.pop());

        }

        if(element.equals(s2.toString())){

           return  true;

        }else{
            return false;
        }











    }







}
