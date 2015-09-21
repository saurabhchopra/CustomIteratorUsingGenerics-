package com.srb.main.process;

import java.util.ConcurrentModificationException;
import java.util.List;

public class CustomIterator<E> {

	private List<E> list;
	private int position;
	private int lastPosition = -1;
	private int size;

	/**
	 * This is class constructor used to populate the class variables
	 * 
	 * @param list
	 */
	public CustomIterator(List<E> list) {
		this.list = list;
		size = list.size();
	}

	/**
	 * This method is used to get if list have next element
	 * @return boolean
	 */
	public boolean hasNext() {
		if (position != list.size()) {
			return true;
		}
		return false;
	}

	/**
	 * This method is used to get the next element from the list
	 * @return E
	 */
	public E next() {
		if (list.size() != size) {
			throw new ConcurrentModificationException();
		}
		E value = list.get(position);
		lastPosition = position;
		position++;
		return value;
	}

	/**
	 * This method is used to remove the element from list
	 */
	public void remove() {
		position = lastPosition;
		list.remove(lastPosition);
	}
}
