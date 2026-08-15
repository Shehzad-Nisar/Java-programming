public class Parent {

    private void show(){
        System.out.println("Parent");
    }

    void display(){
        show();
    }
}

class Child extends Parent{
    void show(){
        System.out.println("child");
    }
}

class Test{
    static void main() {
        Parent obj = new Child();
        obj.display();
    }
}
