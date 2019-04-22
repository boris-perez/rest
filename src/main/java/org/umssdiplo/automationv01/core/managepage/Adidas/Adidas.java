package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Adidas extends BasePage {
    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > a")
    private WebElement hombreSection;

    @FindBy(css = "#app > div > div > div.header___3wNCY.gl-is-sticky.fixed___3ea04 > div > div.glass-header-bottom-desktop___CK2sU > div > div.main-menu___GkftT > div:nth-child(1) > div > div > div > div > div > div > div > div > div.main-line > div:nth-child(2) > ul > li:nth-child(2) > a")
    private WebElement futbol;

    @FindBy(css = "#app > div > div.plp-page___1UWVZ > div > div:nth-child(2) > div > div > div.col-s-12.col-l-17.col-xl-18.no-gutters-s > div.product-container___3GvlZ > div:nth-child(2) > div > div > div > div.gl-product-card__media > a > img.gl-product-card__image-hover")
    private WebElement tennis;


    public void hombreSection() {
        CommonEvents.clickButton(machineSection);
    }

    public void futbolSection() {
        CommonEvents.clickButton(deleteIcon);
        CommonEvents.clickButton(ok);
    }

    public void tallaSection() {
        CommonEvents.clickButton(editIcon);
        String name1 = PropertyAccessor.getInstance().getName1();
        CommonEvents.setInputField(names, name1);
        CommonEvents.clickButton(submit);
    }

    public void selectTalla(){

    }
}