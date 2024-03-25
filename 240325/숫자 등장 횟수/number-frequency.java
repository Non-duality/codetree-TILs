import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hm = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        int key = -1;
        for(int i = 0; i < n; i++){
            key = Integer.parseInt(st.nextToken());
            if(hm.containsKey(key)){
                int count = hm.get(key) + 1;
                hm.put(key, count);
            }

            else{
                hm.put(key, 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            key = Integer.parseInt(st.nextToken());
            if(hm.containsKey(key)){
                sb.append(hm.get(key)).append(" ");
            }
            else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());
    }
}