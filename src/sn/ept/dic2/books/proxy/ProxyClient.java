package sn.ept.dic2.books.proxy;

public class ProxyClient {
		

	public static void main(String[] args) {
		
		String username = "aissatou";
		String password = "passer";
		PageCommandAccess commandPage = new ProxyPageCommandAccess();
		commandPage.getCommandePage(username, password);


	}

}
