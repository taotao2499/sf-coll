package SFtext;

public class Test2 {
    public static void main(String[] args) {

        //不死神兔问题
        //有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子
        //假如兔子都不死，问第二十个月的兔子对数为多少？
        //分析：
/*        int[] arr = new int[20];
        //2.
        arr[0] = 1;
        arr[1] = 1;
        //3.
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        //4.
        System.out.println(arr[19]);*/


        //求解2
        System.out.println(f(20));
    }
    public static int f(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
