import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @ClassName Messge
 * @Description TODO
 * @Auther danni
 * @Date 2019/12/1 10:27]
 * @Version 1.0
 **/

public class Message {
    private boolean isPrivate;
    private boolean isCommon;
    private boolean isSystem;
    private String data;
    public Message(String data,boolean isPrivate,boolean isCommon,boolean isSystem) {
        this.isPrivate=isPrivate;
        this.isCommon=isCommon;
        this.isSystem=isSystem;
        this.data=data;
    }

    public String getMessage() {
        return data;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public boolean isCommon() {
        return isCommon;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public String getData() {
        return data;
    }

    public void set(){


    }

}
