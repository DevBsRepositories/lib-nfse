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
@Root(name = "IntermediarioServico")
public class IntermediarioServicoNFSe extends NFSBase {

    @Element(name = "RazaoSocial", required = false)
    private String razaoSocial;

    @Element(name = "CpfCnpj")
    private CpfCnpj cpfCnpj;

    @Element(name = "InscricaoMunicipal", required = false)
    private String inscricaoMunicipal;

}
