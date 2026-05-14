package EstruturasExcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarcep("23765064");
            //testa o médoto formatarcep

            System.out.println(cepFormatado);
        } catch (CepInválidoException e) {
            //se Capturar (Catch) a exceção dispara a mensagem abaixo

            System.err.println("O cep não corresponde as regras de negócio");
        }

    } static String formatarcep(String cep) throws CepInválidoException {
        if (cep.length() != 8) {
            //se o tamanho do cep for diferente de 8 caracteres
            // ele lança (throw) a exceção "CepInválido
            throw new CepInválidoException();

            }
            //simulando um cep formatado
            return "23.765-64";
        }


}
