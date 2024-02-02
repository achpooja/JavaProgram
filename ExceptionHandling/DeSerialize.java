// WAP TO DESERIALIZE AN OBJECT AND READ FROM FILE
import java.io.Serializable;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

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
 class DeSerialize
{
public static void main(String [] args) throws ClassNotFoundException
{
try
{
FileInputStream fis=new FileInputStream("object.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Student sobj=(Student)ois.readObject();
sobj.show();
ois.close();
fis.close();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}

}
}