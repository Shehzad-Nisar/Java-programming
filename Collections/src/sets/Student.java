package sets;


public class Student {
    String name;
    int age ;

    Student(String name, int age){
        this.name = name ;
        this.age = age ;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Student)){
            return false;
        }

        Student other = (Student) obj;

        return this.name.equals(other.name) && this.age== other.age;



    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }


}


