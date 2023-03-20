public class Test3 {
    public static void main(String[] args){
        //计算第一季度的营业额
        int sum1 = getSum(10, 23, 45);
        //计算第二季度的营业额
        int sum2 = getSum(19, 23, 45);
        //计算第三季度的营业额
        int sum3 = getSum(18, 34, 45);
        //计算第四季度的营业额
        int sum4 = getSum(13, 34, 45);

        //计算全年的营业额
        int sum = sum1  + sum2 + sum3 + sum4;
        System.out.println(sum);
    }
    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
