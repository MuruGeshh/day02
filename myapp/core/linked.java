package myapp.core;


//import collection framework
import java.util.*;




public class linked {
    
public static void main(String[] args){

    // create a list of integer
    List<Integer> intList = new LinkedList<Integer>();
    intList.add(Integer.parseInt("42"));
    intList.add(10);
    intList.add(10);
    intList.add(50); 
    intList.add(2,15);

    System.out.println(intList);

    for(int i = 0; i < intList.size(); i++)
      {

        System.out.printf("%d = %d\n", i, intList.get(1));





      }




}








}
