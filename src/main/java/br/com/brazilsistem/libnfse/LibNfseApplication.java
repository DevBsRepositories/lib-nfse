package br.com.brazilsistem.libnfse;

import br.com.brazilsistem.libnfse.abrasf.v100.domain.ConsultaNfseResposta;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class LibNfseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibNfseApplication.class, args);
        try {
            ObjectMapper xmlMapper = XmlMapper.xmlBuilder()
                    .addModule(new JavaTimeModule())
                    .build();

            File file = new File("src/main/resources/xmlTeste/NFSe202217165.xml");
            ConsultaNfseResposta consultaNfseResposta = xmlMapper.readValue(file, ConsultaNfseResposta.class);
            consultaNfseResposta.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
