package Practice1;

public class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
         }

    public SutdaCard(){
        this.num = 1;
        this.isKwang = true;
    }

    public String info() {
        String i = Integer.toString(num);
        if (isKwang) {
            return i + 'K';
        } else {
            return i;
        }
    }

}
