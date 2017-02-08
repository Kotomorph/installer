package ru.cbr.buhot.installer;
import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Enter password: ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            String password=br.readLine();
            System.out.println(password);
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
