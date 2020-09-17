import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Scraper {
    public static void main(String[] args) throws Exception {
        final Document document = Jsoup.connect("https://www.nlb.lk/results/govisetha").get();
        for(Element row : document.select("table.w0.tbl tr")){
            final String result = row.select(".BB").text();

            System.out.println("Results - "+result );
        }
    }
}
