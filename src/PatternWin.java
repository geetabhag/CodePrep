import java.util.*;
public class PatternWin {

	public static void main(String[] args) {
		
		List<String> shoppingCart= Arrays.asList("orange", "apple1", "apple", "banana", "orange", "banana");
		List<String> pattern1 = Arrays.asList("apple", "anything");
		List<String> pattern2 = Arrays.asList("anything", "anything","banana");
		List<List<String>> patterns = new ArrayList<List<String>>();
		patterns.add(pattern1);
		patterns.add(pattern2);
		String result= checkWinner(shoppingCart,patterns);
		//System.out.println(patterns.get(0).get(0));
		System.out.println(result);
		
	}
	
	public static String checkWinner(List<String> shoppingCart, List<List<String>> patterns)
	{
		int pIndex=0;
		int psIndex =0;
		String win="lose";
		for(String fruit: shoppingCart) 
		{
			if(patterns.size()>psIndex) 
			{
				int patternSize=patterns.get(psIndex).size();
				String compareFruit=patterns.get(psIndex).get(pIndex);
			
				if(patternSize>pIndex && 
					( fruit.equalsIgnoreCase(compareFruit) 
							|| "anything".equalsIgnoreCase(compareFruit) ) ) 
				{
					win="lose";
					pIndex++;
				}
			
				if(patterns.get(psIndex).size()<=pIndex) 
				{
					win="win";//only if a pattern matches
					pIndex=0;
					psIndex++;
				}
			
			}
			else
				break;
		}
		return win;
	}

}
