//Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - 
//возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Prog2 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println( "\n Программа реализует очередь.\n" );

        LinkedList<Integer> list = generate_linkedlist();
        System.out.println( "Исходный список:\t" + list );

        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
       
        enqueue( list, num );
        System.out.println( "Добавили " + num + " в конец:\t" + list + "\n" );

        System.out.println( "Забрали первый и удалили:\t" + dequeue( list ) );
        System.out.println( "Итоговый список:\t" + list  + "\n" );

        System.out.println( "Забрали первый не удаляя:\t" + first( list ) );
        System.out.println( "Итоговый список:\t" + list  + "\n" );
       
    }


    
    public static void enqueue( LinkedList<Integer> list, int num ) {
        list.addLast( num );
    }


   
    public static int dequeue( LinkedList<Integer> list ) {
        int num = 0;
        num = list.get( 0 );
        list.remove( 0 );
        return num;
    }


    
    public static int first( LinkedList<Integer> list ) {
        int num = 0;
        num = list.get( 0 );
        return num;
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
