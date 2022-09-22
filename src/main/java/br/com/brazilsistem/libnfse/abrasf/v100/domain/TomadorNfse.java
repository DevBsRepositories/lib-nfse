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
@Root(name = "TomadorServico")
public class TomadorNfse extends NFSBase {

    @Element(name = "IdentificacaoTomador", required = false)
    private IdentificacaoTomador identificacaoTomador;

    @Element(name = "RazaoSocial", required = false)
    private String razaoSocial;

    @Element(name = "Endereco", required = false)
    private Endereco endereco;

    @Element(name = "Contato", required = false)
    private Contato contato;

}
