import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            int key = Integer.parseInt(st.nextToken());
            int value = 0;

            switch (order){
                case "add" :
                    value = Integer.parseInt(st.nextToken());
                    hm.put(key, value);
                    break;
                case "remove" :
                    hm.remove(key);
                    break;
                case "find" :
                    int result = hm.getOrDefault(key, -1);

                    if(result == -1){
                        System.out.println("None");
                    }
                    else{
                        System.out.println(result);
                    }
            }
        }

    }
}