package String;

public class Swapfirstandlastwordsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="I am from Testyantra";
String[] s = st.split(" ");
String temp=s[0];
s[0]=s[s.length-1];
s[s.length-1]=temp;
for (int i = 0; i < s.length; i++) {
	System.out.print(s[i]+" ");
}
System.out.println();
// 2nd method

s[0]=s[0]+" "+s[s.length-1];
s[s.length-1]=s[s.length-1]+" "+s[0];
s[0]=s[0].split(" ")[1];
s[s.length-1]=s[s.length-1].split(" ")[1];
for (int i = 0; i < s.length; i++) {
	System.out.print(s[i]+" ");
	}}

}
