import java.io.*;
class Palindrome
{
 public static void main(String args[])
 {
  String S1="MADAM";
  String rev="";
  for(int i=S1.length()-1;i>=0;i--)
  {
   char ch=S1.charAt(i);
   rev=rev+ch;
  }
   if(S1.equals(rev))
   System.out.println("Palindrome");
   else
   System.out.println("Not palindrome");
  }
 }
   
 