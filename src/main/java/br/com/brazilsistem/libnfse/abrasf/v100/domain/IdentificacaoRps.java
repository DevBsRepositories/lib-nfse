package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "IdentificacaoRps")
public class IdentificacaoRps extends NFSBase {

    @JacksonXmlProperty(localName = "Numero")
    private int numeroRps;

    @JacksonXmlProperty(localName = "Serie")
    private String serieRps;

    @JacksonXmlProperty(localName = "Tipo")
    private int tipoRps;

}
