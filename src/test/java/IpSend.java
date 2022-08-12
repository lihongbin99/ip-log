import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;

public class IpSend {

    public static void main(String[] args) {
        while (!Thread.interrupted()) {
            try {
                URL url = new URL("http://47.115.34.118:13520?name=company");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.getInputStream().close();
                System.out.println(LocalDateTime.now());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
