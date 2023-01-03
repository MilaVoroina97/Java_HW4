package HW4;

import java.util.LinkedList;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task1 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = makeList();
        for(int i : numbers){
            System.out.println(i);
        }
        LinkedList<Integer> result = reverse2(numbers);
        System.out.println();
        for(int j : result){
            System.out.println(j);
        }
    }

    // public static void reverse(LinkedList<Integer> temp) {
    //     int mid = temp.size()/2;
    //     for(int i = 0, j = temp.size() - 1; i < mid; i++, j--){
    //         temp.set(i, temp.set(j, temp.get(i)));
    //     }
    // }

    public static LinkedList<Integer> reverse2(LinkedList<Integer> temp){
        LinkedList<Integer> num = new LinkedList<>();
        for(int i = temp.size() - 1 ; i >= 0 ; i--){
            num.add(temp.get(i));
        }
        return num;
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
}
