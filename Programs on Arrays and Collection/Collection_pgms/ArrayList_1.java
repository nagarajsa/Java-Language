package Collection_pgms;

import java.util.ArrayList;

public class ArrayList_1 {
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		 arrayList.add(100);
		 arrayList.add(200);
		 arrayList.add(300);
		 arrayList.add(400);
		 arrayList.add(500);
		 
		 //System.out.println(arrayList);
		 
		 for(Object o:arrayList)
		 {
			 System.out.println(o);
		 }
	}

}
