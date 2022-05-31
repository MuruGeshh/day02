package myapp.core;

import java.io.Console;

public class WhileLoop {



    public static void main(String[] args){

            //get the console
            Console cons = System.console();
           
            // variable to hold the result
            int result = 0;
            int opnd = 0;
            String input = "";

            //Controls the loop
            boolean stop = false;



          while (!stop) {

             input = cons.readLine("Please enter a number, return to end: \n");
              if (input.length() > 0){
                  
                 opnd = Integer.parseInt(input);
                 result += opnd;

              }
              else
              stop =true;

          }

          System.out.printf("the result is %d : \n", result);





    
        }
    }