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
@Root(name = "CompNfse" )
public class CompartilhamentoNfse extends NFSBase {

    @Element(name = "Nfse")
    private EstruturaNfse estruturaNfse;

}
