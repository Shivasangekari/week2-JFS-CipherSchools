public class Lecture9 {

int width;
int height;

void display(String item) {
    System.out.println(item +" Width "+width+" Height "+height);
}

public static void main(String[] args) {
    Chair shiva = new Chair();
    shiva.foo();
    }
}

class Chair extends Lecture9{
    void foo()
    {width=10;height=20; display("Chair");}

}

class Table extends Lecture9{ 
    void foo()
    {width=30;height=50; display("Table");}

}

class Almira extends Lecture9{
    void foo() 
    {width=100;height=200;display("Almira");}

}
