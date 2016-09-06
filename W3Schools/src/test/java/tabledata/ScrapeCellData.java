package tabledata;

import common.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by rrt on 9/3/2016.
 */
public class ScrapeCellData extends Base {

    //@Test
    public void cellData(){
        String cellValue = getTextByCss(".w3-table-all.notranslate tbody tr:nth-child(4)");
        System.out.println(cellValue.toUpperCase());
    }

    @Test
    public void allCellData(){
        List<WebElement> table = getListOfWebElementsByCss("#main > div:nth-child(19) > table tr");
        String cellValue = getTextByCss("#main div:nth-child(5) .w3-table-all.notranslate tbody tr:nth-child(4)");
        System.out.println(cellValue.toUpperCase());
    }
}
