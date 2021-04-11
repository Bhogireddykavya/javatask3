class MyThread implements Runnable {
String name;
Thread t;
MyThread (String thread){
name = threadname;
t =new Thread(this,name);
System.out.println("New thread:" + t);
t.start();
}
public void run() {
try{
for(int i=5;i>0;i--){
System.out.println(name + "Interrupted");
}
System.out.println(name + "exiting.");
}
}
class MultiThread {
public static void main(string args[]) {
new MyThread("One");
new MyThread("Two");
new MyThread("Three");
try{
Thread.sleep(10000);
}catch(InterruptedException e){
System.out.println("Main thread Interrupted");
}
System.out.println("Main thread exiting");
}
}
