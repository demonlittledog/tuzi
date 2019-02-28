import java.util.Scanner;

public class tuzizongshu {
    public static void main(String[] args) {
        int [] month;
        Scanner s = new Scanner(System.in);
       int m = s.nextInt();
       month = new int[m];
        if (month.length > 0){
            for (int i=0;i<month.length;i++){
                if(i==0 || i==1){
                    month[0]=month[1]=1;
                }else{
                    month[i] = month[i-1]+month[i-2];
                }
                System.out.println((i+1)+"-"+month[i]*2);
            }
        }
    }


}
