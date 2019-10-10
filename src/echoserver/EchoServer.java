package echoserver;

public class EchoServer {
	public static final int portNumber = 6013;

	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(portNumber);
			
			while(true) {
				Socket client = socekt.accept();
				System.out.println("Got a request!");

}
