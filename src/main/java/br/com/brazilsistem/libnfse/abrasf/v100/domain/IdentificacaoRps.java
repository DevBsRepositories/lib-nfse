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
@Root(name = "IdentificacaoRps")
public class IdentificacaoRps extends NFSBase {

    @Element(name = "Numero", required = false)
    private int numeroRps;

    @Element(name = "Serie")
    private String serieRps;

    @Element(name = "Tipo")
    private int tipoRps;

}
