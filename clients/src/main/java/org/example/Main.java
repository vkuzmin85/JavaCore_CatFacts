import org.example.HttpClient;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpClient client = new HttpClient();
        client.read();
    }
}