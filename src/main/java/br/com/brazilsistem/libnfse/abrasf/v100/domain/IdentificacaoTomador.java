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
@Root
public class IdentificacaoTomador extends NFSBase {

    @Element(name = "CpfCnpj")
    private CpfCnpj cpfOuCnpj;

    @Element(name = "InscricaoMunicipal", required = false)
    private String inscricaoMunicipal;

}
