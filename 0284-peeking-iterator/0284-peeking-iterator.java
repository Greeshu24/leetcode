class PeekingIterator implements Iterator<Integer> {

    List<Integer>list=new ArrayList<>();
    int ptr=0;
    int size;
	public PeekingIterator(Iterator<Integer> iterator) {
        while(iterator.hasNext())
        {
            list.add(iterator.next());
        }
        size=list.size();
	    
	}
	public Integer peek() {
        return list.get(ptr);
	}
	
	public Integer next() {
	    int el=list.get(ptr);
        ptr++;
        return el;
	}

	public boolean hasNext() {
	    if(ptr<size)
        return true;
        return false;
	}
}