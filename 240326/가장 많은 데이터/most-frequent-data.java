import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hm = new HashMap<>();

        int max = -1;
        for(int i = 0; i < n; i++){
            String key = br.readLine();
            if(hm.containsKey(key)){
                int count = hm.get(key) + 1;
                hm.put(key, count);
                max = Math.max(max, count);
            }
            else{
                hm.put(key, 1);
            }

        }

        System.out.println(max);
    }
}