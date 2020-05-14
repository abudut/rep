package M5_Git;

import java.util.Objects;

public class AbuduTouray {
	 private int edat=20; private String tel="631182308";AbuduTouray(int e, String t) { edat=e; tel=t; }
	 
	public static void main(String[] args) {
		  
	}
	
	public AbuduTouray(AbuduTouray abudutouray) {
	    this.edat = abudutouray.edat;
	    this.tel = abudutouray.tel;
	}
	
	public String toString() { 
	    return "Edat: '" + this.edat + "', Telefon: '" + this.tel + "'";
	} 
	
	public boolean equals(Object o) {
	   
		if (this == o)
	        return true;
	    if (o == null)
	        return false;
	  
	    if (getClass() != o.getClass())
	        return false;
	    AbuduTouray abudutouray = (AbuduTouray) o;
	    return Objects.equals(edat, abudutouray.edat)
	            && Objects.equals(tel, abudutouray.tel);
	}
	
}
