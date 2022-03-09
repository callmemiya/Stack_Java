public class Main {
    public static void main(String[] args) {
        Integer []array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        MyStack<Integer> st = new MyStack<>(array);
        System.out.print("Stack of int: ");
        while (!st.is_empty()){
            System.out.print(st.pop());
            System.out.print(" ");
        }
        System.out.print("\nIs Stack empty now? ");
        System.out.println(st.is_empty());
        System.out.println(st.pop());
        MyStack<String> st_string = new MyStack<>();
        st_string.push("string");
        st_string.push("type");
        st_string.push("of");
        st_string.push("Stack");
        st_string.push("my");
        st_string.push("is");
        st_string.push("This");
        st_string.print();
        System.out.print("Stack of string: ");
        while (!st_string.is_empty()){
            System.out.print(st_string.pop());
            System.out.print(" ");
        }
        System.out.print("\nIs Stack empty now? ");
        System.out.println(st_string.is_empty());
        st_string.print();
        System.out.println(st_string.pop());
    }
}
