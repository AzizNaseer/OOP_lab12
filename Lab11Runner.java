package S2;

import java.util.ArrayList;

public class Lab11Runner {
   /* Person[] arr=new Person[10];
    static int count=0;
    public void add(Person p){
        for (int i=0;i<arr.length;i++){
            arr[count]=p;
            count++;
        }

    }
    public void display(Person p){
        for (int i=0;i<arr.length;i++){
            System.out.println(p);
        }

    }
    public void extend() {
        int x=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[x]!=null && arr[arr.length-1]!=null){
                arr=new Person[arr.length+1];
            }
        }
    }*/
    public static void main(String[] args) {
       /* Person[] arr=new Person[10];
        Teacher t=new Teacher("Aziz","1234","HOD","Computer science");
        Student s= new Student("Aziz1","978",123,4);
        arr[0]=t;
        arr[1]=s;
        arr[3]=new Student("Aziz2","357",192,2); */

        Student s= new Student("salman","7608",990,3);
        Teacher t= new Teacher("ALI","273","HOD","Computer sciences");
        HumanResource hr= new HumanResource();
        hr.add(s);
        hr.add(t);
        System.out.println(hr);
        hr.delete(t);
        System.out.println(hr);




    }


    }
