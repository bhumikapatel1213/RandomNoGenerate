package randomNoPrint;

import java.util.Random;

public class GenerateRandomNo {

	public static void main(String[] args) {
		 Random r = new Random();
	        int array [] = new int[100];
	        for(int i = 0; i <array.length; i++){
	        array[i] = r.nextInt(1000) + 1;
	        }

	     int min = array[0];
	     System.out.println("Random Array........");
	        for( int i = 0; i < array.length; i++ ){
	            System.out.println(array[i]);
	           if(array[i] < min){
	            min =  array[i];
	            }
	    }
	        System.out.println("Smallest Number is: "+ min);
	}

}
