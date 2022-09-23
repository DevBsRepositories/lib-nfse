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
@JacksonXmlRootElement(localName = "ConstrucaoCivil")
public class IdentificacaoConstrucaoCivil extends NFSBase {

    @JacksonXmlProperty(localName = "CodigoObra")
    private String codigoObra;

    @JacksonXmlProperty(localName = "Art")
    private String codigoArt;

}
