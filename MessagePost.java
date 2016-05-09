import java.util.*;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String userName;
    private String message;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        userName = author;
        message = text;
        timeStamp =  System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * suma un like si se le da
     */
    public void like()
    {
        likes++;
    }

    /**
     * quita un like del contador , si este es menos de 0 lo iguala a 0 
     */
    public void unLike()
    {
        if (likes < 0){
            likes = 0 ;
        }
        else{
            likes--;
        }
    }

    /**
     * metodo para añadir comentarios
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * metodo para introducir el texto 
     */
    public String getText()
    {
        return message;
    }

    /**
     * el tiempo
     */
    public long getTimeStamp()
    {
        return timeStamp;
    }

    /**
     * muestra todos los datos del post 
     */
    public void display()
    {
        System.out.println("User: " + userName);
        System.out.println("Message: " + message);
        System.out.println("Submitted :"  + (timeString(System.currentTimeMillis())));
        System.out.println(likes + " Likes");
        if(comments.size() == 0)
        {
            System.out.println("No comments");            
        }
        else
        {
            System.out.println("Comments : ");
            int cont = 1;
            for(String comment :comments){
                System.out.println(cont  + ":" + comment);
                cont++;
            }
        }
    }

    /**
     * metodo para trasformar el tiempo 
     */

    public String timeString(long time)
    {
        long tiempoTrans = (time - timeStamp)/1000;
        long min = (tiempoTrans /60);
        long sec = tiempoTrans-(min*60);
        return ("min " + min + "sec " +sec );
    }
}

