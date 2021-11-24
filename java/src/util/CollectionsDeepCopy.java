package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection객체들 copy하는 함수모음
 * @author DaeHyeonKim
 */
public class CollectionsDeepCopy {
	
	public static <T> List<T> copy(List<T> origin){
		List<T> copyList = new ArrayList<T>();
		for(int i =0; i < origin.size();i++) {
			copyList.add(origin.get(i));
		}//end for
		return copyList;
	}//copy
	
	
}//class
