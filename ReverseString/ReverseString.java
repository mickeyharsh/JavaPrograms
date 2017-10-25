import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

class ReverseString
{
	public static void main (String[] args) throws java.lang.Exception
	
{
		
		String str = "Subir";

		String rev = "";

		int end;

		char y;

		for(end=str.length()-1;end>=0;end--)

		{

		    y= str.charAt(end);

		    rev=rev+y;

		}

		System.out.println(rev);

	}

}
