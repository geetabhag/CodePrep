import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PhilosopherStone {
    
    static int map[][];
    static int dp[][];
    static int out = 0;
    static int H, W;
    public static void main(String [] args) throws IOException {
        System.out.printf("Enter the Input"); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T != 0) {
            String hw[] = br.readLine().split(" ");
            H = Integer.parseInt(hw[0]);
            W = Integer.parseInt(hw[1]);
            map = new int[H][W];
            dp = new int[H][W];

            for(int i = 0; i < H; i++) {
                String in[] = br.readLine().split(" ");
                for(int j = 0; j < W; j++)
                    map[i][j] = Integer.parseInt(in[j]);
            }
            System.out.printf("%d\n", dp()); 
            T--;
        }
    }
    public static int dp() {
        for(int i = 0; i < W; i++)
            dp[0][i] = map[0][i];
        for(int i = 0; i < H - 1; i++)
            for(int j = 0; j < W; j++) {
                if(j > 0) 
                    dp[i+1][j-1] = Math.max(dp[i+1][j-1], dp[i+1][j-1] + map[i+1][j-1]);
				
				if(j < W-1) 
					dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i+1][j+1] +
				  map[i+1][j+1]);
				 
                dp[i+1][j] = Math.max(dp[i+1][j], dp[i+1][j] + map[i+1][j]);
            }
            for(int j = 0; j < W; j++) {
                out = Math.max(out, dp[H-1][j]);
            }
            return out;
    }
}
