public class StaticList {
    private int [] data;
    private int size;

    public StaticList(){
        data = new int[10];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void add(int value){
        if (!isFull()){
            data[size] = value;
            size++;
        }else {
            System.out.println("Lista cheia");;
        }
    }

    public void add(int value, int pos){
        if (isFull()){
            System.out.println("A lista está cheia");
        }else if(pos > size){
            System.out.println("Posicao inválida");
        }else {
            for (int i = size; i >= pos ; i--) {
                data[i] = data[i-1];
            }
            data[value] = pos;
            size++;
        }
    }

    public int remove(int pos) {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        }else if (pos >= size || pos < 0){
            System.out.println("Posivao invalida");
        }else {
            for (int i = pos; i < size; i++) {
                data[i] = data[i + 1];
            }
            size--;
            data[size] = 0;
        }
        return data[pos];
    }

    public void clear(){
        for (int i = 0; i < size ; i++) {
            data[i] = Integer.parseInt(null);
        }
    }


}
