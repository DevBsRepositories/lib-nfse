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
@Root(name = "Endereco")
public class Endereco extends NFSBase {

    @Element(name = "Endereco", required = false)
    private String logradouro;

    @Element(name = "Numero", required = false)
    private String numero;

    @Element(name = "Complemento", required = false)
    private String complemento;

    @Element(name = "Bairro", required = false)
    private String bairro;

    @Element(name = "CodigoMunicipio", required = false)
    private int codigoMunicipioIbge;

    @Element(name = "Uf", required = false)
    private String unidadeFederativa;

    @Element(name = "Cep", required = false)
    private int cep;
}
