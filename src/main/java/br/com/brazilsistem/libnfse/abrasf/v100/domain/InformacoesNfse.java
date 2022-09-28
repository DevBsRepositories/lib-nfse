package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import br.com.brazilsistem.libnfse.abrasf.util.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "InfNfse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InformacoesNfse extends NFSBase {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String idTag;

    @JacksonXmlProperty(localName = "Numero")
    private int numeroNfse;

    @JacksonXmlProperty(localName = "CodigoVerificacao")
    private String codigoVerificacao;

    @JacksonXmlProperty(localName = "DataEmissao")
    private LocalDateTime dataEmissao;

    @JacksonXmlProperty(localName = "IdentificacaoRps")
    private IdentificacaoRps identificacaoRps;

    @JacksonXmlProperty(localName = "DataEmissaoRps")
    private LocalDate dataEmissaoRps;

    @JacksonXmlProperty(localName = "NaturezaOperacao")
    private int naturezaOperacao;

    @JacksonXmlProperty(localName = "RegimeEspecialTributacao")
    private int regimeEspecialTributacao;

    @JacksonXmlProperty(localName = "OptanteSimplesNacional")
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean optanteSimplesNacional;

    @JacksonXmlProperty(localName = "IncentivadorCultural")
    @JsonDeserialize(using = NumericBooleanDeserializer.class)
    private Boolean incentivadorCultural;

    @JacksonXmlProperty(localName = "Competencia")
    private LocalDateTime dataCompetencia;

    @JacksonXmlProperty(localName = "NfseSubstituida")
    private int numeroNfseSubstituida;

    @JacksonXmlProperty(localName = "OutrasInformacoes")
    private String outrasInformacoes;

    @JacksonXmlProperty(localName = "Servico")
    private ServicoNfse dadosServico;

    @JacksonXmlProperty(localName = "ValorCredito")
    private double valorCredito;

    @JacksonXmlProperty(localName = "PrestadorServico")
    private PrestadorNfse prestadorNfse;

    @JacksonXmlProperty(localName = "TomadorServico")
    private TomadorNfse tomadorNfse;

    @JacksonXmlProperty(localName = "IntermediarioServico")
    private IntermediarioServicoNFSe identificacaoIntermediarioServico;

    @JacksonXmlProperty(localName = "OrgaoGerador")
    private IdentificacaoOrgaoGerador orgaoGerador;

    @JacksonXmlProperty(localName = "ConstrucaoCivil")
    private IdentificacaoConstrucaoCivil dadosConstrucaoCivil;

}
