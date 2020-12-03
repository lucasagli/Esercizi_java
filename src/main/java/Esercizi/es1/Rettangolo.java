package Esercizi.es1;

public class Rettangolo {
	private int altezza;
	private int base;
	private int area;

	public Rettangolo(int altezza, int base) {
		this.altezza = altezza;
		this.base = base;
		this.area = this.base * this.altezza;
	}

//	@Override
//	public String toString() {
//		return "Rettangolo [altezza=" + altezza + ", base=" + base + ", area=" + area + "]";
//	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}


}

