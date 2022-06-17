import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfComputers = Integer.parseInt(st.nextToken());
        for (int i=0;i<numberOfComputers;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = 1;
            for(int j=0;j<b;j++) {
                if(result == 0) {
                    result = 10;
                }
                result = result * a % 10;
            }

            if(result == 0) {
                result = 10;
            }
            System.out.println(result);
        }
    }
}
