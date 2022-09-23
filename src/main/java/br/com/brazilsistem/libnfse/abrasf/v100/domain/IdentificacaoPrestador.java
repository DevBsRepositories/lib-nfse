package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "IdentificacaoPrestador")
public class IdentificacaoPrestador {

    @JacksonXmlProperty(localName = "Cnpj")
    private String cnpj;

    @JacksonXmlProperty(localName = "InscricaoMunicipal")
    private String inscricaoMunicipal;

}
