package lecture01;

public class kadai4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;

        for (int i = 0; i < 100; i++) {      //繰り返し処理をする回数がわかっているのでfor
            array[i] = i + 1;
            if (i % 2 == 0) {
                sum += array[i];        //sum=sum+array[i]と同じ
            }
        }
        System.out.println("sum = " + sum);
    }
}
