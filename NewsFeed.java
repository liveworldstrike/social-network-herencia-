import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<Post> messages;
    private ArrayList<PhotoPost> photos;
    private ArrayList<JoinGroupPost> groups;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
    }

    /**
     * Add a post with a message
     * 
     * @message the message to introduce
     */
    public void addMessagePost(Post message)
    {
        messages.add(message);
    } 

    /**
     * Show the post
     */
    public void show(){
        for(Post message : messages){
            message.display();
        }
    }
}