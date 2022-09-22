package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Root(name = "ConsultarNfseResposta")
public class ConsultaNfseResposta extends NFSBase {

    @ElementList(name = "ListaNfse", required = false)
    private List<CompartilhamentoNfse> listaCompartilhamentoNfse;

    @Element(name = "ListaMensagemRetorno", required = false)
    private String listaMensagemRetorno;
}
