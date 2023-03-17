public class Main {

	public static void main(String[] args) {
		double v;
		double s;
		double K;
		double td;
		double c1;
		double c2;
		double Qw;
		double L;
		double tau;
		double h0;

		v = 0.2 * 83;
		s = 0.12;
		K = 54;
		td = (double) 2 / 24;
		c1 = 10;
		c2 = 6;

//		v = 0.2 * 83 * 24;
//		s = 0.12 * 24;
//		K = 54;
//		td = (double) 2 / 24 / 24;
//		c = 10;

		Qw = Math.sqrt(2 * K * v / s);
		if (Qw > (int) Qw && Qw <= ((int) Qw) + 0.5) {
			Qw = ((int) Qw) + 0.5;
		}
		else {
			Qw = Math.round(Qw);
		}

		Qw = 123;

		tau = Qw / v;
		if (Qw % 1 == 0) {
			System.out.println("-------------------=" + (((int) Qw) * c1) / tau);
			System.out.println("compare-------------------=" + c1 * v);
			L = K * v / Qw + s * Qw / 2 + c1 * v;
		}
		else {
			System.out.println("+++++++++++++++++=" + (((int) Qw) * c1 + c2) / tau);
			L = K * v / Qw + s * Qw / 2 + (((int) Qw) * c1 + c2) / tau;
		}
		h0 = v * td;
		if (h0 > (int) h0 && h0 <= ((int) h0) + 0.5)
			h0 = ((int) h0) + 0.5;
		else
			h0 = Math.round(h0);
		System.out.println("Оптимальный размер заказа Qw = " + Qw + " л");
		System.out.println("Общие затраты на управление запасами в единицу времени L = " + L + " руб/дн");
		System.out.println("Период поставки tau = " + tau + " дн");
		System.out.println("Точка заказа h0 = " + h0 + " л");
	}
}
