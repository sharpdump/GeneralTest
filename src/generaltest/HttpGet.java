/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generaltest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author g
 */
public class HttpGet {
    public static void main(String args[]) throws MalformedURLException, IOException{
        //System.setProperty("http.proxyHost", "localhost");
        //System.setProperty("http.proxyPort", "8888");
        URL url = new URL("http://www.qq.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        System.out.println(conn.getResponseCode());
    }
}
