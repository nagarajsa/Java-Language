package Collection_pgms;

import java.util.ArrayList;

public class ArrayList_retain {
public static void main(String[] args) {
	
	ArrayList arrayList=new ArrayList();
	arrayList.add(10);
	arrayList.add(20);
	arrayList.add(30);
	arrayList.add(40);
	arrayList.add(50);
	
	ArrayList arrayList2=new ArrayList();
	arrayList2.add(40);
	arrayList2.add(50);
	arrayList2.add(60);
	arrayList2.add(70);
	arrayList2.add(80);
	
	arrayList.retainAll(arrayList2);
	
	System.out.println(arrayList);
	
}
}
