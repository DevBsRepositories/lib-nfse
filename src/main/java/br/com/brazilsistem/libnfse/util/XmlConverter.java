package br.com.brazilsistem.libnfse.util;

import br.com.brazilsistem.libnfse.abrasf.v100.domain.consultaEstrutura.ConsultaNfseResposta;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

public class XmlConverter {

    public ConsultaNfseResposta read(String xml){
        try {
            ObjectMapper xmlMapper = XmlMapper.xmlBuilder()
                    .addModule(new JavaTimeModule())
                    .build();
            return xmlMapper.readValue(xml, ConsultaNfseResposta.class);
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
