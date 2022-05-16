public class CountVowel
{
	public static void main(String[] args)
	{
		String[] str={"YRM","MJK","UGJ","IMX","KQZ"};
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if((str[i].charAt(j)=='A'||str[i].charAt(j)=='E'||str[i].charAt(j)=='I'||str[i].charAt(j)=='O'||str[i].charAt(j)=='U'||str[i].charAt(j)=='Z')||(str[i].charAt(j)+1=='A'||str[i].charAt(j)+1=='E'||str[i].charAt(j)+1=='I'||str[i].charAt(j)+1=='O'||str[i].charAt(j)+1=='U'))
				{
					count++;
					break;
				}

			}

		}
		System.out.println(count);


	}
}