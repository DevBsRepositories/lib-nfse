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
    private double valorServicos;

    @JacksonXmlProperty(localName = "ValorDeducoes")
    private double valorDeducoes;

    @JacksonXmlProperty(localName = "ValorPis")
    private double valorPis;

    @JacksonXmlProperty(localName = "ValorCofins")
    private double valorCofins;

    @JacksonXmlProperty(localName = "ValorInss")
    private double valorInss;

    @JacksonXmlProperty(localName = "ValorIr")
    private double valorIr;

    @JacksonXmlProperty(localName = "ValorCsll")
    private double valorCSll;

    @JacksonXmlProperty(localName = "IssRetido")
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean issRetido;

    @JacksonXmlProperty(localName = "ValorIss")
    private double valorIss;

    @JacksonXmlProperty(localName = "OutrasRetencoes")
    private double valorOutrasRetencoes;

    @JacksonXmlProperty(localName = "BaseCalculo")
    private double valorBaseCalculo;

    @JacksonXmlProperty(localName = "Aliquota")
    private double percentualAliquota;

    @JacksonXmlProperty(localName = "ValorLiquidoNfse")
    private double valorLiquidoNfse;

    @JacksonXmlProperty(localName = "ValorIssRetido")
    private double valorIssRetido;

    @JacksonXmlProperty(localName = "DescontoCondicionado")
    private double valorDescontoCondicionado;

    @JacksonXmlProperty(localName = "DescontoIncondicionado")
    private double valorDescontoIncondicionado;
}
