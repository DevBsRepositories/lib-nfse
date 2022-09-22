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
@Root(name = "OrgaoGerador")
public class IdentificacaoOrgaoGerador extends NFSBase {

    @Element(name = "CodigoMunicipio")
    private int codigoMunicipioIbge;

    @Element(name = "Uf")
    private String uf;

}
