package br.com.brazilsistem.libnfse;

import br.com.brazilsistem.libnfse.abrasf.v100.domain.ConsultaNfseResposta;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class LibNfseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibNfseApplication.class, args);

		try {
			Serializer serializer = new Persister();
			File file = new File("src/main/resources/xmlTeste/NFSe202216.xml");
			ConsultaNfseResposta consultaNfseResposta = serializer.read(ConsultaNfseResposta.class, file);
			consultaNfseResposta.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
