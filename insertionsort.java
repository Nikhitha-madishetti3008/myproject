class InsertionSortExample 
{  
    public static void insertionSort(int array[])
	{  
        int n = array.length,i,key;  
        for (int j = 1; j < n; j++)
		{  
            key = array[j];  
             i = j-1;  
            while ( (i > -1) && ( array [i] > key ) )
			{  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
    public static void main(String args[])
	{    
        int[] arr1 ={1,98,54,3,877,56};  
        insertionSort(arr1);
        for(int i:arr1)
		{    
            System.out.print(i+" ");    
        }       
}   
}