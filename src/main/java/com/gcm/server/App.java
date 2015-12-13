package com.gcm.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyCnVEcyOdr8FyGwz2bsMQf1zXglBx2aY58";
        Content content = createContent();

        POST2GCM.post(apiKey, content);
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bGUkMtnnWuI1dQfV3Ij4jahVvldsHWNy4zVPacAk8C1FFFibqok4smyz9ISKED86_XMpMfDhlzTCUYkZVdwZfVoTTgVvcGN5XbHCOjvnpxobW0r7rd2DhGIirqU3e_gttZfNNZ_");
        c.createData("Test Title", "Test Message");
        
        return c;
    }
}