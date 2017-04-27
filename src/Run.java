import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are to create a Caesar Cipher program
		 * Read in a single letter or number indicating how much to shift by
		 * Read in a message
		 * Output the converted message.
		 * Give the user an option to decode the message as well.
		 * Remember:
		 * String line="Message";
		 * line=line.toUpperCase(); //line="MESSAGE"
		 * char letter=line.charAt(0); //letter='M'
		 */
		Scanner in=new Scanner(System.in);
		String input;
		String output="";
		String[] words;
		System.out.println("1.Decode\n 2.Encode");
		int type=in.nextInt();
		in.nextLine();
		System.out.println("Enter a sentance.");
		input= in.nextLine();
		input=input.toLowerCase();
		words=input.split("");
		if (type==2)
		{
			System.out.println("Okay what letter do you want to shift to?");
			String input2=in.nextLine();
			char shift=input2.charAt(0);

			for (int x=0;x<words.length;x++)
			{			
				char letter=input.charAt(x);
				if (letter>='a'&&letter<='z')
				{
					letter+=shift-'a';
					if (letter>'z')
					{
						letter-=26;
					}

				}
				output+=letter;
			}
			System.out.println(output);
		}
		else
		{
			System.out.println("Okay what letter did you shift by?");
			String input2=in.nextLine();
			char shift=input2.charAt(0);

			for (int x=0;x<words.length;x++)
			{
				char letter=input.charAt(x);
				if (letter>='a'&&letter<='z')
				{
					letter+='a'-shift;
					if (letter<'a')
					{
						letter+=26;
					}
				}
				output+=letter;
			}
			System.out.println(output);
		}

	}
}
