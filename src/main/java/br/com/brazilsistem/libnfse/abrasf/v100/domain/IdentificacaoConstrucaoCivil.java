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
@Root(name = "ConstrucaoCivil")
public class IdentificacaoConstrucaoCivil extends NFSBase {

    @Element(name = "CodigoObra", required = false)
    private String codigoObra;

    @Element(name = "Art", required = false)
    private String codigoArt;

}
