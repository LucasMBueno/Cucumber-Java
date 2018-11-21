package Steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {
	}

	@Entao("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
	}

	
	private int contador = 0;

	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int valor1) throws Throwable {
		contador = valor1;

	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int valor2) throws Throwable {
		contador +=valor2;
		
	}

	@Entao("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int resultado) throws Throwable {
		Assert.assertEquals(resultado, contador);
	}


	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
	  Calendar cal = Calendar.getInstance();
	  cal.set(Calendar.DAY_OF_MONTH, dia);
	  cal.set(Calendar.MONTH, mes -1);
	  cal.set(Calendar.YEAR, ano);
	  entrega= cal.getTime();
	}

	@Quando("^a entrega atrasar em (\\d+) (.dia|dias|mes|meses)$")
	public void aEntregaAtrasarEmDias(int data, String tempo) throws Throwable {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(entrega);
		if(tempo.equals("dias")) {
			cal1.add(Calendar.DAY_OF_MONTH, data);
		}
		if(tempo.equals("meses")) {
			cal1.add(Calendar.MONTH, data);
		}
		entrega= cal1.getTime();

	}

	@Entao("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String Dataformatada = format.format(entrega);
		Assert.assertEquals(data, Dataformatada);
	}

}
