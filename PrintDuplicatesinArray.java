package com.lao.javaLearning;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] items = {10,25,36,10,58,74,36};
		int arraysize;
		arraysize=items.length;
		int count;
		
		for(int i=0;i<arraysize-1;i++ ) {
			count=1;			
			for(int j=i+1; j<arraysize;j++) {
				if(items[i]==items[j])
					count++;
				
			}
			if(count>1)
				System.out.println(items[i]);
			
		}
	}

}
