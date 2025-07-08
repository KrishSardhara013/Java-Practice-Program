//Implement a utility to get content from input url.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class url_content {
    public static String fetchContent(String urlString) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } finally {
            connection.disconnect();
        }
        return content.toString();
    }
    public static void main(String[] args) {
        try {
            String content ;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter url:");
            content = in.nextLine();
            fetchContent(content);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error fetching content: " + e.getMessage());
        }
    }
}
