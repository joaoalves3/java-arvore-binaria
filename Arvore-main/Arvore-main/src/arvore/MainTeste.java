package arvore;

public class MainTeste {
    static void main() {
        AbbInt abb = new AbbInt();
        abb.root= abb.inserir(abb.root, 6);
        System.out.println("Apresenta valores de ABB");
        abb.mostrarEmOrdem(abb.root);
    }
}
