package sn.ept.dic2.books.proxy;

public class ProxyPageCommandAccess implements PageCommandAccess{

	monUser utilisateur = new monUser();
	InstanceDbBooks db = new InstanceDbBooks();
	
	
	@Override
	public void getCommandePage(String username,String password) {
		if(accessDb(username,password)) {
			db.getCommandePage(username, password);	
		}
		System.out.println("Acces refusé.......");
		
		
	}
	
	
	public boolean accessDb(String username,String password) {
		
		return username==utilisateur.getNom() && password==utilisateur.getPassword();
				
	}
	
	
	
	

}
