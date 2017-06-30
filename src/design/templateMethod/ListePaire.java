package design.templateMethod;

import java.util.AbstractList;

public class ListePaire extends AbstractList<Integer> {

	public static void main(String[] args) {
		ListePaire liste = new ListePaire();
//		int i = 0;
		
//		while(i <= 200 ){
		for(Integer i: liste){
			System.out.println(i);
//			i = i+2;
		}
	}
	
	@Override
	public Integer get(int index) {
		if (index >= size()){
			throw new IndexOutOfBoundsException();
		}
		return index * 2;
	}

	@Override
	public int size() {
		return Integer.MAX_VALUE/2;
	}

}
