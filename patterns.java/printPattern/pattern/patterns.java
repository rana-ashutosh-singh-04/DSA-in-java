
 public class patterns {

       public static void diamond_Pattern(int n){
        for(int i=1; i<=n; i++){
        //   spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }System.out.println();
        }
        // 2nd half
        for(int i=n; i>=4 -1 ;i--) {
            for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }System.out.println();
        }
       }
    public static void hollow_Rhombus(int n){
        // outer loop 
        for(int i =1; i<=n; i++){
            // spoaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
                // hollow rectangle-with stars
              for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
              }
            System.out.println();
        }
    }
//     public static void hollow_Rhombus(int n) {
// //         hollow_Rhombus(5);
// //     }
// //    }
 
   
//             // outer loop 
//             for(int i =1; i<=n; i++){
//                 // spoaces
//                 for(int j=1; j<=(n-i); j++){
//                     System.out.print(" ");
//                 }
//                     // hollow rectangle-with stars
//                   for(int j=1; j<=n; j++){
//                     if(i==1||i==n||j==1||j==n){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                   }
//                 System.out.println();
//             }}
        
    public static void solid_Rhombus(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i);j++){
              System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                // stars
                System.out.print("*");
            }
            for(int j=1; j<=(i-1); j++){
                // spaces
                System.out.print(" ");
            }//line changes
            System.out.println();
    }
    }
    public static void butterfly_pattern(int n){
         
               // outer loop
        for(int i=1; i<=n; i++){
            // starss---i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces----2*(n-i)
           for(int j =1; j<=2*(n-i);j++){
            System.out.print(" ");
           }
        //    stars---i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }System.out.println();
            }

            // 2nd half
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                // spaces----2*(n-i)
               for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
               }
            //    stars---i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
            }
        }
    
    public static void zero_one_triangle(int n){
        // outer loop
        for(int i=1; i<=n;i++ ){
            // inner loop
            for(int j = 1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print(1+" ");
                }else{System.out.print(0+" ");
            }
            }System.out.println( );
        }
    }
 
    public static void floyds_Triangle(int n  ){
        int m =1;
        for(int i=1; i<=n; i++){
          
            
            for(int j=1; j<=i ; j++){
                System.out.print(m+" ");
                 m++;
                
            } System.out.println();
        }
    }
public static void inverted_half_pyramid_withNumbers(int n){
//   outer loop 
    for(int i= 1; i<=n; i++){
        // for inner loop 
        for(int j= 1; j<=n-i+1; j++ ){
            System.out.print( j +" ");
        }System.out.println( );
    }
}
   public static void hollow_rectangles(int totRows, int totcols){
// //         // ou  ter loop 
        for (int i = 1; i<=totRows; i++){
// //        //inner loop 
       for(int j=1; j<=totcols; j++)
// //     //    cell (i,j)
         if(i==1|| i ==totRows || j== 1|| j==totcols){
//       boundry cells 
   System.out.print("*");
         }else{
             System.out.print(" ");
        }
             System.out.println();
               }
            }

    public static void half_pyramid(int n){
     // outer 
     for (int i = 1; i <= n; i++){
          // spaces
          for (int j = 1; j <= n - i; j++){
               System.out.print(" ");
          }
     //     stars          
         for(int j=1; j<=i; j++){
               System.out.print("*");
          }
          System.out.println();
     }
    }
    // public static void main(String args[]){
    //   half_pyramid(4);

    //  }
    //  }


    //  public static void half_pyramid(int n) {
    //      // Outer loop for each row
    //      for (int i = 1; i <= n; i++) {
    //          // Inner loop for spaces
    //          for (int j = 1; j <= n - i; j++) {
    //              System.out.print(" ");
    //          }
    //          // Inner loop for stars
    //          for (int j = 1; j <= i; j++) {
    //              System.out.print("*");
    //          }
    //          // Move to the next line
    //          System.out.println();
    //      }
    //  }
 
     public static void main(String[] args) {
         diamond_Pattern(5);
         half_pyramid(4);
         hollow_rectangles(4,4);
         solid_Rhombus(
            4);
         inverted_half_pyramid_withNumbers(5);
         butterfly_pattern(5);
     }
    }

