public class Main {

    private static final int POOL_SIZE = 64;
    private static final int PORT = 9999;

    public static void main(String[] args) {
        Server server = new Server(POOL_SIZE);
        server.start(PORT);
    }
}