package boletin3_1;

/**
 *
 * @author usuario
 */
public class Consumo {
   
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo(float kil, float lit, float med, float gas) {
        km = kil;
        litros = lit;
        vMed = med;
        pGas = gas;
    }

    public Consumo() {
    }

    public float getTempo() {
        float tempo = km / vMed;
        return tempo;
    }

    public float consumoMedio() {
        float consumo_medio = litros / km * 100;
        return consumo_medio;
    }

    public float consumoEuros() {
        float consumo_euros = pGas / km * 100;
        return consumo_euros;
    }

    public void setKms(float kil) {
        km = kil;
    }

    public void setLitros(float lit) {
        litros = lit;
    }

    public void setvMed(float med) {
        vMed = med;
    }

    public void setpGas(float gas) {
        pGas = gas;
    }

    public float getvMed() {
        return vMed;
    }

    public void Visualizar() {
        System.out.println("A velocidade media é " + vMed + ".");
    }
    
        
}


