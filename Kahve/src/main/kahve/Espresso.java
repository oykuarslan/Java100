package main.kahve;

public class Espresso extends Kahve{
	private int kahvefiyatÄ±;
	
	@Override
	public void Fiyat(int _fiyat_) {
		kahvefiyatÄ± = _fiyat_;
		System.err.println("1 espresso");
		System.err.println("hesap: " + _fiyat_);
	}

}
