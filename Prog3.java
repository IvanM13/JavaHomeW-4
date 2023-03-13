//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class Prog3 {
    public static void main( String[] args ) {

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while ( iterator.hasNext() ) {
            sum += iterator.next();
        }

        System.out.println( "Сумма элементов:\t" + sum + "\n" );
    }


    public static LinkedList<Integer> generate_linkedlist() {
        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();
        int size = random.nextInt( 10 ) + 11; 
        for ( int i = 0; i < size; i++ ) {
            list.add( random.nextInt( 100 ) );
        }

        return list;
    }
}