public class Lecture12 {

// this keyword

int arg=5;

Lecture12()
{
    System.out.println("Hi ! i am default constructor");
}
Lecture12(int arg) {
this();
this.arg=arg;

}

public static void main(String[] args) {

int arg=10;

Lecture12 obj = new Lecture12(10);

System.out.println(obj.arg);

}

}
