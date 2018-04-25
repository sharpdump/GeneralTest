/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generaltest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g
 */
public class http {

    public static void main(String args[]) {
        try {
            URL url = new URL("http://www.qq.com");
            HttpURLConnection conn = new HttpURLConnection(url) {
                @Override
                public void disconnect() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public boolean usingProxy() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void connect() throws IOException {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    BufferedReader br;
                    br = new BufferedReader(new InputStreamReader(getInputStream()));
                    System.out.println(br.read());
                }
            };
            conn.connect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(http.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(http.class.getName()).log(Level.SEVERE, null, ex);
        }

        return;
    }
}
