package array;

import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        Integer[] arr = { 2, 3, 4, 1,5,9,15,24};
/*        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });*/

        //lambda完整表达式
/*        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        }
        );*/

        //lambda简化表达式
        Arrays.sort(arr,(o1, o2) -> o1 - o2 );











        System.out.println(Arrays.toString(arr));














    }
}
