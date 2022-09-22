package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Root(name = "IdentificacaoPrestador")
public class IdentificacaoPrestador {

    @Element(name = "Cnpj")
    private String cnpj;

    @Element(name = "InscricaoMunicipal", required = false)
    private String inscricaoMunicipal;

}
