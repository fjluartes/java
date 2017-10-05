// SpliceJoin: Split a string given a length, and determine if a new string is a member of the permutations of the given string
import java.util.ArrayList;
import java.util.List;

public class SpliceJoinTest {
    public static void main(String[] args) {
        SpliceJoin spliceJoin = new SpliceJoin();
        String str, v;
        int length;

        str = "abaca";
        length = 2;
        
        spliceJoin.isSpliceJoin(str, length);
    }
}

class SpliceJoin {
    String[] permuteArray;
    String[] splicejoin;
    
    void isSpliceJoin(String s, int l) {
        String[] spliceJoin = new String[s.length()];
        
        for (int i = 0; i < s.length(); i += l) {
            spliceJoin[i] = s.substring(i, Math.min(i + l, s.length()));
        }
      
        List<String> list = new ArrayList<String>();
    
        for(String str : spliceJoin) {
           if(str != null && str.length() > 0) {
              list.add(str);
           }
        }
    
        spliceJoin = list.toArray(new String[list.size()]);
        permute(spliceJoin, 0);
    }

    void permute(String[] input2, int startindex) {
        if (input2.length == startindex) {
            assignArray(input2);
        } else {
            for (int i = startindex; i < input2.length; i++) {
                String[] input = input2.clone();
                String temp = input[i];
                input[i] = input[startindex];
                input[startindex] = temp;
                permute(input, startindex + 1);
            }
        }
    }

    void assignArray(String[] input) {
        splicejoin = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            splicejoin[i] = input[i];
            System.out.print(splicejoin[i]);
        }
        System.out.println("");
    }
}
