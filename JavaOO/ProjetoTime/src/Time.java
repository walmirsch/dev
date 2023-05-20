
public class Time {
	private int hora;
	private int minuto;
	private int segundo;

	public void setTime(int hora, int minuto, int segundo) {
		// o usuário fornece valores válidos
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	} // setTime

public void setTime(int hora,int minuto) {
	this.hora = hora;
	this.minuto=minuto;
	this.segundo=0;
} // ssetTime

	public void setTime(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	} // setTime

	public void setTime() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	} // setTime

	public String exibirHoraUniversal() {
		// formato 24 horas
		return formataDig(hora) + ":" + formataDig(minuto) + ":" + formataDig(segundo);
	} // exibirHoraUniversal

	public String exibirHoraPadrao() {
		// formato 12 horas com am e pm
		String res, sufixo;
		if (hora == 0) {
			res = "12";
			sufixo = "am";
		} else if (hora == 12) {
			res = "12";
			sufixo = " PM";
		} else if (hora >= 1 && hora <= 11) {
			res = formataDig(hora);
			sufixo = " AM";
		} else {
			res = formataDig(hora - 12);
			sufixo = " PM";
		}
		return res + ":" + formataDig(minuto) + ":" + formataDig(segundo) + sufixo;
	} // exibirHoraPadrao

		private String formataDig(int valor) {
			return (valor < 10)? "0"+valor : ""+valor;
	}
} // time
