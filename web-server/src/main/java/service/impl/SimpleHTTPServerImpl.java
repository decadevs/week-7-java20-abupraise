package service.impl;

import service.HTTPServerService;
import util.ClientRequestHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static config.ServerConfig.PORT;

public class SimpleHTTPServerImpl implements HTTPServerService {
    @Override
    public void start(int port) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port: " + port);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");
                new Thread(new ClientRequestHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

