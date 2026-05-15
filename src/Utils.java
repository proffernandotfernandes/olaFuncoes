public class Utils {

    public static float calcularPercentual(float valor, float percentual){

        float percentualCalculado = (percentual/100);
        return valor * percentualCalculado;
    }

    public static float calcularAcrescimo(float valor, float percentual){
        float percentualCalculado = 1 + (percentual/100);
        return valor * percentualCalculado;
    }

}
