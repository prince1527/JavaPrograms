import java.awt.*;        
import java.awt.event.*;

import javax.swing.JFrame;  


public class JavaAWT extends Frame {
   private Label lblCount;    
   private TextField tfCount; 
   private Button btnCount; 
   private Button btnClear;
   
   private int count = 0;    

   
   public JavaAWT () {
      setLayout(new FlowLayout());
      
      lblCount = new Label("Counter");  
      add(lblCount);                    

      tfCount = new TextField(count + "", 10); 
      tfCount.setEditable(false);      
      add(tfCount);                     

      btnCount = new Button("Count");   
      add(btnCount);          
      
      btnClear = new Button("Clear");
      add(btnClear);
     

      BtnCountListener listener = new BtnCountListener();
      btnCount.addActionListener(listener);
      
      BtnClearListener listener1 = new BtnClearListener();
      btnClear.addActionListener(listener1);
         
      setTitle("AWT Counter");  
      setSize(300, 300);     
      
    
      setVisible(true);    
   }
   

   private class BtnCountListener implements ActionListener {
      
      
      public void actionPerformed(ActionEvent evt) {
         ++count; 
         tfCount.setText(count + ""); 
      }

 	}
   
   private class BtnClearListener implements ActionListener {
	      
	      
	   public void actionPerformed(ActionEvent evt) {
	         if(count>0) {
	        	 count--; 
	        	 tfCount.setText(count + ""); 
	         }
	         else{
	        	 count = 0;
	         }

	      }

	 	}
   
	public static void main(String[] args) {
		JavaAWT app = new JavaAWT();
        
    } 

}
