import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[] dr = {0,0,0,1,1,1,2,2,2};
        int[] dc = {0,1,2,0,1,2,0,1,2};

        // 입력 받기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int MaxVal = Integer.MIN_VALUE;
        int limit = N - 2;
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){

                int count = 0;
                for(int k = 0; k < 9; k++){
                    if(arr[i + dr[k]][j + dc[k]] == 1) {
                        count++;
                    }
                }

                MaxVal = Integer.max(MaxVal, count);
            }
        }

        System.out.println(MaxVal);

    }
}