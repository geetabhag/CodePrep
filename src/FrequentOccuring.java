import java.util.HashMap;
import java.util.Map.*;

class FrequentOccuring {
  public static void main(String[] args) {
    int arr[] = {1, 5, 2, 1, 3, 2, 1}; 
    int i,count;
    
    HashMap<Integer,Integer> hp= new HashMap<Integer,Integer>();
    
    for (i=0;i<arr.length;i++)
    {
      if(hp.containsKey(arr[i]))
      {
        count = hp.get(arr[i]);
        count++;
        hp.put(arr[i],count);
        
      }
      else
      {
        hp.put(arr[i],1);
      }
    }
    
    //Find maximum value of a key
    int max_val=0,freq_key=0;
    
    for (Entry<Integer,Integer> e : hp.entrySet())
    {
      int val=e.getValue();
      if(max_val<val)
      {
        max_val=val;
        freq_key=e.getKey();
      } 
      
    }
    
    System.out.println(freq_key);
    
  }
}
