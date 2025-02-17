package prog6112ta;

/**
 *
 * @author lindelo Desiree Nksoi
 */
public class PROG6112Ta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Two-Dimensional Array
         int[][] sales = {{24, 15, 35},
                          {25, 55, 35},
                          {11, 20, 45},
                          {17, 27, 25}
                          };
         
         //Print the vehicle sales report
         System.out.println("*********************************************************");
         System.out.println("VEHICLE SALES REPORT");
         System.out.println("********************************************************");
//         System.out.println("            JAN                  FEB                 MAR");
//         System.out.println("SUV         25                   15                  35");
//         System.out.println("COUPE       25                   55                  35");
//         System.out.println("SEDAN       11                   20                  45");
//         System.out.println("VAN         17                   27                  25");
        
         


         System.out.print("\tJAN");
         System.out.print("\tFEB");
         System.out.println("\tMAR");


           for(int i = 0; i < sales.length; i++){
                     System.out.println();
             switch(i){
               case 0 : System.out.print("SUV");break;
               case 1 : System.out.print("COUPE");break;
               case 2 : System.out.print("SEDAN");break;
               case 3 : System.out.print("VAN");break;
             }
               for(int j = 0; j < sales[i].length; j++){
                   System.out.print("\t" + sales[i][j]);
               }
               System.out.println();
           }         
         
         
         
         System.out.println("********************************************************");
         System.out.println("VEHICLE TOTAL SALES");
         System.out.println("********************************************************");
         
          int rows,columns,sumRows;
          
           //calculates number of rows and colomns in a given matrix
       rows = sales.length; 
       columns = sales[0].length;
       
           //calculate sum of each row of given matrix
       for(int i = 0; i<rows; i++ ){
           sumRows = 0;
           for(int j = 0; j < columns; j++){
             sumRows = sumRows + sales[i][j];
             
           }
           
           
           
           System.out.print("sum of " +(i+1)+ " row: " +sumRows);
           if(sumRows <= 100){
               
               System.out.println("(Silver star)");
              
               
           }
           else {
               System.out.println("(Gold Star)"); 
           }
           System.out.println();
       }
    }
    
}
