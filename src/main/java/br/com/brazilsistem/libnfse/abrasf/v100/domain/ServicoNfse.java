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
@JacksonXmlRootElement(localName = "Servico")
public class ServicoNfse extends NFSBase {

    @JacksonXmlProperty(localName = "Valores")
    private ValoresNfse valores;

    @JacksonXmlProperty(localName = "ItemListaServico")
    private String codigoItemServico;

    @JacksonXmlProperty(localName = "CodigoCnae")
    private int codigoCnae;

    @JacksonXmlProperty(localName = "CodigoTributacaoMunicipio")
    private String codigoTributacaoMunicipio;

    @JacksonXmlProperty(localName = "Discriminacao")
    private String discriminacaoConteudo;

    @JacksonXmlProperty(localName = "CodigoMunicipio")
    private int codigoMunicipioIbge;

}
