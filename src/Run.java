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
			for (int x=0;x<words.length;x++)
			{
				String currentWord=words[x];
				if (currentWord.charAt(0)=='a')
				{
					currentWord="x";
				}
				else if (currentWord.charAt(0)=='b')
				{
					currentWord="y";
				}
				else if (currentWord.charAt(0)=='z')
				{
					currentWord="w";
				}

				else if (currentWord.charAt(0)=='c')
				{
					currentWord="z";
				}

				else if (currentWord.charAt(0)=='d')
				{
					currentWord="a";
				}

				else if (currentWord.charAt(0)=='e')
				{
					currentWord="b";
				}

				else if (currentWord.charAt(0)=='f')
				{
					currentWord="c";
				}

				else if (currentWord.charAt(0)=='g')
				{
					currentWord="d";
				}

				else if (currentWord.charAt(0)=='h')
				{
					currentWord="e";
				}

				else if (currentWord.charAt(0)=='i')
				{
					currentWord="f";
				}

				else if (currentWord.charAt(0)=='j')
				{
					currentWord="g";
				}

				else if (currentWord.charAt(0)=='k')
				{
					currentWord="h";
				}

				else if (currentWord.charAt(0)=='l')
				{
					currentWord="i";
				}

				else if (currentWord.charAt(0)=='m')
				{
					currentWord="j";
				}

				else if (currentWord.charAt(0)=='n')
				{
					currentWord="k";
				}

				else if (currentWord.charAt(0)=='o')
				{
					currentWord="l";
				}

				else if (currentWord.charAt(0)=='p')
				{
					currentWord="m";
				}

				else if (currentWord.charAt(0)=='q')
				{
					currentWord="n";
				}

				else if (currentWord.charAt(0)=='r')
				{
					currentWord="o";
				}

				else if (currentWord.charAt(0)=='s')
				{
					currentWord="p";
				}

				else if (currentWord.charAt(0)=='t')
				{
					currentWord="q";
				}

				else if (currentWord.charAt(0)=='u')
				{
					currentWord="r";
				}

				else if (currentWord.charAt(0)=='v')
				{
					currentWord="s";
				}
				else if (currentWord.charAt(0)=='w')
				{
					currentWord="t";
				}

				else if (currentWord.charAt(0)=='x')
				{
					currentWord="u";
				}

				else if (currentWord.charAt(0)=='y')
				{
					currentWord="v";
				}
				output=output+currentWord;
			}
			System.out.println(output);
		}
		else 
		{
			for (int x=0;x<words.length;x++)
			{
				String currentWord=words[x];
				if (currentWord.charAt(0)=='x')
				{
					currentWord="a";
				}
				else if (currentWord.charAt(0)=='y')
				{
					currentWord="b";
				}
				else if (currentWord.charAt(0)=='w')
				{
					currentWord="z";
				}

				else if (currentWord.charAt(0)=='z')
				{
					currentWord="c";
				}

				else if (currentWord.charAt(0)=='a')
				{
					currentWord="d";
				}

				else if (currentWord.charAt(0)=='b')
				{
					currentWord="e";
				}

				else if (currentWord.charAt(0)=='c')
				{
					currentWord="f";
				}

				else if (currentWord.charAt(0)=='d')
				{
					currentWord="g";
				}

				else if (currentWord.charAt(0)=='e')
				{
					currentWord="h";
				}

				else if (currentWord.charAt(0)=='f')
				{
					currentWord="i";
				}

				else if (currentWord.charAt(0)=='g')
				{
					currentWord="j";
				}

				else if (currentWord.charAt(0)=='h')
				{
					currentWord="k";
				}

				else if (currentWord.charAt(0)=='i')
				{
					currentWord="l";
				}

				else if (currentWord.charAt(0)=='j')
				{
					currentWord="m";
				}

				else if (currentWord.charAt(0)=='k')
				{
					currentWord="n";
				}

				else if (currentWord.charAt(0)=='l')
				{
					currentWord="o";
				}

				else if (currentWord.charAt(0)=='m')
				{
					currentWord="p";
				}

				else if (currentWord.charAt(0)=='n')
				{
					currentWord="q";
				}

				else if (currentWord.charAt(0)=='o')
				{
					currentWord="r";
				}

				else if (currentWord.charAt(0)=='p')
				{
					currentWord="s";
				}

				else if (currentWord.charAt(0)=='q')
				{
					currentWord="t";
				}

				else if (currentWord.charAt(0)=='r')
				{
					currentWord="u";
				}

				else if (currentWord.charAt(0)=='s')
				{
					currentWord="v";
				}
				else if (currentWord.charAt(0)=='t')
				{
					currentWord="w";
				}

				else if (currentWord.charAt(0)=='u')
				{
					currentWord="x";
				}

				else if (currentWord.charAt(0)=='v')
				{
					currentWord="y";
				}
				output=output+currentWord;
			}
			System.out.println(output);
		}
	}
}
