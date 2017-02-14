package shivam.com.chatbot3;

/**
 * Created by Shivam on 11-02-2017.
 */

public class ChatMessage {
    private boolean isImage,isMine;
    private String content;
    public ChatMessage(String message,boolean mine,boolean image){
        content=message;
        isImage=image;
        isMine=mine;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
