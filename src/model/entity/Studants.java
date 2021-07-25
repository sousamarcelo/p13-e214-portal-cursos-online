package model.entity;

import java.util.Objects;

public class Studants {
	

	private Integer studantCode;

	
	public Studants() {
		
	}
	
	public Studants(Integer studantCode) {	
		this.studantCode = studantCode;
	}	

	public Integer getUserCod() {
		return studantCode;
	}

	public void setUserCod(Integer userCod) {
		this.studantCode = userCod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studantCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studants other = (Studants) obj;
		return Objects.equals(studantCode, other.studantCode);
	}	
	
}	
