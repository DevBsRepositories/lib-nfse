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
@JacksonXmlRootElement(localName = "IntermediarioServico")
public class IntermediarioServicoNFSe extends NFSBase {

    @JacksonXmlProperty(localName = "RazaoSocial")
    private String razaoSocial;

    @JacksonXmlProperty(localName = "CpfCnpj")
    private CpfCnpj cpfCnpj;

    @JacksonXmlProperty(localName = "InscricaoMunicipal")
    private String inscricaoMunicipal;

}
