package myapp.core;


//import collection framework
import java.util.*;
import java.io.Console;





public class WorkShop {
    
public static void main(String[] args){

    Console cons = System.console();
    boolean stop = false;
    String input;
    int delIndex;


    
    
    
    //mainloop
    while (!stop) {

          List<String> cart = new LinkedList<>();
           input = cons.readLine("> ");
           String[] terms = input.split("");
           System.out.printf("READ: %s\n", input);
            input.split(" ");

            switch(terms[0]) {

                case "add":
                   
                     break;

                case "list":
                if (cart.size() > 0){
                for (int i = 0; i < cart.size(); i++){

                    System.out.println("Your cart is empty");
                }

                }
                     break;

                 case "del":
                 if(terms.length <2){
                     System.err.println("Please provide index to delete");
                 } else{
                 delIndex = Integer.parseInt(terms[1]);
                   if (delIndex < cart.size()){
                      cart.remove(delIndex);
                      System.out.println("Deleted");

                   }
                   else{

                      System.err.println("no such ...");
                   }
                   
                   
                   

                 }
                     break;

            
                     case "end":


                   default:




            }



    }
}

}




















        

    














