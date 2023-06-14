//Armstrong or not

import java.util.*; 
class HelloWorld {
    
    public static ArrayList<Integer> splitNumberIntoArray(int num){
        ArrayList <Integer> numArray = new ArrayList<Integer>();
        while(num > 0 ){
            Integer rem = Integer.valueOf(num%10);
            numArray.add(rem);
            num = num/10;
        }
        return numArray;
    }
    public static int powerOfNumber(int num, int pow){
        int res=1;
        for(int i=0 ;i<pow; i++){
            res=res*num;
        }
        return res;
    }
    
    public static String armStrongNumberOrNot(int num){
        ArrayList<Integer> newArrList = splitNumberIntoArray(num);
        int arrSize = newArrList.size();
        int sum=0;
        for(int a : newArrList){
            int powOfNumber = powerOfNumber(a, arrSize); 
            sum+=powOfNumber;
        }
        if(sum==num){
            return "Armstrong NUmber";
        }else{
            return "Not Armstrong NUmber";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong or not: ");
        int num = sc.nextInt();
        System.out.println(armStrongNumberOrNot(num));
        }
}