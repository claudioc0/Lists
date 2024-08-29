public class Main {
    public static void main(String[] args) {
        StaticList list = new StaticList();

        System.out.println("Adicionando valores na lista:");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.print();

        System.out.println("Adicionando o valor 25 na posição 2:");
        list.add(25, 2);
        list.print();

        System.out.println("Removendo o elemento na posição 3:");
        list.remove(3);
        list.print();

        System.out.println("Buscando pelo valor 20:");
        int index = list.find(20);
        if (index != -1) {
            System.out.println("Valor encontrado na posição: " + index);
        } else {
            System.out.println("Valor não encontrado");
        }

        System.out.println("Limpando a lista:");
        list.clear();
        list.print();
    }
}
