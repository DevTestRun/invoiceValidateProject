package com.invoice.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ReadandValidateHtml {
	private static final String FILE_NAME = "D:\\Docs\\DO11862067 oct.html";
	static final String NEW_LINE_TOKEN = System.getProperty("line.separator");
	public static void readHtmlContent() {
		StringBuilder contentBuilder = new StringBuilder();
		try {
		    BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
		    String str;
		    while ((str = in.readLine()) != null) {
		        contentBuilder.append(str);
		    }
		    in.close();
		} catch (IOException e) {
		}
		String content = contentBuilder.toString();
		Document doc = Jsoup.parse(content);
		Elements links = doc.select("table");
		for (Element element : links) {
				for (Element ne : element.children()) {
					System.out.println("text : " + ne.text()+NEW_LINE_TOKEN);
				}
		}

	}
	
	public static void readData() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		WebClient webClient=new WebClient(BrowserVersion.CHROME);
		HtmlPage page=webClient.getPage(new WebRequest(new URL("file:\\\\D:/Docs/DO11862067%20oct.html")));
		
		webClient.getOptions().setJavaScriptEnabled(true);
		String content = page.asText();
		System.out.println(content);
	}
	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		readHtmlContent();
	}
	
}
