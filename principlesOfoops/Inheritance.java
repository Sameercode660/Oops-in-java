package principlesOfoops;

public class Inheritance {
    public static void main(String[] args) {
        Sample2 object = new Sample2();

        System.out.println(object.num);

        Sample3 object1 = new Sample3();

        System.out.println(object1.num);
    }
}



class Sample1 {
    
    int num = 10;
    void display() {
        System.out.println("Hello, I am the method of parent class");
    }
}

class Sample2 extends Sample1 {

}
 
class Sample3 extends Sample1 {

}

class Sample4 extends Sample1 {

}
