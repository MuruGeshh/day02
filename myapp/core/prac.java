package myapp.core;



public class prac {

    

      public static void main(String[] args){

          System.out.println("Hello, world"); 

          // initiate array
          String[] todos = new String[4];
        
          
          // assaign value to array
          todos[0] = "learn Java";
          todos[1] = "go jogging";
          todos[2] = "watch a movie";

          System.out.printf("index : %d: value = %s\n", 0, todos[0]);
          System.out.printf("index : %d: value = %s\n", 0, todos[1]);
          System.out.printf("index : %d: value = %s\n", 0, todos[2]);

          //every array has a propety called lenght
          System.out.printf("Size of array: %d\n", todos.length);
          System.out.printf("Size of array: %d\n", args.length);








      }





}