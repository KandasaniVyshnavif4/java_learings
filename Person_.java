// Create a class person with the filed firstname, lastname.
// Use parameterized method to set the values to the variables at runtime. 
//Create sub class Employee with the variable eno, edept, esal.
// Create parameterized method for setting the data and default method for display the information


public class Person_
{
    String First_name;
    String  Last_name;

    public Person_(String x,String y)
    {
        First_name = x;
        Last_name = y;


    }
    public void display()
    {
        System.out.println(First_name+Last_name);
    }

}
class Employee_ extends Person_
{
    int eno;
    int edept;
    int esal;
public Employee_(String x,String y)
{
    super(x,y);
}

    public void set(int a,int b , int c)
    {
        
        eno = a;
        edept = b;
        esal = c;

    }
    public void display()
    {
        super.display();
        System.out.println(eno + "\n" +edept +"\n"+ esal);
    }
}


// Modify the above program by creating a subclass of Employee called Department with the variablesdno, dname, experience. 
//Set parameterized method for setting the data and display all the information


class Department extends Employee_
{
    int dno;
    String dname;
    int experience;

    public Department(String x ,String y)
    {
        super(x,y);
    }
    public void set1(int n,String e , int c )
    {
        dno = n;
        dname = e;
        experience = c;
    }
    public void display()
    {
        super.display();{
            System.out.println(dno + "\n" + dname+"\n"+experience );    
        }
    }
}
class Person
{
    public static void main(String args[])
    {
        Department e = new Department("vyshnavi" , "kandasani");
        e.set(2,3,4);
        e.set1(100,"yess",900);
        e.display();
    }
} 
// Modify the above program by creating a subclass of Employee called Department with the variablesdno, dname, experience. 
//Set parameterized method for setting the data and display all the information


