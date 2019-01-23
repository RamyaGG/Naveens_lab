 package javaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedNumInArray {

	public static void main(String[] args) {
		int arr[]={2,12,5,4,12,3,4,2,4,5,12,5,4,5,3};
        int maxValue = 1;
        
		Map<Integer, Integer>storeMap = new HashMap<Integer,Integer>();
		for(Integer i : arr) {
			Integer count1  = storeMap.get(i);
			
			if(count1==null) {
				storeMap.put(i, 1);
			}else {
				storeMap.put(i, ++count1);
				if(count1>maxValue) {
				maxValue= count1;
			}
			}
		}
	  

		Set<Entry<Integer, Integer>> entitySet = storeMap.entrySet();
		for(Entry<Integer, Integer> entity: entitySet) {
			if(entity.getValue()==maxValue) {
				System.out.println("The most frequent element is:"+entity.getKey()+" "+"frequency is:"+entity.getValue());
				
				
			}
		}
		
	
		int element=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			int tempCount=0;
			
			for(int j=1;j<arr.length;j++){
				if(arr[j]==arr[i]){
					tempCount++;
				}
				if(tempCount>count){
					element=arr[i];
					count=tempCount;
				}
			}
		}
                  System.out.println("\nThe most frequent element is:"+element+" "+"frequency is:"+count);

                
       
		

	}

}
