package classification.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class PropertyChoose {
	public static HashSet<String> Choose(LinkedList<Record> recordList,LinkedList<String> Property) {
		HashSet<String> propertySet=new HashSet<String>(Arrays.asList("age","job","marital"));
		return propertySet;
	}
}
