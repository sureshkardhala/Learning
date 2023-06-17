// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ArrList {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        Integer[] arr1 = {4,5,6};
        ArrayList <Integer> arrList = new ArrayList<>();
        ArrayList <Integer> arrList1 = new ArrayList<>();
        Collections.addAll(arrList, arr);
        Collections.addAll(arrList1, arr1);
        //Converting arr into ArrayList"
        System.out.println(arrList);
        
        //Adding Elements into ArrayList:
        arrList.add(4);
        System.out.println(arrList);

        //Adding at particular position(ex:pos:0)
        arrList.add(0,7);
        System.out.println(arrList);
        
        //Adding list of elements into arraylist
        arrList.addAll(arrList1);
        System.out.println(arrList);
        
        //Adding list of elements at particular position(ex:pos:1)
        arrList.addAll(0,arrList1);
        System.out.println(arrList);
        
        //Get the elements using index
        System.out.println(arrList.get(0));
        
        //Update an element using index
        arrList.set(0,12);
        System.out.println(arrList);
        
        //Removing an element at index
        arrList.remove(1);
        System.out.println(arrList);
        
        //Removing an element (deletes first occurence)
        arrList.remove(Integer.valueOf(12));
        System.out.println(arrList);
        
        //Remove all elements
        // arrList.clear();
        // System.out.println(arrList);
        
        //Get the index of element
        System.out.println(arrList.indexOf(Integer.valueOf(4)));
        System.out.println(arrList.lastIndexOf(Integer.valueOf(4)));
        
        
        //converting into array
        Object [] arr3 = arrList.toArray();
        System.out.println(arr3);
        
        //Sorting
        arrList.sort(Collections.reverseOrder());
        System.out.println(arrList);
        
        
        //Making sublist from index m to n-1
        List<Integer> subList = arrList.subList(2,5);
        System.out.println(subList);
    }
}