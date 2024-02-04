//Note sir has been thought two topics in lecturer (overloading and overriding), I have commented the overriding code while running overloading code and vice-verse

//overloading

 public class Lecture10 {
    
void add(int num1, int num2)
 {System.out.println(num1+num2);}

void add(int num1, int num2, int num3)
 {System.out.println(num1+num2+num3);}

void add(float num1, float num2)
 {System.out.println(num1+num2);}

void add(int num1, float num2)
 {System.out.println(num1+num2);}

void add(float num1, int num2)
 {System.out.println(num1+num2);}

public static void main(String[] args) {
    Lecture10 l = new Lecture10(); 
    l.add(12.2f, 300);
    
}

}


//overriding

/* abstract class Doctor{
    abstract void treatPatient();
    
}
class Physician extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Physician \nI Treat Patients using Medicines.");
        
    }

}

class Surgeon extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Surgeon \nI Treat Patients using Surgery!");
        
    }

}

class Dentist extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Dentist \nI Treat Patients Teeth");
        
    }

}

public class Lecture10 {
    public static void main(String[] args) {
        System.out.println("HI! I am Lucy! Receptioninst at Max Care");
        System.out.println("Who you are looking for ?");
        System.out.println("Press 1. Physician\n2. Surgeon \n3. Dentist");

        int choice = new java.util.Scanner(System.in).nextInt();

        Doctor doc=null;

        switch(choice) {

        case 1:

        doc = new Physician(); 
        break;

        case 2:

        doc = new Surgeon(); 
        break;

        case 3:

        doc = new Dentist(); 
        break;

        default:
        System.out.println("A Oh! Invalid Choice ");
        break;

}
        if (choice<0 || choice>3) { 
            System.exit(0);
        }
        else {
            doc.treatPatient();
        }
    }
} */
