package wek3.day2;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		
		
		
	
	int arr[] ={3,4,5,2,2,1};
	List lst = (List) Arrays.asList(arr);
	System.out.println(((java.util.List<int[]>) lst).size());
	int arr1[] = {6,2,1,8};

	List lst1 = (List) Arrays.asList(arr1);
	System.out.println(((java.util.List<int[]>) lst1).size());
}

	
	}
