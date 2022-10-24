package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import br.com.brazilsistem.libnfse.util.NumericBooleanDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Valores")
public class ValoresNfse extends NFSBase {

    @JacksonXmlProperty(localName = "ValorServicos")
    private Double valorServicos;

    @JacksonXmlProperty(localName = "ValorDeducoes")
    private Double valorDeducoes;

    @JacksonXmlProperty(localName = "ValorPis")
    private Double valorPis;

    @JacksonXmlProperty(localName = "ValorCofins")
    private Double valorCofins;

    @JacksonXmlProperty(localName = "ValorInss")
    private Double valorInss;

    @JacksonXmlProperty(localName = "ValorIr")
    private Double valorIr;

    @JacksonXmlProperty(localName = "ValorCsll")
    private Double valorCSll;

    @JacksonXmlProperty(localName = "IssRetido")
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean issRetido;

    @JacksonXmlProperty(localName = "ValorIss")
    private Double valorIss;

    @JacksonXmlProperty(localName = "OutrasRetencoes")
    private Double valorOutrasRetencoes;

    @JacksonXmlProperty(localName = "BaseCalculo")
    private Double valorBaseCalculo;

    @JacksonXmlProperty(localName = "Aliquota")
    private Double percentualAliquota;

    @JacksonXmlProperty(localName = "ValorLiquidoNfse")
    private Double valorLiquidoNfse;

    @JacksonXmlProperty(localName = "ValorIssRetido")
    private Double valorIssRetido;

    @JacksonXmlProperty(localName = "DescontoCondicionado")
    private Double valorDescontoCondicionado;

    @JacksonXmlProperty(localName = "DescontoIncondicionado")
    private Double valorDescontoIncondicionado;
}
