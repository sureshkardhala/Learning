package Leetcode.Strings;
public class Strings {
    public static void main(String args[]){
        //String decleration
        String str1="Hello";
        String str2 = new String("suresh");

        //Concatination of two strings
        String str3= str1+"@"+str2;
        System.out.println(str3);

        //String length
        System.out.println(str3.length());

        //String charAt(index)
        char ch = str3.charAt(0);
        System.out.println(ch);


        //Strings comparison compareTo()
        //return 0 for equal
        //return +ve if string1 is greater than string2 by comparing ascii order
        //return -ve if string1 is less than string2

        String str4="Suresh Kardhala";
        String str5= "Yesubabu Kardhala";

        if(str4.compareTo(str5) == 0){
            System.out.println("Both strings are equal");
        } else if (str4.compareTo(str5) >0){
            System.out.println("String4 is greater thab string 5");
        } else{
            System.out.println("String4 is lesser than string5");
        }

        //Comparison using ==
        String str6="Raju";
        String str7="Raju";
        if(str6==str7){
            System.out.println("Both str6 and str7 are equal");
        } else{
            System.out.println("str6 & str7 are not equal");
        }

        if(new String("Suresh") == new String("Suresh")){
            System.out.println("Both are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        //substring str.subString(start, end)

        String str8="King David wins the war";
        String subString8 =str8.substring(4, 8);
        System.out.println(subString8);


        //replace 
        String str9=" Suresh ";
        String str10 =str9.replace("ure", "ase");
        System.out.println(str10);

        //indexOf, loweCase(), uppercase(), trim() & String.valueOf(int type) - convert any type into string
        String str11=str10.toLowerCase();
        String str12=str11.toUpperCase();
        String trim = str12.trim();
        int x=10;
        String xString = String.valueOf(x);

        System.out.println("int to String : " + xString);
        System.out.println("Trimmed String : " + trim);
        System.out.println("Lower Case String : " + str11);
        System.out.println("upper Case String : " + str12);

    }
    
}
