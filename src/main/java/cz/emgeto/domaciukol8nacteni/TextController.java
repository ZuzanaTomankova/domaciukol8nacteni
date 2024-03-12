package cz.emgeto.domaciukol8nacteni;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;


@RestController
public class TextController {
    @GetMapping("scifi")
    public String scifi(){
        String r = null;
        String file ="src/resources/scifi";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            r = br.readLine();
        } catch (Exception e) {
            System.out.println("Chyba při čtení ze souboru.");
        }


        return r;
    }
    @GetMapping("romantic")
    public String romantic() {
        String s = null;
        String file ="src/resources/romantic";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            s = br.readLine();
        } catch (Exception e) {
            System.out.println("Chyba při čtení ze souboru.");
        }
        return s;
    }
    @GetMapping("historic")
    public String historic() {
        String t = null;
        String file ="src/resources/historic";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            t = br.readLine();
        } catch (Exception e) {
            System.out.println("Chyba při čtení ze souboru.");
        }

        return t;

    }

}