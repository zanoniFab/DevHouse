class M01S02EX10 {
    public static void main(String[] args) {
        String palavra = "porco";
        char[] caracteres = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = palavra.charAt(palavra.length() - 1 - i);
        }
        String invertido = String.valueOf(caracteres);
        if (palavra == invertido) {
            System.out.printf("A palavra \"%s\" é palíndrome.", palavra);
        } else {
            System.out.printf("A palavra \"%s\" não é palíndrome.", palavra);
        }
    }
}