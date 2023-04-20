package divisionby5;

import java.util.ArrayList;
import java.util.List;

public class DivisionBy5 {
    public static int[] divisionBy5 (int[] args){
        //int div[] = new int[]{};
        List<Integer> divisionBy5 = new ArrayList<>();
        for(int i = 0; i< args.length; i++){
            if (args[i] % 5 == 0){
                //return new int[]{args[i]};
                divisionBy5.add(args[i]);
            }
        }
        return divisionBy5.stream().mapToInt(i -> i).toArray();
    }
}
