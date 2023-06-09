public class Binary_pallindrone{    
public static void Binary(int dec_no){    
     int binary[] = new int[40]; 
     int temp[] = new int[40];  
     int index = 0;    
     while(dec_no > 0){    
       binary[index++] = dec_no%2;    
       dec_no = dec_no/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]); 
     }    
     for(int i= binary.length-1;i>-1;i--) {
    		
    		temp[binary.length-1-i]=binary[i];
    		if(binary[i]==temp[i]) {
    			System.out.print("pallindrone");
    		}
    		
    		else {
    			System.out.print("Not Pallindrone");
    			
    		}
    			
    		
    		
    	}
System.out.println();

}  

public static void Binary2(int dec_no2) {

	 {
         
		
	}
}


public static void main(String args[]){   
	System.out.println("Binary of 24 is: ");  
	Binary(24);    
	
 
}}      
