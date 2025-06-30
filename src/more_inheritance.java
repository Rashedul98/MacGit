interface A{
    void print();
}

interface B extends A{

}
µ
class C implements B{

    public void print() {

    }
}



public class more_inheritance {
    public static void main(String[] args){
        A obj = () -> {
            System.out.println("anonymous inner class");
        };
        obj.print();
    }
}
