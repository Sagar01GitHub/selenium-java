package CoreJava;

 public class ReverseArray {
 public static void main(String[] args) {
     
        // 1. Create an Array
        int [] arr = {1,2,3,4,5};
 
        // 2. Access and Print
        System.out.println("First element from array is: " + arr[0]);
        System.out.println("Last  element from array is: " + arr[arr.length - 1]); 
 
        // 3. Reverse Order
        
        System.out.println("Elements in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            System.out.println(arr[i]);
        }
 
        // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + arr.length);
    }
}


