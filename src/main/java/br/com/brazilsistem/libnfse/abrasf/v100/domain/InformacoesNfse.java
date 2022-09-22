package br.com.brazilsistem.libnfse.abrasf.v100.domain;

import br.com.brazilsistem.libnfse.abrasf.NFSBase;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Root(name = "InfNfse", strict = false)
public class InformacoesNfse extends NFSBase {

    @Attribute(name = "id")
    private String idTag;

    @Element(name = "Numero")
    private int numeroNfse;

    @Element(name = "CodigoVerificacao")
    private String codigoVerificacao;

    @Element(name = "DataEmissao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
    private String dataEmissao;

    @Element(name = "IdentificacaoRps", required = false)
    private IdentificacaoRps identificacaoRps;

    @Element(name = "DataEmissaoRps", required = false)
    private Date dataEmissaoRps;

    @Element(name = "NaturezaOperacao")
    private int naturezaOperacao;

    @Element(name = "RegimeEspecialTributacao", required = false)
    private int regimeEspecialTributacao;

    @Element(name = "OptanteSimplesNacional")
    private int optanteSimplesNacional;

    @Element(name = "IncentivadorCultural")
    private int incentivadorCultural;

    @Element(name = "Competencia")
    private String dataCompetencia;

    @Element(name = "NfseSubstituida", required = false)
    private int numeroNfseSubstituida;

    @Element(name = "OutrasInformacoes", required = false)
    private String outrasInformacoes;

    @Element(name = "Servico")
    private ServicoNfse dadosServico;

    @Element(name = "ValorCredito", required = false)
    private double valorCredito;

    @Element(name = "PrestadorServico")
    private PrestadorNfse prestadorNfse;

    @Element(name = "TomadorServico")
    private TomadorNfse tomadorNfse;

    @Element(name = "IntermediarioServico", required = false)
    private IntermediarioServicoNFSe identificacaoIntermediarioServico;

    @Element(name = "OrgaoGerador")
    private IdentificacaoOrgaoGerador orgaoGerador;

    @Element(name = "ConstrucaoCivil", required = false)
    private IdentificacaoConstrucaoCivil dadosConstrucaoCivil;

}
