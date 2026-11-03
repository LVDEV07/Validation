package com.validation.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 5, max = 80, message = "O nome deve ter entre 5 e 80 caracteres")
    private String nome;

    @NotNull(message = "O e-mail de contato é obrigatório")
    @Email(message = "O e-mail de contato deve ter um formato válido")
    private String emailContato;

    @NotNull(message = "A data de início é obrigatória")
    @Future(message = "A data de início deve estar no futuro")
    private LocalDateTime dataInicio;

    @NotNull(message = "O número de vagas é obrigatório")
    @Min(value = 10, message = "O número mínimo de vagas é 10")
    @Max(value = 5000, message = "O número máximo de vagas é 5000")
    private Integer vagas;

    @NotNull(message = "O preço do ingresso é obrigatório")
    @PositiveOrZero(message = "O preço do ingresso deve ser positivo ou zero")
    private BigDecimal precoIngresso;

    @NotBlank(message = "O logradouro é obrigatório")
    private String logradouro;

    @NotBlank(message = "O número é obrigatório")
    private String numero;

    @NotBlank(message = "O CEP é obrigatório")
    @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "O CEP deve seguir o formato XXXXX-XXX")
    private String cep;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmailContato() { return emailContato; }
    public void setEmailContato(String emailContato) { this.emailContato = emailContato; }

    public LocalDateTime getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDateTime dataInicio) { this.dataInicio = dataInicio; }

    public Integer getVagas() { return vagas; }
    public void setVagas(Integer vagas) { this.vagas = vagas; }

    public BigDecimal getPrecoIngresso() { return precoIngresso; }
    public void setPrecoIngresso(BigDecimal precoIngresso) { this.precoIngresso = precoIngresso; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
}