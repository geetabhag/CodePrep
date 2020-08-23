//Geet
public class NonRepeatChar {
	static char count[]=new char[256];
	
	static void getCharCountArray(String str) {
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			count[c]++;
		}
		
		
	}
	
	static int firstNonRepeating(String str)
	{ 
		
		getCharCountArray(str);
		int i;
		for(i=0;i<str.length();i++) {
			char c = str.charAt(i);
		if(count[c]==1) {
				return i;
				
			}
		}
		return i=-1;
	}
	
	public static void main (String[] args) 
    { 
        String str = "geeksfefgeeks"; 
        int index =  firstNonRepeating(str); 
          
        System.out.println(index == -1 ? "Either all characters are repeating " + 
              " or string is empty" : "First non-repeating character is " +  str.charAt(index)); 
    } 
}
