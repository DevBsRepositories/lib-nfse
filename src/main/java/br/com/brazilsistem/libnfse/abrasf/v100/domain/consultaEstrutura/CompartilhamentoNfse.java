package br.com.brazilsistem.libnfse.abrasf.v100.domain.consultaEstrutura;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import br.com.brazilsistem.libnfse.abrasf.v100.domain.EstruturaNfse;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "CompNfse")
public class CompartilhamentoNfse extends NFSBase {

    @JacksonXmlProperty(localName = "Nfse")
    private EstruturaNfse estruturaNfse;

}
