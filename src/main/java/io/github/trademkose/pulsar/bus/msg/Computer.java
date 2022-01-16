package io.github.trademkose.pulsar.bus.msg;

public class Computer extends Product{
    private String mac_adress;
    private float price_tl;
	public String getMac_adress() {
		return mac_adress;
	}
	public void setMac_adress(String mac_adress) {
		this.mac_adress = mac_adress;
	}
	public float getPrice_tl() {
		return price_tl;
	}
	public void setPrice_tl(float price_tl) {
		this.price_tl = price_tl;
	}
	@Override
	public String toString() {
		return "Computer [mac_adress=" + mac_adress + ", price_tl=" + price_tl + ", getMac_adress()=" + getMac_adress()
				+ ", getPrice_tl()=" + getPrice_tl() + ", getId()=" + getId() + ", getCategory_name()="
				+ getCategory_name() + ", getPrice_usd()=" + getPrice_usd() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
