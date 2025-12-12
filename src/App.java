public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n sua tabela cliente está assim: ");

        Cliente cliente = new Cliente();

        cliente.setId(1L);
        cliente.setNome("João da Silva");

        System.out.printf("\n O Cliente %s foi cadastrado com o ID %d %n", cliente.getNome(), cliente.getId());

        Boolean hasNameTabela = cliente.getClass().isAnnotationPresent(annotation.Tabela.class);

        String nomeTabela = cliente.getClass().getAnnotation(annotation.Tabela.class).value();

        System.out.println("\n e a Tabela tem nome? " + hasNameTabela);
        System.out.println("\n Nome da Tabela: " + nomeTabela);
    }
}
