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
@JacksonXmlRootElement(localName = "PrestadorServico")
public class PrestadorNfse extends NFSBase {

    @JacksonXmlProperty(localName = "IdentificacaoPrestador")
    private IdentificacaoPrestador identificacaoPrestador;

    @JacksonXmlProperty(localName = "RazaoSocial")
    private String razaoSocial;

    @JacksonXmlProperty(localName = "NomeFantasia")
    private String nomeFantasia;

    @JacksonXmlProperty(localName = "Endereco")
    private Endereco enderecoPrestador;

    @JacksonXmlProperty(localName = "Contato")
    private Contato contatoPrestador;

}
