// make var a constant, cannot change value


package final_package;

public class FinalVariable {

    public void show() {
        final int num = 10; // final variable, its value cannot be changed
        num = 20; // This line would cause a compilation error
        System.out.println(num);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.show();
    }
}

