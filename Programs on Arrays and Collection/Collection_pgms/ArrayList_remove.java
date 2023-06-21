package Collection_pgms;

import java.util.ArrayList;

public class ArrayList_remove {
	
	public static void main(String[] args) {
		
		ArrayList arrayList1=new ArrayList();
		 arrayList1.add('A');
		 arrayList1.add('B');
		 arrayList1.add('C');
		 arrayList1.add('D');
		 arrayList1.add('E');
		 
		 ArrayList arrayList2=new ArrayList();
		 arrayList2.add(10);
		 arrayList2.add(20);
		 arrayList2.add(30);
		 arrayList2.add(40);
		 arrayList2.add(50);
		 
		 
		//arrayList1.remove(4);
		arrayList1.removeAll(arrayList2);
		 
		 System.out.println(arrayList1);
		 
		 for(Object x: arrayList1)
		 {
			 System.out.println(x);
		 }
	}
	

}
