package controller;

import dao.DJoin;
import valueObject.OHwewon;
import valueObject.OLogin;
	
public class CLogin {
	private DJoin dJoin;
	
	public CLogin(){
		this.dJoin = new DJoin();		
	}
	
	public boolean readHwewon(OHwewon oHwewon){
		if(dJoin.read(oHwewon)){
			return true;
		}else {
			return false;
		}
	}

	public OHwewon validate(OLogin oLogin){
		OHwewon oHwewon = this.dJoin.read(oLogin.getId());
		if(oHwewon != null) {
			if(oLogin.getPassword().equals(oHwewon.getPassword()))
				return oHwewon;
		}
		return null;
	}
	
	public OHwewon show(String id, String password){
		OLogin oLogin = new OLogin();
		
		oLogin.setId(id);
		oLogin.setPassword(password);
		OHwewon oHwewon = this.validate(oLogin);
		return oHwewon;
	}	
}
