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
@Root(name = "PrestadorServico")
public class PrestadorNfse extends NFSBase {

    @Element(name = "IdentificacaoPrestador")
    private IdentificacaoPrestador identificacaoPrestador;

    @Element(name = "RazaoSocial")
    private String razaoSocial;

    @Element(name = "NomeFantasia", required = false)
    private String nomeFantasia;

    @Element(name = "Endereco")
    private Endereco enderecoPrestador;

    @Element(name = "Contato", required = false)
    private Contato contatoPrestador;

}
