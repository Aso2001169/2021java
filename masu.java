package final2021;
import java.util.*;
import java.util.Arrays;

public class masu {
    public static void masu(){
        int[][] arr=new int[5][5];
        // if(){
            Random random = new Random();
            int randomValue = random.nextInt(5);
            int randomValue2 = random.nextInt(5);
            int randomValue3 = random.nextInt(5);
            int randomValue4 = random.nextInt(5);
            int randomValue5 = random.nextInt(5);
            int randomValue6 = random.nextInt(5);

            System.out.println(randomValue);
            System.out.println(randomValue2);
            arr[randomValue][randomValue2]=1;
            arr[randomValue3][randomValue4]=1;
            arr[randomValue5][randomValue6]=1;
            System.out.println(Arrays.deepToString(arr));

        // }

    }
    
}
