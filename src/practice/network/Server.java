package practice.network;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Server {
    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(5000);
//        System.out.println("waiting...");
//        Socket socket= serverSocket.accept();
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bufferedWriter.write("hello server !");
//        serverSocket.close();
//        bufferedWriter.close();

        URL url = new URL("https://www.naver.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while(true){
            String line = bufferedReader.readLine();
            if(line == null) break;
            System.out.println(line);
        }
    }
}
