package sn.ept.dic2.books.proxy;

public class InstanceDbBooks implements PageCommandAccess{
	
	
	@Override
	public void getCommandePage(String username,String passsorwd) {
		
		System.out.println("get "+username+" Command page");
		
	}
	
	

}
