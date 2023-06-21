package Collection_pgms;

import java.util.ArrayList;

public class ArrayList_2 {
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		 arrayList.add(100);
		 arrayList.add("NAGU");
		 arrayList.add(300);
		 arrayList.add("MANJU");
		 arrayList.add(500);
		 
		 System.out.println(arrayList);
		 System.out.println("");
		 for(Object o:arrayList)
		 {
			 System.out.println(o);
		 }
	}

}
