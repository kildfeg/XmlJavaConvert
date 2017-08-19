package mainclasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;

import pojo.Address;
import pojo.Person;

public class PersonToXML {
	public static void main(String[] args) throws FileNotFoundException {
		Address address = new Address();
		address.setDISTRICT("District");
		address.setCITY("City");

		Person person = new Person();
		person.setNAME("Name");
		person.setSURNAME("Surname");
		person.setADDRESS(address);
		person.setAGE(15);

		XStream xStream = new XStream();
		xStream.alias("PERSON", Person.class);
		xStream.alias("ADDRESS", Address.class);
		String XMLResult = xStream.toXML(person);

		xStream.toXML(person, new FileOutputStream("test.xml"));

		System.out.println(XMLResult);
	}
}
