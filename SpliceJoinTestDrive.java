// SpliceJoin: Split a string given a length, and determine if a new string is a member of the permutations of the given string
// Revise code - determine equality without generating all permutations
public class SpliceJoinTestDrive {
    public static void main(String[] args) {
        SpliceJoin spliceJoinObj = new SpliceJoin();
        String S, v;
        int length;

        S = "abaca";
        v = "acaba";
        length = 2;
        
        System.out.println("S = " + S);
        System.out.println("v = " + v);
        System.out.println("length = " + length);
        System.out.println("isSpliceJoin = " + spliceJoinObj.isSpliceJoin(S, length, v));
    }
}

class SpliceJoin {
    String[] spliceJoin;
    String temp;
    int numOfSubs = 0, strLength = 0, startindex = 0;
    boolean isTrue = false;
    
    boolean isSpliceJoin(String s, int l, String v) {
        getSubstrings(s, l);
        permute(spliceJoin, 0, v);

        return isTrue;
    }

    int numberOfSubstrings(String s, int l) {
        strLength = s.length();

        if (strLength % 2 == 0) {
            numOfSubs = strLength / l; 
        } else if (strLength % 2 != 0) {
            numOfSubs = strLength / l + 1;
        }
        return numOfSubs;
    }

    void getSubstrings(String s, int l) {
        int i, j;

        numOfSubs = numberOfSubstrings(s, l);
        strLength = s.length();
        spliceJoin = new String[numOfSubs];
        
        for (i = 0, j = 0; j < strLength; i++, j += l) {
            spliceJoin[i] = s.substring(j, Math.min(j + l, strLength));
        }
    }
    
    void permute(String[] input2, int startindex, String v) {
        String[] input;
        int i, j;
        String result = "";
        
        if (input2.length == startindex) {
            for (i = 0; i < input2.length; i++) {
                result += input2[i];
            }
            if (v.equals(result)) {
                isTrue = true;
            }
        } else {
            for (i = startindex; i < input2.length; i++) {
                input = input2.clone();
                temp = input[i];
                input[i] = input[startindex];
                input[startindex] = temp;
                permute(input, startindex + 1, v);
            }
        }
    }
}
