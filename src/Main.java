public class Main {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);

        while (a.transfer(b, 3000)) {
            System.out.printf("%s에게 %d원을 이체했습니다.\n",b.getNum(),3000);
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
