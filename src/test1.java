public class test1 {
    public static void main(String[] args){
        getLength(5.1, 4.6);
    }
    public static void getLength(double len, double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
