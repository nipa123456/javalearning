package javaclass4homework;

public class DimArreyEven {
    public static void main(String[]args){
        int i[]= {1,2,3,4,5,6,7,8,9,10};
       System.out.println("Even number");

       for(int j = 0; j<i.length; j++){

           if(i[j] %2== 0){

               System.out.println(i[j]);
           }
       }

    }

}

