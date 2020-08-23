
public class ParseInt {
	
	public static void main (String[] args) throws Exception 
    {
		String num="";
		boolean isNegative =false;
		int i,result=0,j=0;
	
		if (num.length()==0) {
			throw new Exception("String cannot be empty");
		}
		else	if(num.charAt(0)=='-') {
			j=1;	
			isNegative =true;
		}
		
		for (i=j;i<num.length();i++)
		{
			result=result*10+(num.charAt(i)-'0');
		}
		System.out.println(isNegative? 0-result:result);
    }

}
