//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//остараться не обращаться к листу по индексам.

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class Prog1 {
    public static void main( String[] args ) {
        System.out.println( "Программа выполняет разворот списка, без обращений по индексам\n" );

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        ListIterator<Integer> iterator = list.listIterator( list.size() );
        LinkedList<Integer> reversed_list = new LinkedList<>();
        while ( iterator.hasPrevious() ) {
            reversed_list.add( iterator.previous() );
        }
        

        System.out.println( "Перевернутый список:\t" + reversed_list + "\n" );
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