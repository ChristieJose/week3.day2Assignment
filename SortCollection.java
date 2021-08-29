package wek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortCollection {
	

		public static void main(String[] args) {
			
		}
		String arr[] = {"Google"," Microsoft","TestLeaf"," Maverick"};
		List<String>list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(" REVERSED LIST");
		System.out.println(list);

	}
		

}
