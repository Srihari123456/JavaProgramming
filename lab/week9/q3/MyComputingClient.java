import java.io.Serializable;
import java.util.*;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class MyComputingClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
	System.out.println("Enter the no.of integers");
	int[] tt = new int[sc.nextInt()];
	
	System.out.println("Enter the integers");

	for(int i=0;i<tt.length;i++)tt[i] = sc.nextInt();


        System.out.println("Sending the integers to the ServerSocket");

        objectOutputStream.writeObject(tt);

	InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

	int result = (int) objectInputStream.readObject();
        System.out.println("Received the sum of the numbers as "+result+" from: " + socket);
        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}