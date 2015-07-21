package Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import org.apache.*;
import java.net.URL;
import java.net.URLConnection;

import org.omg.CosNaming.NamingContextExtPackage.URLStringHelper;

public class Snippets {

	 Snippets http = new Snippets();
		static String urlSnippet = "http://google-gruyere.appspot.com/561580555562/newsnippet2?snippet=";
	public static void main(String[] args) throws Exception {

	//	 Snippets http = new Snippets();
	//	String urlSnippet = "http://google-gruyere.appspot.com/716986045138/newsnippet2?snippet=";
		System.out.println("Testing 1 - Send Http GET request");
		logIn();
		createNewSnippet("mazarica");
	}

	// HTTP GET request
	private static void logIn() throws Exception {
		String url = "http://google-gruyere.appspot.com/561580555562/login?uid=iripop&pw=frunza";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());

	}

public static void createNewSnippet(String text) throws Exception {
String urlS = urlSnippet + text;
URL obj = new URL(urlS);
HttpURLConnection con = (HttpURLConnection) obj.openConnection();

// optional default is GET
con.setRequestMethod("GET");

int responseCode = con.getResponseCode();
System.out.println("\nSending 'GET' request to URL : " + urlS);
System.out.println("Response Code : " + responseCode);

BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();

while ((inputLine = in.readLine()) != null) {
	response.append(inputLine);
}
in.close();

// print result
System.out.println(response.toString());

}
}

