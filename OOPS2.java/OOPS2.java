
import java.util.*;
public class OOPS2 {
   public static void main(String[] args) {
      Horse h = new Horse();
      System.out.println(h.color);

   }
}
   class Animal {
      String color;
      Animal(){
         System.out.println("animal constructor is called");
      }
   }
   
   class Horse extends Animal{
      Horse(){
         super.color ="brown";
         System.out.println("horse constructor is called");
      }
   }
//  Student s1 = new Student();
//    s1.schoolName = "DAV";

//     Student s2 = new Student();
//     System.out.println(s2.schoolName);


// }class Student {
//    public static void main(String[] args) {
      
//    }
//    static int returnPetcentage( int math, int phy, int chem){
//       return(math+phy+chem)/3;
//    }
//    String name;
//    int roll;

//    String schoolName;

//    void setName(String name){
//       this.name = name;
//    }
//    String getNmae(){
//       return this.name;
//    }
// }
   // public static void main(String[] args) {

   //  Queen Q = new Queen();
   //  Q.moves();
   // }
   // Student s1 = new Student();
   // s1.schoolName = "DAV";

   //  Student s2 = new Student();
   //  System.out.println(s2.schoolName);



// }

//  class Animal {
//    Animal(){
//       System.out.println("animal constructor is called ");
//  }

// class Student {
//    static int returnPetcentage( int math, int phy, int chem){
//       return(math+phy+chem)/3;
//    }
//    String name;
//    int roll;

//    String schoolName;

//    void setName(String name){
//       this.name = name;
//    }
//    String getNmae(){
//       return this.name;
//    }
// }

// interface ChessPlayer {
//    void moves();
   
// }


// class Queen implements ChessPlayer{
//    public void moves(){
//       System.out.println("up, down , left, diagonal (in all four direction) ");
//    }
// }

// class Rook implements ChessPlayer {
//    public void moves(){
//       System.out.println("up, down , left , right");
//    }
// }
// class King implements ChessPlayer {
//    public void moves(){
//       System.out.println("up, down , left , right , diagonal (by 1 steps)");
//    }
