package Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class SnippetsTools {
	String url = "http://google-gruyere.appspot.com/716986045138/login?uid=";
	String urlNewSnippet = "http://google-gruyere.appspot.com/716986045138/newsnippet2?snippet=";
	HttpClient client = new DefaultHttpClient();

	public void logIn(String id, String password) throws IOException {
		String urlLogin = url + id + "&pw=" + password;
		HttpGet request = new HttpGet(urlLogin);
		HttpResponse response = client.execute(request);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		String line = "";
		while ((line = rd.readLine()) != null) {
			// System.out.println(line);
		}

	}

	public void createNewSnippet(String text) throws IOException {
		String urlS = urlNewSnippet + text;
		HttpGet request = new HttpGet(urlS);
		HttpResponse response = client.execute(request);
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		String line = "";
		while ((line = rd.readLine()) != null) {
			// System.out.println(line);
		}
	}

}