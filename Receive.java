import java.io.*;
import java.net.Socket;

/**
 * @ClassName receive
 * @Description TODO
 * @Auther danni
 * @Date 2019/11/29 17:10]
 * @Version 1.0
 **/

public class Receive implements Runnable {
    private Socket client;
    private DataInputStream dis=null;
    private boolean isRunning;
    public Receive(Socket client) {
        this.client = client;
        isRunning=true;
        try {
            dis=new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            System.err.println("接收端初始化异常");
            release();
        }
    }

    public String receive(){
        try {
            return dis.readUTF();
        } catch (IOException e) {
            return null;
        }

    }

    @Override
    public void run() {
        while(isRunning) {
            String datas=receive();
            if(datas==null){
                release();
            }else{
                System.out.println(datas);
            }
        }
    }
    private void release() {
       isRunning=false;
       Utils.close(dis);
    }
}
