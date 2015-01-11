package br.com.r2psoft.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

/**
 * Classe utilizada para recuperar um arquivo JSON a partir de uma url 
 * e efetuar o parse do mesmo.
 * @author Pedro Henrique
 */
public class JSONParser {

	/**
	 * Método que recupera um arquivo JSON a partir de uma url.
	 * @param url String - Url de onde será recuperado o arquivo JSON.
	 * @param params List<NameValuePair> - Parâmetros da url.
	 * @return InputStream
	 * @author Pedro Henrique
	 */
	public InputStream getJSONFromUrl(String url, List<NameValuePair> params) {
 
    	InputStream inputStream = null;
    	
        // Efetuando requisição HTTP
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setEntity(new UrlEncodedFormEntity(params));
 
            // Recuperando resposta do servidor
            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            inputStream = httpEntity.getContent();
            
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return inputStream;
        
    }
    
	/**
	 * Método que efetua o parser de um arquivo qualquer para JSONObject.
	 * @param inputStream InputStream - Arquivo.
	 * @return JSONObject
	 * @author Pedro Henrique
	 */
    public JSONObject parse(InputStream inputStream){
    	
    	JSONObject jObj = null;
    	String json = "";
    	String lastConvertedLine = "";
    	
    	//Lendo o arquivo JSON.
    	try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
            		inputStream, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                lastConvertedLine = line; 
            }
            
            inputStream.close();
            json = sb.toString();
            Log.e("JSON", json);
        } catch (Exception e) {
        	Log.e("Buffer Error", "Last line converted: " + lastConvertedLine);
            Log.e("Buffer Error", "Error converting result " + e.toString());
        }
 
        // Tentando efetuar o parse de String para JSONObject
        try {
            jObj = new JSONObject(json);            
        } catch (JSONException e) {
            Log.e("JSON Parser", "Error parsing data " + e.toString());
        }
        
        return jObj;
    }
}
