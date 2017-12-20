package com.invoice.Util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadandValidatePDF {
	private static final String FILE_NAME = "D:\\Docs\\Payslip.pdf";

	public static void validateandGetData() throws IOException {
		PdfReader reader;

		try {
			reader = new PdfReader(FILE_NAME);
			System.out.println(reader.getFileLength());
			System.out.println(reader.isTampered());
			System.out.println(reader.isEncrypted());
			int pages = reader.getNumberOfPages();
			for (int i = 1; i <= pages; i++) {
				String pageContent = PdfTextExtractor.getTextFromPage(reader, i);
				System.out.println("Content on Page " + i + ": " + pageContent);
								
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			validateandGetData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
