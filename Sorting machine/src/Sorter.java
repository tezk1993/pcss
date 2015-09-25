import java.util.Scanner;
public class Sorter {
static Scanner scanner = new Scanner(System.in);
static int actions = 0;
	public static void main(String[] args) {
		int[] arr =	new int[10];
		int numbers = 0;
		int k;
	
		System.out.println("Enter the amount of number you like to input (max 10) \n");
		numbers = Integer.parseInt(scanner.next());
		for (int i = 0; i < numbers; i++){
			System.out.println("Enter a number \n");
			arr[i] = Integer.parseInt(scanner.next());
			actions++;
		}
		System.out.println("these are the unsorted numbers \n");
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);
		}
		for (int i = arr.length; i >= 0; i--){
			for (int j = 0; j < i - 1; j++){
					k = j + 1;
				if (arr[j] > arr[k]){
					swap(j, k, arr);
				}
			}
		}
		System.out.println("these are the sorted numbers");
		for (int i = 0; i < arr.length; i++){

			System.out.println(arr[i]);
		}
		
	

		System.out.println("It took the program " + actions + " actions to sort");
	}
	private static void swap( int i, int j, int[] array){
		
		int temp;
		temp = array[i];
		actions++;
		array[i] = array[j];
		actions++;
		array[j] = temp;
		actions++;
	}
	

}

