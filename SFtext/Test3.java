package SFtext;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(getCount(1));

    }
    public static int getCount(int day){
        if (day <= 0 || day>= 11){
            System.out.println("当前输入的时间有误");
            return -1;
        }
        if (day == 10){
            return 1;
        }
        return (getCount(day + 1)+1) * 2;
    }

}
