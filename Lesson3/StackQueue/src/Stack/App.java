/**
 * Algorithms. Home Work 3.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 15, 2018
 * @link https://github.com/bertranus/Algorithms
 */
package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        String input;
        while(true){
            input = getString();
            if(input.equals("")) break;

            ReverseWord rw = new ReverseWord((input));
            rw.getString();
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
