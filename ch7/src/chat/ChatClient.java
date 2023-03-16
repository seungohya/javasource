package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private BufferedReader consoleReader;
    private boolean running;

    public ChatClient(String serverAddress, int port) throws IOException {
        socket = new Socket(serverAddress, port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        running = true;
    }

    public void start() throws IOException {
        System.out.println("Connected to server.");
        System.out.println("Type 'quit' to exit.");

        // 메시지를 받아들이는 스레드 시작
        Thread messageReceiver = new Thread(() -> {
            try {
                while (running) {
                    String message = in.readLine();
                    if (message == null) {
                        break;
                    }
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.err.println("Error receiving message: " + e.getMessage());
            }
        });
        messageReceiver.start();

        // 사용자 입력을 처리하는 루프
        String userInput;
        while ((userInput = consoleReader.readLine()) != null) {
            out.println(userInput);
            if (userInput.equalsIgnoreCase("quit")) {
                running = false;
                break;
            }
        }

        // 종료
        consoleReader.close();
        out.close();
        in.close();
        socket.close();
        messageReceiver.interrupt();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java ChatClient <serverAddress> <port>");
            return;
        }

        String serverAddress = args[0];
        int port = Integer.parseInt(args[1]);

        try {
            ChatClient client = new ChatClient(serverAddress, port);
            client.start();
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }
}
