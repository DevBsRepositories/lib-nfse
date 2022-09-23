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
@JacksonXmlRootElement(localName = "Endereco")
public class Endereco extends NFSBase {

    @JacksonXmlProperty(localName = "Endereco")
    private String logradouro;

    @JacksonXmlProperty(localName = "Numero")
    private String numero;

    @JacksonXmlProperty(localName = "Complemento")
    private String complemento;

    @JacksonXmlProperty(localName = "Bairro")
    private String bairro;

    @JacksonXmlProperty(localName = "CodigoMunicipio")
    private int codigoMunicipioIbge;

    @JacksonXmlProperty(localName = "Uf")
    private String unidadeFederativa;

    @JacksonXmlProperty(localName = "Cep")
    private int cep;
}
