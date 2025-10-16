public class OOPS{

    public static void main(String argsp[]) {
        pen p1 = new  pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        // p1.setTip(p1.tip);
        // p1.setColor("yellow");
        // System.out.println(p1);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
        void setTip(int newTip){
            tip = newTip;
        }
    
}

class Student {
    
}