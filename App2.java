public class App2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Bem-vindo "+ nome +" à disciplina de Estrutura de Dados!");
        entrada.close();

    }
}