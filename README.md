# JavaXML_MerckTask
A Java program to traverse XML document and find nodes using XPath Parser.

## Problem
Write a Java program that outputs the values of nodes with name **x2** and **id=“a1”** that are direct children of nodes with name **x1**

``` XML
<?xml version="1.0" encoding="UTF-8"?>
<root>
	<x1>
		<x2 id="a1">a</x2>
		<x2>b</x2>
		<x2 id="a1">c</x2>
	</x1>
	<x2>d</x2>
	<x2 id="a1">e</x2>
	<x1 id="a1">
		<y1>
			<x2 id="a1">f</x2>
		</y1>
		<x2>g</x2>
		<x2 id="a1">h</x2>
	</x1>
</root>
```

## Solution
XPath is an official recommendation of the World Wide Web Consortium (W3C). That's why i am using XPath Parser to find the required nodes in an XML file.

We need to traverse the XML document using XPath Parser and get the nodes with tag **x2** with **id 'a1'** which are direct children of **x1**.

#### Output 
The program Output form above XML document will be ** x2 = a, x2 = c, x2 = h ** which are direct children of **x1.** 

## Technologies Used:
Eclipse IDE
