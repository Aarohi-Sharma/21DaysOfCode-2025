import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        int index = linearSearch(arr, target);
        if(index != -1) 
        {
            System.out.println("Element found at index: " + index);
        } else 
        {
            System.out.println("Element not found in the array.");
        }
    }
    public static int linearSearch(int[] arr, int target) 
    {
        for(int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == target) 
            {
                return i; 
            }
        }
        return -1;
    }
}
