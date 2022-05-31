package myapp.core;

public class SumAll {
    

    public static void main(String[] args){

           // intitialze , stopping condition , increment
           int num=0;
           
        for(int i = 0; i < args.length; i++ )
        {
            System.out.printf("%s\n", args[i]);
            num+= Integer.parseInt(args[i]);

        }
        
        {   
              
             System.out.printf("The sum is %d", num);


        }









}




}
