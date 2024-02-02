// WAP TO SERIALIZE AN BOJECT AND WRIT IT INTO A FILE

import java.io.Serializable;
import java.io.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

class Student implements Serializable
{
int roll;
String name;
public Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}
void show()
{
System.out.println("Roll="+this.roll+"\nName="+this.name);
}

}
class Serialize
{
public static void main(String[] args)
{
try
{
Student s=new Student(50,"Alexa");
FileOutputStream fos=new FileOutputStream("object.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
os.writeObject(s);
os.close();
fos.close();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}