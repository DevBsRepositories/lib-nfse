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
@Root(name = "Valores")
public class ValoresNfse extends NFSBase {

    @Element(name = "ValorServicos")
    private double valorServicos;

    @Element(name = "ValorDeducoes", required = false)
    private double valorDeducoes;

    @Element(name = "ValorPis", required = false)
    private double valorPis;

    @Element(name = "ValorCofins", required = false)
    private double valorCofins;

    @Element(name = "ValorInss", required = false)
    private double valorInss;

    @Element(name = "ValorIr", required = false)
    private double valorIr;

    @Element(name = "ValorCsll", required = false)
    private double valorCSll;

    @Element(name = "IssRetido")
    private int issRetido;

    @Element(name = "ValorIss", required = false)
    private double valorIss;

    @Element(name = "OutrasRetencoes", required = false)
    private double valorOutrasRetencoes;

    @Element(name = "BaseCalculo", required = false)
    private double valorBaseCalculo;

    @Element(name = "Aliquota", required = false)
    private double percentualAliquota;

    @Element(name = "ValorLiquidoNfse", required = false)
    private double valorLiquidoNfse;

    @Element(name = "ValorIssRetido", required = false)
    private double valorIssRetido;

    @Element(name = "DescontoCondicionado", required = false)
    private double valorDescontoCondicionado;

    @Element(name = "DescontoIncondicionado", required = false)
    private double valorDescontoIncondicionado;
}
