import java.util.ArrayList;
import java.util.Arrays;

public class MyStack<T> {
    private int stack_size;
    private int top;
    private ArrayList<T> stack_array = new ArrayList<>();

     public MyStack(){
         this.stack_size = 0;
         this.top = -1;
     }

     public MyStack(T []array){
         this.stack_array.addAll(Arrays.asList(array));
         this.stack_size = array.length;
         this.top = array.length - 1;
     }

     public void push(T elem){
         this.stack_array.add(elem);
         this.top += 1;
         this.stack_size += 1;
     }

     public T pop(){
         if (this.stack_size != 0) {
             T elem = this.stack_array.remove(this.top);
             this.top -= 1;
             this.stack_size -= 1;
             return elem;
         } else {
             System.out.println("ERROR: Stack is empty");
             return null;
         }
     }

     public T read_top(){
         if (this.stack_size != 0) {
             return this.stack_array.get(this.top);
         } else {
             System.out.println("ERROR: Stack is empty");
             return null;
         }
     }

     public void print(){
         if (this.stack_size == 0)
             System.out.println("Stack is empty");
         else
             System.out.println(this.stack_array);
     }

     public boolean is_empty(){
         return this.stack_size == 0;
     }

     public int get_size(){
         return this.stack_size;
     }
}
