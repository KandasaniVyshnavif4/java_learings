class Student
{
   int no;
   String name;
   public static void main(String args[])
   {
    Student s1=new Student();
    s1.no = 12;
    s1.name ="vyshnavi";
    Student s2 = new Student();
    s2.no=22;
    s2.name="mamatha";
    Student s3 = new Student();
    s3.no=34;
    s3.name = "hari";
    //since we have to create the array of students 
    //just like  if we want to create the array of int we use int array_name[] = new int[];
    //simillaraly for student
    Student array[]=new Student[3];
    array[0] = s1;
    array[1]=s2;
    array[2]=s3;
    for(Student s : array)
    {
        System.out.println(s.no+"   "+s.name);
    }
//
  //     for(int i=0;i<array.length;i++)
// {
    //    System.out.println(s[i].no+"   "+s[i]);
   // }


    
   }

}

