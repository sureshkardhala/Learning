package Leetcode.Strings;

public class StringBuilderExample {
    public static void main(String args[]) {
        //Converting string into string builder
    String str = "ure";
    StringBuilder sb = new StringBuilder(str);
    
    //insert ar start
    sb.insert(0, "S");
    System.out.println("insert At 0 index : "+sb);

    //append at end
    sb.append("eh");
    System.out.println("Append eh at end : "+ sb);

    //Change at posistion using set(index, char)
    // sb.setCharAt(0, "s");

    //delete
    sb.append("ll");
    sb.delete(4, 6);
    System.out.println("Deleted from 4 to 6-1 " + sb);

    //insert in middle it insert and won't replace
    sb.insert(2,"nn");
    System.out.println("insert nn at index 2 : " + sb);

    //reverse
    sb.reverse();
    System.out.println("Reverse using reverse() : "+ sb);

    //reverse in programmatic approach
    // for(int i=0; i<sb.length()/2; i++){
    //     int oldChar = sb.charAt(i);
    //     int newChar = sb.charAt(sb.length()-1-i);
        
    // }
    // System.out.println("Reversing using norml approach : " + sb);

    //String Buffer to String
    String str1 = new String(sb);
    System.out.println(str1);

    }
}
