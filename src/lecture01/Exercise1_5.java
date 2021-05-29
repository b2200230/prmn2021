package lecture01;

public class Exercise1_5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80};

        for(int i=0;i<5;i++){
            if(score[i]<60){
                System.out.println(i + "番　" + score[i] + "点　不可");
            }
            else if(score[i]<70){
                System.out.println(i + "番　" + score[i] + "点　可");
            }
            else if(score[i]<80){
                System.out.println(i + "番　" + score[i] + "点　良");
            }
            else if(score[i]<90){
                System.out.println(i + "番　" + score[i] + "点　優");
            }
            else{
                System.out.println(i + "番　" + score[i] + "点　秀");
            }
        }
        System.out.println(".....");
        System.out.println("最高点：" + max(score) + "点");
        System.out.println("最低点：" + min(score) + "点");
        System.out.println("平均点：" + average(score) + "点");
        System.out.println(".....");
    }

    static int min(int[] score){
        int n,i;
        n=score[0];
        for(i=1;i<5;i++){
            if(n>score[i]){
                n=score[i];
            }
        }
        return n;
    }
    static int max(int[] score){
        int x,i;
        x=score[0];
        for (i=1;i<5;i++){
            if(x<score[i]){
                x=score[i];
            }
        }
        return x;
    }
    static double average(int[] score){
        int sum=0,i;
        double a;
        for (i=0;i<5;i++){
            sum=sum+score[i];
        }
        a=(double)sum/5;
        return a;
    }
}
