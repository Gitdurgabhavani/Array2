1.What is the default value of Array for different data types?
Ans.java will assign the default value 0 to each element of the array in the case of an int array.
 Similarly, in the case of a boolean array, it will be false.
 In the case of a String array the default value is null in java.

2.Can you pass the negative number in Array size?
Ans.No,we cannot pass negative number in array size.

3.Where does Array stored in JVM memory?
Ans.In the heap area the array stored in jvm memory.

4.What are the disadvantages of Array?
Ans.The size of the array cannot be increased or decreased once it is declared—arrays have a fixed size.
Java cannot store heterogeneous data. It can only store a single type of primitives.

5.What is an Anonymous Array in java?Give an example?
Ans.An array in Java without any name is known as an anonymous array.
 Ex:class AnonymousArray{
    public static void printArray(int arr[])
         {
         for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);
          }
      }


6.What are the different ways to traverse an Array in java?
Ans.We can traverse through an array using for loop or forEach loop.

7.What is the difference between length and length() method Give an Examples. 
Ans.length -- It is a property of the Array type class.
    Ex: int[] a = {10,20,30};
        System.out.println(a.length)
    Output:3

ii) length() -- It is a mwthod of String class
    Ex: String[] names= {"Sachin","dhoni","yuvi"};
        System.out.println(names[0]);
    Output:Sachin
 

