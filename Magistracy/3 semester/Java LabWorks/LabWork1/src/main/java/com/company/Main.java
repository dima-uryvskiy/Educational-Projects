package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void CreateXml(Element eElement, Document newDocument, Element elementNode, Element root)
    {
        String nameXml =  eElement.getElementsByTagName("name").item(0).getTextContent();
        String unitXml =  eElement.getElementsByTagName("unit").item(0).getTextContent();
        String priceXml =  eElement.getElementsByTagName("price").item(0).getTextContent();
        String quantityXml =  eElement.getElementsByTagName("quantity").item(0).getTextContent();

        Element element = newDocument.createElement("product");

        Element name = newDocument.createElement("name");
        name.appendChild(newDocument.createTextNode(nameXml));
        element.appendChild(name);

        Element unit = newDocument.createElement("unit");
        unit.appendChild(newDocument.createTextNode(unitXml));
        element.appendChild(unit);

        Element price = newDocument.createElement("price");
        price.appendChild(newDocument.createTextNode(priceXml));
        element.appendChild(price);

        Element quantity = newDocument.createElement("quantity");
        quantity.appendChild(newDocument.createTextNode(quantityXml));
        element.appendChild(quantity);

        elementNode.appendChild(element);
        root.appendChild(elementNode);
    }

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("Data.xml"));
        XPath xPath = XPathFactory.newInstance().newXPath();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a price: ");
        int inputPrice = in.nextInt();
        in.close();

        NodeList nodeList = (NodeList) xPath.compile("/shop/product").evaluate(document, XPathConstants.NODESET);

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document newDocument = docBuilder.newDocument();

        Element root = newDocument.createElement("Shop");
        newDocument.appendChild(root);

        Element elementsQuantity = newDocument.createElement("Elements-Quantity");
        root.appendChild(elementsQuantity);

        Element elementsPrice = newDocument.createElement("Elements-Price");
        root.appendChild(elementsPrice);

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node nNode = nodeList.item(i);
            Element eElement = (Element) nNode;

            if (Integer.parseInt(eElement.getElementsByTagName("quantity").item(0).getTextContent()) <= 2) {
                CreateXml(eElement, newDocument, elementsQuantity, root);

            } else if (Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent()) > inputPrice) {
                CreateXml(eElement, newDocument, elementsPrice, root);
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource source = new DOMSource(newDocument);
        StreamResult result = new StreamResult(new File("result.xml"));
        transformer.transform(source, result);
    }
}