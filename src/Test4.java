public class Test4 {
    void noChange (int i, int j) {
        i = i + j;
        j = -j;
    }
}

class  callByValue {
    public static void main(String[] args){
        Test4 ob = new Test4();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
