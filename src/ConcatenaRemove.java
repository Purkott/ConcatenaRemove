

public class ConcatenaRemove {



    public ConcatenaRemove() {

    }

    // Função para checar se a string é valida
    private boolean checaString(String teste) {
        // Teste para Strings vazias ou que contenham numeros
        if (teste == null || teste.matches(".*[0-9].*")) return false;
        // Retorna true se String for letras minusculas
        return teste.toLowerCase().equals(teste);
    }

    // funçao principal que fara o retorno de sim ou nao
    public String ConcatERemove(String s,String t,int k) {
        if(s.length() > 100 || s.length() < 1 || t.length() > 100 || t.length() < 1 || k > 100 || k < 1) {
            return "Input invalido";
        }
        else {
            if (checaString(s) && checaString(t)) {
                if(s.equals(t)) {
                    return "sim";
                }
                else {
                    if (concatenaRemove(s,t,k)) return "sim";
                    else return "nao";
                }
            }
            else {
                return "Uma das strings e invalida";
            }
        }
    }

    // Funcao que fara o calculo se a conversao é possivel
    private boolean concatenaRemove(String s, String t, int k) {
        int i;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int letrasIguais = 0;
        if (chars[0] == chart[0]) {
            i = 1;
            letrasIguais++;
            while (i <= chars.length -1 && i <= chart.length -1 && chars[i] == chart[i] ) {
                letrasIguais++;
                i++;
            }
        }
        i = letrasIguais;
        if(chars.length - i > k) return false;
        else {
            k = k - (chars.length - i);
            if(chart.length - i > k) return false;
            else return true;
        }
    }

}
