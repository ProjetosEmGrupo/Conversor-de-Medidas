public class Conversao {
	
public String Resposta, Valor, s0, s1, s2, s3, s4;
public float Saida;

public void SairPrograma(){
		System.exit(0);
}

public void SelecionarMedida(String v) {
	Valor = v;
	if(Valor == "Comprimento") {
	s0 = "Cent�metro";
	s1 = "Metro";
	s2 = "Quil�metro";
	s3 = "Milha";
	}
	if(Valor == "Massa") {
	s0 = "Grama";
	s1 = "Quil�grama";
	s2 = "Tonelada";
	s3 = "Libra";
	}
	if(Valor == "Armazenamento") {
	s0 = "KiloByte";
	s1 = "MegaByte";
	s2 = "GigaByte";
	s3 = "TeraByte";
	}
	if(Valor == "Tempo") {
	s0 = "Segundo";
	s1 = "Minuto";
	s2 = "Hora";
	s3 = "Dia";
	}
	if(Valor == "Velocidade") {
	s0 = "M/s";
	s1 = "Km/h";
	s2 = "Mph";
	s3 = "N�";

}
}
public void Converter(String v, float CampoEntrada, String GrandezaEntrada, String GrandezaSaida) {
	if(v == "Comprimento") {
		if(GrandezaEntrada == GrandezaSaida) {
			Saida = CampoEntrada;
		}
		if(GrandezaEntrada == "Cent�metro" && GrandezaSaida == "Metro") {
			Saida = CampoEntrada/100;
		}
		if(GrandezaEntrada == "Cent�metro" && GrandezaSaida == "Quil�metro") {
			Saida = CampoEntrada/100000;
		}
		if(GrandezaEntrada == "Cent�metro" && GrandezaSaida == "Milha") {
			Saida = CampoEntrada/160934.4f;
		}
		if(GrandezaEntrada == "Metro" && GrandezaSaida == "Cent�metro") {
			Saida = CampoEntrada*100;
		}
		if(GrandezaEntrada == "Metro" && GrandezaSaida == "Quil�metro") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "Metro" && GrandezaSaida == "Milha") {
			Saida = CampoEntrada/1609.344f;
		}
		if(GrandezaEntrada == "Quil�metro" && GrandezaSaida == "Cent�metro") {
			Saida = CampoEntrada*100000;
		}		
		if(GrandezaEntrada == "Quil�metro" && GrandezaSaida == "Metro") {
			Saida = CampoEntrada*1000;
		}
		if(GrandezaEntrada == "Quil�metro" && GrandezaSaida == "Milha") {
			Saida = CampoEntrada/1.609f;
		}
		if(GrandezaEntrada == "Milha" && GrandezaSaida == "Cent�metro") {
			Saida = CampoEntrada*160934.4f;
		}
		if(GrandezaEntrada == "Milha" && GrandezaSaida == "Metro") {
			Saida = CampoEntrada*1609.344f;
		}
		if(GrandezaEntrada == "Milha" && GrandezaSaida == "Quil�metro") {
			Saida = CampoEntrada*1.609f;
		}
		
	}
	if(v == "Massa") {
		if(GrandezaEntrada == GrandezaSaida) {
			Saida = CampoEntrada;
		}
		if(GrandezaEntrada == "Grama" && GrandezaSaida == "Quil�grama") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "Grama" && GrandezaSaida == "Tonelada") {
			Saida = CampoEntrada/1000000;
		}
		if(GrandezaEntrada == "Grama" && GrandezaSaida == "Libra") {
			Saida = CampoEntrada/453.592f;
		}
		if(GrandezaEntrada == "Quil�grama" && GrandezaSaida == "Grama") {
			Saida = CampoEntrada*1000;
		}
		if(GrandezaEntrada == "Quil�grama" && GrandezaSaida == "Tonelada") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "Quil�grama" && GrandezaSaida == "Libra") {
			Saida = CampoEntrada*2.205f;
		}
		if(GrandezaEntrada == "Tonelada" && GrandezaSaida == "Grama") {
			Saida = CampoEntrada*1000000;
		}
		if(GrandezaEntrada == "Tonelada" && GrandezaSaida == "Quil�grama") {
			Saida = CampoEntrada*1000;
		}
		if(GrandezaEntrada == "Tonelada" && GrandezaSaida == "Libra") {
			Saida = CampoEntrada*2204.623f;
		}
		if(GrandezaEntrada == "Libra" && GrandezaSaida == "Grama") {
			Saida = CampoEntrada*453.592f;
		}
		if(GrandezaEntrada == "Libra" && GrandezaSaida == "Quil�grama") {
			Saida = CampoEntrada/2.205f;
		}
		if(GrandezaEntrada == "Libra" && GrandezaSaida == "Tonelada") {
			Saida = CampoEntrada/2204.623f;
		}
		
	}
	if(v == "Armazenamento") {
		if(GrandezaEntrada == GrandezaSaida) {
			Saida = CampoEntrada;
		}
		if(GrandezaEntrada == "KiloByte" && GrandezaSaida == "MegaByte") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "KiloByte" && GrandezaSaida == "GigaByte") {
			Saida = CampoEntrada/1000000;
		}
		if(GrandezaEntrada == "KiloByte" && GrandezaSaida == "TeraByte") {
			Saida = CampoEntrada/1000000000;
		}
		if(GrandezaEntrada == "MegaByte" && GrandezaSaida == "KiloByte") {
			Saida = CampoEntrada*1000;
		}
		if(GrandezaEntrada == "MegaByte" && GrandezaSaida == "GigaByte") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "MegaByte" && GrandezaSaida == "TeraByte") {
			Saida = CampoEntrada/1000000;
		}
		if(GrandezaEntrada == "GigaByte" && GrandezaSaida == "KiloByte") {
			Saida = CampoEntrada*1000000;
		}
		if(GrandezaEntrada == "GigaByte" && GrandezaSaida == "MegaByte") {
			Saida = CampoEntrada*1000;
		}
		if(GrandezaEntrada == "GigaByte" && GrandezaSaida == "TeraByte") {
			Saida = CampoEntrada/1000;
		}
		if(GrandezaEntrada == "TeraByte" && GrandezaSaida == "KiloByte") {
			Saida = CampoEntrada*1000000000;
		}
		if(GrandezaEntrada == "TeraByte" && GrandezaSaida == "MegaByte") {
			Saida = CampoEntrada*1000000;
		}
		if(GrandezaEntrada == "TeraByte" && GrandezaSaida == "GigaByte") {
			Saida = CampoEntrada*1000;
		}
	}
	if(v == "Tempo") {
		if(GrandezaEntrada == GrandezaSaida) {
			Saida = CampoEntrada;
		}
		if(GrandezaEntrada == "Segundo" && GrandezaSaida == "Minuto") {
			Saida = CampoEntrada/60;
		}
		if(GrandezaEntrada == "Segundo" && GrandezaSaida == "Hora") {
			Saida = CampoEntrada/3600;
		}
		if(GrandezaEntrada == "Segundo" && GrandezaSaida == "Dia") {
			Saida = CampoEntrada/86400;
		}
		if(GrandezaEntrada == "Minuto" && GrandezaSaida == "Segundo") {
			Saida = CampoEntrada*60;
		}
		if(GrandezaEntrada == "Minuto" && GrandezaSaida == "Hora") {
			Saida = CampoEntrada/60;
		}		
		if(GrandezaEntrada == "Minuto" && GrandezaSaida == "Dia") {
			Saida = CampoEntrada/1440;
		}
		if(GrandezaEntrada == "Hora" && GrandezaSaida == "Segundo") {
			Saida = CampoEntrada*3600;
		}
		if(GrandezaEntrada == "Hora" && GrandezaSaida == "Minuto") {
			Saida = CampoEntrada*60;
		}
		if(GrandezaEntrada == "Hora" && GrandezaSaida == "Dia") {
			Saida = CampoEntrada/24;
		}
		if(GrandezaEntrada == "Dia" && GrandezaSaida == "Segundo") {
			Saida = CampoEntrada*86400;
		}
		if(GrandezaEntrada == "Dia" && GrandezaSaida == "Minuto") {
			Saida = CampoEntrada*1440;
		}
		if(GrandezaEntrada == "Dia" && GrandezaSaida == "Hora") {
			Saida = CampoEntrada*24;
		}
		
	}
	if(v == "Velocidade") {
		if(GrandezaEntrada == GrandezaSaida) {
			Saida = CampoEntrada;
		}
		if(GrandezaEntrada == "M/s" && GrandezaSaida == "Km/h") {
			Saida = CampoEntrada*3.6f;
		}
		if(GrandezaEntrada == "M/s" && GrandezaSaida == "Mph") {
			Saida = CampoEntrada*2.237f;
		}
		if(GrandezaEntrada == "M/s" && GrandezaSaida == "N�") {
			Saida = CampoEntrada*1.944f;
		}
		if(GrandezaEntrada == "Km/h" && GrandezaSaida == "M/s") {
			Saida = CampoEntrada/3.6f;
		}
		if(GrandezaEntrada == "Km/h" && GrandezaSaida == "Mph") {
			Saida = CampoEntrada/1.609f;
		}		
		if(GrandezaEntrada == "Km/h" && GrandezaSaida == "N�") {
			Saida = CampoEntrada/1.852f;
		}
		if(GrandezaEntrada == "Mph" && GrandezaSaida == "M/s") {
			Saida = CampoEntrada/2.237f;
		}
		if(GrandezaEntrada == "Mph" && GrandezaSaida == "Km/h") {
			Saida = CampoEntrada*1.609f;
		}
		if(GrandezaEntrada == "Mph" && GrandezaSaida == "N�") {
			Saida = CampoEntrada/1.151f;
		}
		if(GrandezaEntrada == "N�" && GrandezaSaida == "M/s") {
			Saida = CampoEntrada/1.944f;
		}
		if(GrandezaEntrada == "N�" && GrandezaSaida == "Km/h") {
			Saida = CampoEntrada*1.852f;
		}
		if(GrandezaEntrada == "N�" && GrandezaSaida == "Mph") {
			Saida = CampoEntrada*1.151f;
		}
	}
	
	 float SaidaFloat = Saida;
	 Resposta = String.valueOf(SaidaFloat)+" "+GrandezaSaida+"(s)";
}
}
