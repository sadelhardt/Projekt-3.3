public class Cast {
	public static void main(String[] args) {
		// Upcast
		Konto konto = new Girokonto(1020, 800., 2000.);
		konto.zahleAus(3000.);
		System.out.println(konto.getSaldo());

		// Downcast
		((Girokonto) konto).setLimit(2500.);
		konto.zahleAus(3000.);
		System.out.println(konto.getSaldo());
	}
}
