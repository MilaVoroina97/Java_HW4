package HW4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = makeList();
        for(int i : numbers){
            System.out.println(i);
        }
        System.out.println();
        enqueue(numbers, 10);
        for(int j : numbers){
            System.out.println(j);
        }
        int deq = dequeue(numbers);
        System.out.println("Dequeue : " +  deq);
        int first = first(numbers);
        System.out.println("Method First : " + first);
    }

    public static LinkedList<Integer> makeList(){
        LinkedList<Integer> array = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        boolean run = true;
        
        do {
            System.out.print("Введите число: ");
            
            array.add(Integer.parseInt(in.nextLine()));
            
            System.out.print("Продолжить? (Y/N): ");
            
            if (!in.nextLine().equalsIgnoreCase("Y")) {
                run = false;
            }           
        } while (run);
        
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("Число № %d = %d \n", i + 1, array.get(i));
        }
        
        System.out.print("Выход из программы.");
        
        in.close();    

        return array;
    }
    public static void enqueue(LinkedList<Integer>num, int elem){
        num.addLast(elem);
    }

    public static int dequeue(LinkedList<Integer>num){
        int res = 0;
        res = num.getFirst();
        num.removeFirst();
        return res;
    }

    public static int first(LinkedList<Integer>num){
        int elem = 0;
        elem = num.getFirst();
        return elem;
    }


}
