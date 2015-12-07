package classificaton.impl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

import classification.util.DecisionTree;
import classification.util.FileHelper;
import classification.util.PropertyChoose;
import classification.util.Record;;


public class Classify {
	public static void main(String[] args) {
		LinkedList<Record> recordList=FileHelper.readFile("input/bank-additional-full.csv");
		DecisionTree tree=new DecisionTree(recordList);
	}
}
