/*
* Homework 2
* Samuel Bartholomew
* Date: 8-29-24
* This is my own original work and complies with hands-free sharing
*/	
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;


public class HW2_BART 
{
	/**
	 * Main function of HW2_Bart
	 * @param args
	 */
    public static void main(String[] args) 
    {
    	// Start timer
    	
    	// ...
        // Define the range and number of random integers
        int fillAmount = 1000;
        
        // Define the min and max of range
        int min = 1;
		int max = 20;
    	
        // Create an ArrayList + LinkedList + Random
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
		
        Random random = new Random();
        
        long timeElapsedRemoveArray = 0;
        long timeElapsedRemoveList = 0;
    	long start = System.nanoTime();

        // Add 1000 random integers to both array and linkedlist
        for (int i = 0; i < fillAmount; i++) 
        {
            int randomNumber = random.nextInt((max - min) +1) + min;
            arrayList.add(randomNumber);
        }
        long finish = System.nanoTime();
    	long timeElapsedArrayFill = finish - start;
    	start = System.nanoTime();
        for (int i = 0; i < fillAmount; i++) 
        {
            int randomNumber = random.nextInt((max - min) +1) + min;
            linkedList.add(randomNumber);
        }
    	finish = System.nanoTime();
    	long timeElapsedListFill = finish - start;

        // Get the middle index from array + linkedlist
    	
        int middleI = fillAmount / 2;
        
    	start = System.nanoTime();
        int arrayMiddleI = arrayList.get(middleI);
        finish = System.nanoTime();
    	long timeElapsedMiddleArray = finish - start;
    	
    	start = System.nanoTime();
        int linkListMiddleI = linkedList.get(middleI);
        finish = System.nanoTime();
    	long timeElapsedMiddleList= finish - start;

        System.out.println("Middle element of ArrayList: " + arrayMiddleI);
        System.out.println("Middle element of LinkedList: " + linkListMiddleI);

        // Remove the first and last elements from the array
        if (!arrayList.isEmpty()) 
        {
        	start = System.nanoTime();
            arrayList.remove(0);
            arrayList.remove(arrayList.size() - 1);
            finish = System.nanoTime();
        	timeElapsedRemoveArray = finish - start;
        }
        // Remove the first and last elements from the linkedlist
        if (!linkedList.isEmpty()) 
        {
        	start = System.nanoTime();
            linkedList.remove(0); 
            linkedList.remove(linkedList.size() - 1);
            finish = System.nanoTime();
        	timeElapsedRemoveList = finish - start;
        }

        // Iterate through array + linkedlist -> print all indexes
        System.out.println("\nArrayList Index:");
        start = System.nanoTime();
        for (int i = 0; i <arrayList.size(); i++) 
        {
            System.out.print(arrayList.get(i)+ " ");
        }
        finish = System.nanoTime();
    	long timeElapsedIterateArray = finish - start;

        System.out.println("\n\nLinkedList Index:");
        start = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++)
        {
            System.out.print(linkedList.get(i) + " ");
        }
        finish = System.nanoTime();
    	long timeElapsedIterateList = finish - start;

    	System.out.println("\nArray Filled in: " + timeElapsedArrayFill + " | VS | Linked List Filled in: " + timeElapsedListFill);
    	System.out.println("Array Middle in: " + timeElapsedMiddleArray + " | VS | Linked List Middle in: " + timeElapsedMiddleList);
    	System.out.println("Array Removed 0+Last in: " + timeElapsedRemoveArray + " | VS | Linked List 0+Last in: " + timeElapsedRemoveList);
    	System.out.println("Array Iterated in: " + timeElapsedIterateArray + " | VS | Linked List Iterated in: " + timeElapsedIterateList);

    }
}

/*EXAMPLE INPUT/OUPUT 
Middle element of ArrayList: 4
Middle element of LinkedList: 15

ArrayList Index:
14 20 1 3 4 8 19 15 15 20 2 5 8 5 1 6 7 18 2 18 11 3 5 6 18 2 18 12 6 13 16 18 14 10 6 2 12 11 15 4 1 19 6 8 4 3 11 20 19 2 4 10 19 18 16 7 6 12 10 11 4 7 19 1 3 10 19 20 1 12 14 8 13 20 6 6 17 3 8 2 18 13 8 11 1 14 15 2 15 13 9 1 1 6 11 3 6 2 11 20 13 19 2 19 11 4 12 20 6 14 8 8 14 16 14 16 9 5 18 6 4 16 14 8 12 14 12 3 7 4 15 19 6 12 5 12 16 9 2 1 17 4 7 11 12 14 13 2 7 16 9 3 17 6 6 8 7 7 2 12 8 7 19 5 14 11 9 5 7 13 8 18 12 4 13 5 2 15 2 4 18 19 20 13 7 17 20 14 8 8 10 16 3 11 18 9 10 3 20 1 17 20 4 18 20 12 7 15 19 20 13 3 20 2 8 19 13 12 1 18 8 19 15 10 20 9 17 15 10 13 17 16 13 16 4 10 14 10 4 17 8 4 9 18 3 1 19 3 4 19 17 15 7 10 16 6 18 12 20 20 2 1 4 10 7 15 20 5 4 7 7 4 12 15 7 6 9 15 11 12 15 18 15 18 9 14 11 4 17 4 2 16 2 3 18 19 16 8 5 16 15 19 10 18 11 13 7 15 16 5 3 14 11 18 17 18 10 2 11 19 10 18 8 14 2 14 17 7 3 12 7 7 3 1 1 4 10 11 12 11 18 7 15 5 7 18 4 7 10 16 13 9 12 1 13 15 6 19 3 2 8 18 2 13 11 6 10 11 17 4 3 1 13 4 11 9 7 11 7 7 5 18 19 1 19 1 7 6 9 14 11 8 12 10 13 2 13 19 10 13 18 12 7 15 18 10 20 6 16 11 16 15 2 1 19 3 16 14 20 20 13 3 1 13 11 12 5 15 8 13 6 4 12 11 10 17 9 7 16 17 9 20 20 10 7 1 15 19 19 5 20 4 16 2 9 17 12 16 6 8 11 3 17 10 16 10 13 16 2 8 17 4 2 17 2 1 19 9 1 17 2 16 12 19 11 10 15 16 11 3 3 16 16 7 7 5 16 4 7 4 4 13 14 8 12 19 3 19 9 18 12 5 12 10 12 8 19 20 8 19 17 4 17 15 9 7 16 3 15 5 6 4 17 5 7 17 6 5 11 6 14 1 12 15 14 8 20 4 18 8 14 20 13 20 3 10 3 17 8 10 18 6 11 1 12 17 4 19 9 3 5 6 10 19 18 11 10 16 15 7 13 2 7 20 19 14 19 13 14 1 20 5 12 10 13 10 20 1 13 11 12 5 14 8 5 11 16 6 15 17 6 3 16 5 2 3 8 14 10 19 2 9 2 19 6 17 6 12 11 13 3 11 4 20 18 3 8 7 20 2 10 19 16 19 19 6 7 14 11 12 7 17 19 19 4 14 7 16 15 10 7 13 5 20 12 7 12 16 12 17 17 8 10 3 18 5 9 1 14 15 9 20 12 18 5 20 5 5 7 13 15 9 9 8 2 7 12 14 13 3 16 3 7 16 4 12 12 17 20 6 20 11 9 3 18 11 8 4 17 15 3 10 12 20 1 8 4 14 17 13 17 11 19 5 6 7 7 18 5 20 11 9 3 19 3 8 8 3 8 11 8 6 2 15 7 4 7 19 3 2 2 5 15 20 17 13 18 3 19 5 10 2 5 5 1 5 8 12 19 3 20 20 11 13 5 10 11 16 3 17 17 4 12 13 20 4 13 17 16 13 1 18 15 14 8 11 5 11 7 5 11 10 6 17 4 12 3 13 9 17 1 12 3 10 10 9 16 16 9 14 14 2 4 20 16 9 6 7 3 3 17 17 20 9 12 12 17 15 8 15 5 6 13 6 10 2 12 10 18 6 7 16 2 4 13 11 8 6 12 17 3 15 17 11 13 20 11 1 1 10 17 5 10 4 14 20 5 18 19 11 19 18 20 11 3 16 15 16 19 14 14 1 5 17 16 8 11 6 16 10 12 1 13 1 5 11 18 10 3 16 18 4 10 19 12 3 17 15 10 10 19 4 16 14 6 7 13 11 17 3 9 5 14 8 9 13 2 2 19 12 19 3 18 5 5 10 3 19 8 19 15 5 10 5 10 9 12 3 16 4 12 20 19 19 7 3 8 17 12 5 15 5 6 10 2 7 6 2 17 16 9 6 10 5 4 16 16 6 

LinkedList Index:
18 15 8 13 10 16 15 14 6 19 12 13 8 11 17 15 14 17 13 20 14 10 10 10 17 7 19 2 2 4 8 14 18 13 20 13 10 20 7 1 16 5 10 14 15 4 13 13 7 19 3 20 2 4 9 1 2 14 1 2 3 9 13 20 8 13 1 5 2 3 10 4 14 14 1 11 4 12 20 15 16 2 16 17 9 4 1 10 13 18 10 13 17 15 13 4 17 7 3 20 20 4 20 7 14 18 6 9 7 17 20 19 6 9 16 15 6 16 14 20 1 8 20 15 10 19 18 20 17 19 5 10 2 12 1 6 2 14 9 7 12 9 12 8 12 16 2 19 7 1 4 1 6 6 13 11 20 13 14 11 6 10 20 17 10 11 5 13 6 1 1 10 15 14 8 18 2 15 15 4 6 6 15 4 9 7 5 1 1 4 3 17 7 11 8 18 2 8 8 12 17 7 7 17 8 13 1 12 17 3 10 11 1 13 16 16 9 16 14 2 18 18 3 2 17 7 12 4 4 1 19 4 11 17 7 17 18 9 17 16 9 7 12 4 2 12 13 15 2 7 17 10 7 13 9 5 6 12 5 1 2 8 5 11 17 14 8 9 7 17 10 5 12 15 9 6 10 8 4 12 9 3 1 8 20 6 9 20 5 4 11 17 5 10 2 2 2 10 15 2 5 16 11 19 8 20 17 14 13 1 4 3 9 12 8 16 9 16 16 6 7 2 1 9 1 3 2 18 10 9 8 15 18 7 11 6 9 20 19 3 7 15 1 12 3 18 19 20 10 17 12 11 15 7 4 8 2 2 1 13 10 4 14 5 12 6 5 10 6 5 19 17 20 9 3 7 6 10 18 17 3 19 19 11 18 1 12 3 8 20 7 8 9 6 18 8 8 8 6 15 11 11 15 2 12 12 11 11 11 7 8 17 3 3 8 14 11 14 4 2 6 17 5 12 20 11 19 15 6 11 15 1 5 12 9 11 6 8 19 14 17 17 10 4 4 17 15 9 14 2 17 16 14 1 13 7 10 15 18 18 6 9 13 16 3 2 10 3 20 9 17 7 20 13 19 17 8 20 8 14 12 15 2 13 2 4 13 3 12 3 19 18 8 7 19 13 5 5 13 15 20 18 8 6 9 6 17 13 4 10 19 14 16 3 17 18 16 17 16 18 17 6 10 15 8 1 12 6 12 19 7 14 20 9 8 7 15 4 1 12 13 17 17 13 15 5 3 3 18 5 10 6 9 12 2 20 13 2 10 8 12 6 4 2 6 12 13 19 10 20 6 20 5 10 8 15 16 6 11 19 5 4 7 18 17 2 4 2 5 12 1 15 7 17 11 7 3 16 4 20 19 12 14 4 1 12 2 4 20 20 11 19 13 2 12 13 12 19 19 4 7 17 19 7 3 8 5 14 19 8 15 11 10 6 2 18 17 5 10 1 5 1 12 18 15 19 11 13 7 11 16 18 6 17 9 17 20 16 18 2 2 6 4 20 14 18 5 6 13 3 12 12 6 5 5 20 9 10 18 1 5 19 3 14 15 6 8 3 1 4 1 12 4 4 6 11 15 6 8 9 20 3 12 2 12 18 12 19 19 20 20 16 14 17 12 5 14 11 3 14 2 20 7 12 9 11 12 8 1 16 3 19 16 1 7 12 13 2 10 9 7 1 5 20 11 11 2 14 20 11 14 7 16 20 16 5 1 19 1 16 5 15 6 3 4 8 7 20 1 20 14 10 4 17 17 20 15 17 13 7 19 15 5 4 6 5 7 20 3 19 14 17 15 16 16 13 19 6 18 12 15 16 10 19 5 3 1 12 19 13 19 20 8 14 20 19 1 6 13 8 1 13 4 20 13 1 5 7 14 5 15 18 7 3 19 15 16 20 11 12 10 5 18 14 18 2 12 2 8 8 2 13 17 19 20 2 2 4 3 10 6 2 10 20 2 16 12 3 7 12 1 15 12 16 11 16 11 9 7 7 7 17 13 16 13 18 1 1 7 5 16 8 17 13 15 16 15 7 2 6 4 15 10 3 18 3 13 15 6 16 3 20 19 11 7 13 3 13 19 3 18 10 1 1 20 17 10 4 6 9 1 13 13 1 18 3 7 20 17 19 18 7 3 3 11 13 8 3 12 14 10 18 19 13 5 8 11 11 4 18 20 5 17 16 15 17 9 11 16 13 11 3 1 14 7 18 4 4 11 15 20 11 6 11 1 13 1 10 10 8 15 8 16 15 5 18 10 8 
Array Filled in: 315500 | VS | Linked List Filled in: 397000
Array Middle in: 4600 | VS | Linked List Middle in: 8000
Array Removed 0+Last in: 7700 | VS | Linked List 0+Last in: 4400
Array Iterated in: 17196800 | VS | Linked List Iterated in: 11286700
*/
