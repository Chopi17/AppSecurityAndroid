package com.example.secu_app.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class getJSON {

    public static final String BASE_URL = "https://6007f1a4309f8b0017ee5022.mockapi.io/api/m1/";
    public static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    /*
    public getUser create(Class<getAccount> retrofitInterfaceClass) {
        return null;
    }

    public getAccount create(Class<getAccount> retrofitInterfaceClass){
        return null;
    }
     */
/*
    private void setBaseUrl(){
        if (fileName != null) {
            try {
                //open the file and retrieve the inputStream
                InputStream inputstream = new FileInputStream(fileName);
                if (inputstream != null) {
                    // open a reader on the inputStream
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputstream));

                    // String to use to store read lines
                    String str;
                    StringBuilder buf = new StringBuilder();

                    // Read the file
                    while ((str = reader.readLine()) != null) {
                        buf.append(str + "\r\n");
                    }
                    // Close the reader
                    reader.close();
                    // Close the inputStream
                    inputstream.close();
                    // Affect the text to the textView
                    textViewFile.setText(buf.toString());
                }
            } catch (java.io.FileNotFoundException e) {
                Context Url = setBaseUrl();
                Toast.makeText(Url , "FileNotFoundException", Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                Toast.makeText(this , "FileNotFoundException", Toast.LENGTH_LONG).show();
            }
        }
    }
 */
}