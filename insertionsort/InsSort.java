package insertionsort;
public class InsSort 
{
    public int[] arr;
    public InsSort(int size)
    {
        arr = new int[size];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = (int) (Math.random()*5000);
        }
    }
    
    public void sort()
    {
        for(int j=1 ; j < arr.length ; j++)
        {
            int key = arr[j];
            int i = j-1;
            
            while(i>=0 && arr[i] > key)
            {
                arr[i+1] = arr[i];
                i = i - 1; 
            }
            
            arr[i+1] = key;
        }
    }
    
    public void printArray()
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
