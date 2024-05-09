package rekurencja_n_silnia;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class silnia1{
    static long silnia(int liczba)
    {
        return liczba == 1 ? 1 : liczba * silnia(liczba -1); //operator warunkowy trojskladnikowy
    }
}
public class Main {
    public static void main(String[] args)
        throws IOException

    {
        int i, n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Obliczanie silni dla dowolnej liczby calkowitej.");
        System.out.println("Podaj wartosc liczby n.");

        n = Integer.parseInt(br.readLine());

        for (i = 1; i <= n; i++)
        {
            System.out.println(i + "! = " + silnia1.silnia(i));
        }
    }
}
