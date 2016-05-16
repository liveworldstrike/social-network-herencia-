import java.util.*;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost  extends PostWithCommments
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * metodo para introducir el texto 
     */
    public String getText()
    {
        return message;
    }

    /**
     * metodo que muestra de quien es creado el post 
     */
    public void  printShortSummary()
    {
        System.out.println("Esto es un post de texto creado por "+ getUsername());
    }
}

