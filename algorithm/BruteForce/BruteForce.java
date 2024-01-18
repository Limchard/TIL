import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    for (int l=0;l<10;l++){
                        if (i==a&&j==b&&c==k&&d==l){
                            System.out.println("비밀번호는 "+i+j+k+l);
                        }
                    }
                }
            }
        }



    }
}
