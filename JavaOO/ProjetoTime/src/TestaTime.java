
public class TestaTime {
public static void main(String[] args) {
	Time t = new Time();
	t.setTime(4,20,0);
	System.out.println(t.exibirHoraUniversal());
	System.out.println(t.exibirHoraPadrao());
	t.setTime(15, 7, 9);
	System.out.println(t.exibirHoraUniversal());
	System.out.println(t.exibirHoraPadrao());
	t.setTime(12);
	System.out.println(t.exibirHoraPadrao());
} // main
} // TestaTime
