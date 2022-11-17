
package Dados;

import java.util.Date;


public class Relatorios {
    private String tituloRelatorio;
    private Date dtGeracaoRelatorio;
 
    
    public String getTituloRelatorio() {
        return tituloRelatorio;
    }


    public void setTituloRelatorio(String tituloRelatorio) {
        this.tituloRelatorio = tituloRelatorio;
    }

    public Date getDtGeracaoRelatorio() {
        return dtGeracaoRelatorio;
    }


    public void setDtGeracaoRelatorio(Date dtGeracaoRelatorio) {
        this.dtGeracaoRelatorio = dtGeracaoRelatorio;
    }
}
