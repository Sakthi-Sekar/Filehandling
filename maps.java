package sana;

import java.util.HashMap;
import java.util.Map;

public class maps {
	public static void main(String[] args) {
		String x= "ARADHYA";
		char y[]= x.toCharArray();
		int size= y.length;
		Map<Character,Integer>map =new HashMap();
		int i=0;
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i],1);
				
			}
			else {
				int oldval=map.get(y[i]);
				int newval=oldval + 1;
				map.put(y[i],newval);
			}
			++i;
			}
		set<maps.Entry<charcter,integer>>
		hmap=map.keySet();
		for(Map<Character,Integer>data:heap) {
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
		}
			
	}


