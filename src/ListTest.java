import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ListTest {
	public static void main(String[] args) {
		List<Set<String>> setlist = new ArrayList<Set<String>>();
		String[] str = {"1","2","3"};
		
		for(int i=0;i<30;i++){
			Set<String> strset = new HashSet<String>();
			Random rd = new Random();
			for(int j=0;j<rd.nextInt(10);j++){
				Random rd1 = new Random();
				strset.add(str[rd1.nextInt(3)]);
			}
			setlist.add(strset);
		}
		System.out.println(setlist);
		
		Map<Set<String>, Integer> setmap = new HashMap<Set<String>, Integer>();

		for (int i = 0; i < setlist.size(); i++) {
			if(setmap.containsKey(setlist.get(i))){
				Integer num = setmap.get(setlist.get(i));
				setmap.put(setlist.get(i), num+1);
			}else{
				setmap.put(setlist.get(i), 1);
			}
		}
		System.out.println(setmap);
		
		String key = "";
		int maxvalue= 0;
		Set<Set<String>> itset = setmap.keySet();
		Iterator<Set<String>> it = itset.iterator();
		while(it.hasNext()){
			Set<String> tmpset = it.next();
			int tmp = setmap.get(tmpset);
			
			if(maxvalue<tmp){
				maxvalue = tmp;
				key = tmpset.toString();
			}
		}
		System.out.println(key+"===="+maxvalue);
		
	}
}
