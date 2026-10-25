public class Palindrome{
public boolean isPalindrome(String val){
boolean isEqual=false;
String reversed=new StringBuilder(val).reverse().toString();
if(val.equalsIgnoreCase(reversed)){
isEqual=true;
}
return isTrue;
}

public static void main(String[] args){
if(args.length==0){
System.out.println("Provide a word to check if it is a Palindrome");
}
String input=args[0];
if(isPalindrome(input)){
System.out.println(" The given string"+input+"is Palindrome");
}
else{
System.out.println("The given string"+input+"is not a palindrome");
}}}

