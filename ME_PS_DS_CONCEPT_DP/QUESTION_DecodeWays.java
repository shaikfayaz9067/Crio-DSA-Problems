import java.util.*;

class DecodeWays {
    // Implement your Solution Here
    public int helper(int i, int n, String s, int[] dp){
        if(i==n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int singleChar=0,doubleChar=0;
        if(s.charAt(i)!='0'){
            singleChar=helper(i+1,n,s,dp);
        }
        if(i+1<n && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6'))){
            doubleChar=helper(i+2,n,s,dp);
        }
        dp[i]=(singleChar+doubleChar)%1000000007;
        return dp[i];
    }

    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=helper(0,n,s,dp);
        return res;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int result = new DecodeWays().numDecodings(s);
        System.out.println(result);
    }
}
