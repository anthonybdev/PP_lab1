package com.company.Lab1;

import java.util.Scanner;

/**
 * The main class, which runs the application
 *
 *  * @author Anton Bitner
 *  * @version 1.1
 */
public class Program {

    /**
     *  The main function
     */
    public static void main(String[] args){
        int count = 0;

        if(args.length != 0) {
            count = Integer.parseInt(args[0]);
        }
        else{
            Scanner scanner = new Scanner(System.in);
            count = scanner.nextInt();
        }

        Fibonacci[] fibonacci = new Fibonacci[count];

        for(int i = 0; i < fibonacci.length; i++){
            fibonacci[i] = new Fibonacci();
            fibonacci[i].setIndex(i+1);
            if(i > 1) {
                fibonacci[i].setValue(fibonacci[i - 1].getValue() + fibonacci[i - 2].getValue());
            }

        }

        for(Fibonacci e: fibonacci){
            System.out.format("%d - %d Square[%b]%n",e.getIndex(),e.getValue(),e.isSquare());
        }
    }
}



