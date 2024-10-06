// array out of bound exception

//package exceptionhandling;
package trycatchexceptionhandling;

public class ArrayIndexExcp {

    public static void main(String[] args) 
    {
        try 
        {
            int arr[] = new int[5]; 
            arr[10] = 20;           
        }
        catch (Exception e) 
        {
            System.out.println(e); 
        }
    }
}

