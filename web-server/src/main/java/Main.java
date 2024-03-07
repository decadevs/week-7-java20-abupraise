import service.impl.SimpleHTTPServerImpl;

import static config.ServerConfig.PORT;

public class Main {
    public static void main(String[] args) {
        SimpleHTTPServerImpl simpleHTTPServer = new SimpleHTTPServerImpl();

        simpleHTTPServer.start(PORT);
    }
}