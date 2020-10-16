import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class MyComputingServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept(); 
        System.out.println("Connected with " + socket + "!");


        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

	int[] listOfIntegers = (int[]) objectInputStream.readObject();
        System.out.println("Received " + listOfIntegers.length + " integers from: " + socket);

        System.out.println("The integers are:");
	int sums = 0;
        for(int x:listOfIntegers){
		System.out.print(x+" ");
		sums += x;
	}
	System.out.println("In Server, their sum = "+sums);
	OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


        System.out.println("Sending this sum to the ClientSocket");
        objectOutputStream.writeObject(sums);


        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
    }
}