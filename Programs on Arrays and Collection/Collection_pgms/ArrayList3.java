package Collection_pgms;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		 arrayList.add(0, 100);
		 arrayList.add(1,"NAGU");
		 arrayList.add(2, 300);
		 arrayList.add(3, "NAGU");
		 arrayList.add(4, 500);
		 
		 System.out.println(arrayList);
		 System.out.println("");
		 for(Object o:arrayList)
		 {
			 System.out.println(o);
		 }
	}

}
