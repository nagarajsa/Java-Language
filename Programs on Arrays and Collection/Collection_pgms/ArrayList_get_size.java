package Collection_pgms;

import java.util.ArrayList;

public class ArrayList_get_size {
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		arrayList.add(0.0);
		arrayList.add(10);
		arrayList.add('A');
		arrayList.add("NAGU");
		arrayList.add(null);
		arrayList.add(100000);
		
		//System.out.println(arrayList.get(1));
		
		for (int i = 0; i < arrayList.size(); i++) {
                 arrayList.get(i);
			
		}
		System.out.println(arrayList);
		
		

	}

}
