public class Girokonto extends Konto {
	private double limit;

	public Girokonto(int kontonummer, double saldo, double limit) {
		super(kontonummer, saldo);
		this.limit = limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public void zahleAus(double betrag) {
		double saldo = getSaldo();
		if (betrag <= saldo + limit) {
			saldo -= betrag;
			setSaldo(saldo);
		}
	}

	@Override
	public void info() {
		super.info();
		System.out.println("Limit: " + limit);
	}
}
