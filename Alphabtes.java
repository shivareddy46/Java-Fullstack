class Alphabets implements Runnable
{
public void run()
{
for(int i=65; i<92; i++)
{
System.out.println((char)i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
}
System.out.println("Alphabet class is ended");}}
class Numbers implements Runnable
{
public void run()
{
for(int i=0;i<=100;i++)
{
System.out.println(i);
try
{
Thread.sleep(700);
}
catch(Exception e)
{}
}
System.out.println("Number class ended");}}
class k20uf
{
public static void main(String args[])
{
Alphabets a=new Alphabets();
Numbers n=new Numbers();
Thread t1=new Thread(n);
t1.start();
Thread t2=new Thread(a);
t2.start();
System.out.println("Hello K20uf");}}