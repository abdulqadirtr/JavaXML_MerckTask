package activity;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * This class read the XML document and retrieve nodes using XPath Parser output
 * Nodes values : a c h
 * 
 * @author Abdul Qadir
 */

public class MainActivity {

	public static void main(String[] args) throws XPathExpressionException {

		String fileName = "data/MerkTask_Solve.xml";

		try {

			ClassLoader classLoader = new MainActivity().getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());

			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

			// Creating XPathFactory object
			XPath xpath = XPathFactory.newInstance().newXPath();
			
			// Retrieve nodes with tag x2 and id = a1, from parent node x1
			NodeList list = (NodeList) xpath.evaluate("//x1/x2[@id = 'a1']", doc, XPathConstants.NODESET);
			for (int i = 0; i < list.getLength(); ++i) {
				Element x2 = (Element) list.item(i);
				System.out.println("x2 = " + x2.getTextContent());
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}
}
