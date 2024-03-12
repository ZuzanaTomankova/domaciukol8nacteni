package cz.emgeto.domaciukol8nacteni;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;


@RestController
public class TextController {
    @GetMapping("scifi")
    public String scifi(){
        return "Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí. Síť propojených myslí ovládala každodenní život. Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly. Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům. Otázka zní: Kdo skutečně vládne?";
    }
    @GetMapping("romantic")
    public String romantic() {
        String s = null;
        String file ="resouces/romantic";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            s = br.readLine();
        } catch (Exception e) {
            System.out.println("Chyba při čtení ze souboru.");
        }
        return s;
    }
    @GetMapping("historic")
    public String historic() {
        return "V době středověku se mezi dvěma královstvími rozpoutala zuřivá válka. Hrdinní rytíři bojovali v bitvách a odvážní vůdcové vedli své vojsko k vítězství. Nicméně za zdmi hradu se rodila zakázaná láska mezi dcerou jednoho krále a synem druhého. Jejich romance byla plná nebezpečí, tajemství a obětí. Nakonec byli nuceni utéct, aby spolu mohli být. Jejich příběh zůstal jako legenda v dějinách, která připomíná sílu lásky v časech krutosti.";

    }

}