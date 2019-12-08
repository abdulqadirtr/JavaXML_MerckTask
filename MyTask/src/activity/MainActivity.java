package activity;


import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * This class read the XML document and retrieve nodes using XPath Parser
 * output Nodes values : a c h
 * 
 * @author Abdul Qadir
 */

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
Document doc = DocumentBuilderFactory.newInstance()
.newDocumentBuilder()
.parse("C:\\Users\\ICH\\eclipse-workspace\\MyTask\\src\\data\\MerkTask_Solve.xml");

XPath xpath = XPathFactory.newInstance().newXPath();

NodeList list = (NodeList) xpath.evaluate("//x1/x2[@id = 'a1']", doc, XPathConstants.NODESET);
for(int i=0; i < list.getLength(); ++i) {
Element x2 =  (Element) list.item(i);
System.out.println("x2 = " + x2.getTextContent());
}        
	}
		catch(Exception e)
		{
			
		}

}
}
