-->memeory locations in jdk
1)Stack 
2)Heap
**->every mothond in java has its own stack memory and A stack have only two columns and multiple rows one column is to key and another is value **A key would be the name of the variable and value .
** Objects are created in the heap memory now in that object there will be two parts one is storing the instance variables(the variables which we declare globally) and in the another part it will contain th emethod names
and as we know methods have its own stack memory. 
eg:class Student
{
int sno;           //instance variables
String sname;   //instance variables
public static void main(String args[])
{
int a; //ilocal variables
}
}
![image](https://github.com/user-attachments/assets/ee38edca-6d5f-4dd1-8bc9-36815d01e879)
And That particular object will have some address(lets say 1012) now this address will be stored in the Stack of main method  [object_name | address of that abject]
So that we can say that there is a link between Stack and Heap .

[STRINGS]
-->Unlike premitive data types like int,bool,char.....they satrt with small letters but in the case of string it starts with capital letter "String"like this this is because it is a class .
-->in java 
class Demo
{
    public static void main(String[] args)
    {
        String name = "Vyshnavi";        // in the backend it will create an object  like this " String name = new String ("Vyshnavi"); " since it is  a class if we want to make use of it we need to createa an object
        System.out.println(name);
    }
}

Explanation:
class Demo
{
    public static void main(String[] args)
    {
        String name = new String ("Vyshnavi");
        System.out.println(name);
    }
}

