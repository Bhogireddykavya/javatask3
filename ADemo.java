class AgeException extends Exception{
{
private int age;
AgeException(int age)
{
this.age=age;
}
public String toString()
{
return("Invalid Age:"+age);
}
}
class ADemo
{
public static void main(String a[])
{
int age=Integer.parseInt(a[0]);
try
{
if(age<18) throw new AgeExeception(age);
System.out.println("valid Age"+age);
}catch(AgeExeception ae)
{
Sytem.out.println(ae);
}
}
}