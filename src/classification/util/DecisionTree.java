package classification.util;

import java.util.HashSet;
import java.util.LinkedList;

public class DecisionTree {
	private class Node{
	    
	}
	LinkedList<Record> recordList;
	HashSet<String> propertySet;
	public DecisionTree(LinkedList<Record> recordList){
		recordList=new LinkedList<Record>();
		this.recordList=recordList;	
	}
	
	
	
	public String Classify(Record record){
		String result="yes";
		return result;
	}
	
}

