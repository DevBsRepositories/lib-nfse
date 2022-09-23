package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "ConsultarNfseResposta")
public class ConsultaNfseResposta extends NFSBase {

    @JacksonXmlElementWrapper(localName = "ListaNfse")
    private List<CompartilhamentoNfse> listaCompartilhamentoNfse;

    @JacksonXmlProperty(localName = "ListaMensagemRetorno")
    private String listaMensagemRetorno;
}
