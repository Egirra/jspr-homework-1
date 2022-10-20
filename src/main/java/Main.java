public class Main {

    public static int POOl_SIZE = 64;
    public static int PORT = 9999;

    public static void main(String[] args) {
        Server server = new Server(POOl_SIZE);
        server.start(PORT);
    }
}
