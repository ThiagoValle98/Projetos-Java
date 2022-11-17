
package Dados;

import java.util.Date;

public class Requisitos {
    private String nomeReq;
    private int autorReq;
    private int autorAlteracaoReq;
    private int IDReq;
    private String funcionalidadeReq;
    private String descReq;
    private String complexidadeReq;
    private String prioridadeReq;
    private String faseReq;
    private String estadoReq;
    private String esforcoHoras;
    private String versaoReq;
    private Date dtCriacaoReq;
    private Date dtUltimaAlteracao;

    
    public String getEsforcoHoras() {
        return esforcoHoras;
    }


    public void setEsforcoHoras(String esforcoHoras) {
        this.esforcoHoras = esforcoHoras;
    }


    public String getVersaoReq() {
        return versaoReq;
    }


    public void setVersaoReq(String versaoReq) {
        this.versaoReq = versaoReq;
    }


    public int getAutorReq() {
        return autorReq;
    }

    public void setAutorReq(int autorReq) {
        this.autorReq = autorReq;
    }


    public int getAutorAlteracaoReq() {
        return autorAlteracaoReq;
    }


    public void setAutorAlteracaoReq(int autorAlteracaoReq) {
        this.autorAlteracaoReq = autorAlteracaoReq;
    }


    public int getIDReq() {
        return IDReq;
    }

    public void setIDReq(int IDReq) {
        this.IDReq = IDReq;
    }


    public String getFuncionalidadeReq() {
        return funcionalidadeReq;
    }


    public void setFuncionalidadeReq(String funcionalidadeReq) {
        this.funcionalidadeReq = funcionalidadeReq;
    }


    public String getDescReq() {
        return descReq;
    }


    public void setDescReq(String descReq) {
        this.descReq = descReq;
    }


    public String getComplexidadeReq() {
        return complexidadeReq;
    }


    public void setComplexidadeReq(String complexidadeReq) {
        this.complexidadeReq = complexidadeReq;
    }


    public String getPrioridadeReq() {
        return prioridadeReq;
    }


    public void setPrioridadeReq(String prioridadeReq) {
        this.prioridadeReq = prioridadeReq;
    }


    public String getFaseReq() {
        return faseReq;
    }

    public void setFaseReq(String faseReq) {
        this.faseReq = faseReq;
    }

    public String getEstadoReq() {
        return estadoReq;
    }


    public void setEstadoReq(String estadoReq) {
        this.estadoReq = estadoReq;
    }
    
    public String getNomeReq() {
        return nomeReq;
    }

 
    public void setNomeReq(String nomeReq) {
        this.nomeReq = nomeReq;
    }
    
    public Date getDtCriacaoReq(){
        return dtCriacaoReq;
    }
    public void serDtCriacaoReq(Date dtCriacaoReq){
        this.dtCriacaoReq = dtCriacaoReq;
        
    }
    
    public Date getDtUltimaAlteracao(){
        return dtUltimaAlteracao;
    }
    public void setDtUltimaAlteracao(Date dtUltimaAlteracao){
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
    
}

