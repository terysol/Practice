package practice.network;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.naver.com",80);
        // BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

        System.out.println("데이터 읽기 전");
        printWriter.println("GET / HTTP/1.1");
        printWriter.println();





        socket.close();
    }
}
