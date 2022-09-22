package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Root(name = "Servico")
public class ServicoNfse extends NFSBase {

    @Element(name = "Valores")
    private ValoresNfse valores;

    @Element(name = "ItemListaServico")
    private String codigoItemServico;

    @Element(name = "CodigoCnae", required = false)
    private int codigoCnae;

    @Element(name = "CodigoTributacaoMunicipio", required = false)
    private String codigoTributacaoMunicipio;

    @Element(name = "Discriminacao")
    private String discriminacaoConteudo;

    @Element(name = "CodigoMunicipio")
    private int codigoMunicipioIbge;

}
