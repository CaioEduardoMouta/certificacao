package br.com.alura.modelo;

class Cars {


    String modelo;
    int ano;

    Cars() {
       ano = 2014;
    }

    void reseta() {
        ano = 2014;
    }

    public String getDadosDeImpressao() {
        return modelo + "::" + ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
