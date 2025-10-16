 class Program {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "black";
        p1.tip = 3;
        p1.marks[0]=200;
        p1.marks[1] = 100;
        Pen p2 = new Pen(p1);
        System.out.println(p2.color);       
        p1.marks[1] = 0;
         System.out.println(p2.marks[1]);
    }
}

class Pen {
    String color;
    int tip;
    int marks[];
    Pen(){
         marks = new int[2];
    }
   Pen(Pen p1){

    this.color = p1.color;
    this.tip = p1.tip;
    // this.marks = new int[p1.marks.length];
    // for(int i=0; i<=1; i++){
    //     this.marks[i] = p1.marks[i];
    // } - -         deep copying;

    this.marks = p1.marks; // --------shallow copying
   }
}

