//Print number in Fibinocci series of particular location 

import java.util.*; 
class HelloWorld {
    
    public static int fibSeries(int firstNumber, int secondNumber, int pos){
        if(pos==1){
            return firstNumber;
        }
        if(pos==2){
            return secondNumber;
        }
        int res=0;
        for(int i=3; i<=pos; i++){
            res = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the posisition of fibnocci series:");
            int pos = sc.nextInt();
            int res = fibSeries(0,1,pos);
            System.out.println(res);
        }
        }
}