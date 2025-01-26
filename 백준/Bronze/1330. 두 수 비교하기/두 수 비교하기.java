import java.util.Scanner;

class Compare{
    private int num1;
    private int num2;
    
    public Compare(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void conNum(){
        if(num1 > num2){
            System.out.println(">");
        }else if(num1 < num2){
             System.out.println("<");
        }else if(num1 == num2){
            System.out.println("==");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Main stepD = new Main();
        stepD.d09();
    }
        void d09() {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            Compare com = new Compare(num1, num2);
            com.conNum();
            sc.close();
        }
}