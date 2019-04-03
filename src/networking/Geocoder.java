package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Geocoder {
	private static final String BASE = "https://maps.googleapis.com/maps/api/geocode/json?";
	private Function<String,String> encoder = s ->{
		try {
			return URLEncoder.encode(s, "UTF-8");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	};
	
	public String encodeAddress(List<String> address) {
		return address.stream().map(encoder).collect(Collectors.joining(","));
	}

	public String getData(List<String>address) {
		String encoded = encodeAddress(address);
		String response = "";
		try {
			URL url = new URL(String.format("%saddres=%s", BASE,encoded));
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openStream()))) {
				String line = "";
				while((line=br.readLine()) !=null) {
					response += "\n" + line;
				}
				
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
		return response;
		
	}
}
 