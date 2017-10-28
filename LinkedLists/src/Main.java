import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        stacks();
        ArrayBub a = new ArrayBub(5);
        a.insert(15);
        a.insert(19);
        a.insert(99);
        a.insert(9);
        a.insert(2);
        a.display();
        a.bubbleSort();
        System.out.println();
        a.display();
    }



    public static void stacks(){
        Stack s = new Stack(10);
        Stack2 s2 = new Stack2(10);

//
//        s.push(20);
//        s.push(40);
//        s.push(60);
//        s.push(80);
//
//        s2.push('a');
//        s2.push('b');
//        s2.push('c');
//        s2.push('d');
//
//
//
//        System.out.println(s.isEmpty());
//        System.out.println(s2.isEmpty());
//        System.out.println(s3.isEmpty());
//

        s2.displayStack();
        while ( !s2.isEmpty() ){ // until it's empty
            System.out.print(s2.pop());
            System.out.print(" ");
        }
        System.out.println();



    }
}