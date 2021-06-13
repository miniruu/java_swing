package constants.others;

import valueObject.OLecture;

public class SameLecture {
	
	public OLecture one;
	public OLecture two;
	
	public SameLecture(OLecture one, OLecture two) {
		this.one = one;
		this.two = two;
	}

	
	public OLecture getOne() {
		return one;
	}
	public void setOne(OLecture one) {
		this.one = one;
	}
	public OLecture getTwo() {
		return two;
	}
	public void setTwo(OLecture two) {
		this.two = two;
	}
	
	
}
