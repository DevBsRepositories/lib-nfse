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
@JacksonXmlRootElement(localName = "IdentificacaoTomador")
public class IdentificacaoTomador extends NFSBase {

    @JacksonXmlProperty(localName = "CpfCnpj")
    private CpfCnpj cpfOuCnpj;

    @JacksonXmlProperty(localName = "InscricaoMunicipal")
    private int inscricaoMunicipal;

}
