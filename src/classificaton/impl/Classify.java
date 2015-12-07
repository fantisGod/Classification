package classificaton.impl;
import java.util.LinkedList;

import classification.util.FileHelper;
import classification.util.Record;;

public class Classify {
	public static void main(String[] args) {
		LinkedList<Record> recordList=FileHelper.readFile("input/bank-additional-full.csv");
	}
}
