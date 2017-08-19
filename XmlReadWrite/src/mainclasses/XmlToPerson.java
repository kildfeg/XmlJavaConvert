package mainclasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;

import pojo.Address;
import pojo.Person;

public class XmlToPerson {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		XStream xStream = new XStream();
		xStream.alias("PERSON", Person.class);
		xStream.alias("ADDRESS", Address.class);
		Person person = (Person) xStream.fromXML(readXml());

		System.out.println(person.getNAME() + " " + person.getADDRESS().getDISTRICT() + " " + person.getAGE());
	}

	private static String readXml() throws IOException {
		File xmlFile = new File("test.xml");
		Reader fileReader = new FileReader(xmlFile);
		BufferedReader bufReader = new BufferedReader(fileReader);
		StringBuilder sb = new StringBuilder();
		String line = bufReader.readLine();
		while (line != null) {
			sb.append(line).append("\n");
			line = bufReader.readLine();
		}
		String xml2String = sb.toString();
		System.out.println(xml2String);
		bufReader.close();
		return xml2String;

	}
}
