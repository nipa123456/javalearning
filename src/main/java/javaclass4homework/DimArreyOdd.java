package javaclass4homework;

public class DimArreyOdd {
    public static void main(String[]args){
        int data[][] = {{10, 30, 50},{ 70, 90, 110},{101,103,105}};
        for(int n=0; n<3; n++){
            for(int j=0; j<3; j++){
                System.out.print(data[n][j] +" ");
            }
            System.out.println();
        }
    }

}
