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
@JacksonXmlRootElement(localName = "TomadorServico")
public class TomadorNfse extends NFSBase {

    @JacksonXmlProperty(localName = "IdentificacaoTomador")
    private IdentificacaoTomador identificacaoTomador;

    @JacksonXmlProperty(localName = "RazaoSocial")
    private String razaoSocial;

    @JacksonXmlProperty(localName = "Endereco")
    private Endereco endereco;

    @JacksonXmlProperty(localName = "Contato")
    private Contato contato;

}
