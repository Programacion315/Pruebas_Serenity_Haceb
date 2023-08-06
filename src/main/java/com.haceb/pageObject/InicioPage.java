package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

    // Registro de usuario
    private final By lnkRegistrarse = By.xpath("//div[@class=\"additional-login-links\"]/a[@class=\"cdc-fire cdc-login\"]");

    private final By txtCorreoElectronico = By.xpath("//input[@id='gigya-loginID-51216659851706440']");

    private final By txtNombre = By.xpath("//input[@id='gigya-textbox-72173553995486780']");

    private final By txtApellido = By.xpath("//input[@id='gigya-textbox-146410824335495100']");

    private final By txtIngresarPassword = By.xpath("//input[@id='gigya-password-54061940132406190']");

    private final By txtConfirmarPassword = By.xpath("//input[@id='gigya-password-142670944012194750']");

    private final By ddlLeidoTerminos = By.xpath("//span[contains(@class, 'gigya-label-text') and contains(text(), 'He leído y acepto los')]");

    private final By ddlAcepto = By.xpath("//label[contains(text(),'Si Autorizo')]");

    // Aca sale un pop, y toca pasarlo con un switch, yo aca encontre un video

    // https://www.youtube.com/watch?v=t90KHbBxVLs

    // La segunda pagina que se abre.

    private final By txtCedula = By.xpath("//input[@type='number' and @name='data.cedula' and @placeholder='Ingrese su documento de identidad *']");

    private final By txtGenero = By.xpath("//select[@id='gigya-dropdown-153944062160082270']");

    private final By txtFechaNacimiento = By.xpath("//input[@id='gigya-textbox-29430652596742216']");

    private final By txtCodigo = By.xpath("//body/div[@id='loginScreen']/div[@id='loginScreen_content']/div[@id='gigya-complete-registration-screen']/form[@id='gigya-profile-form']/div[1]/div[6]/fieldset[1]/select[1]");

    private final By txtCelular = By.xpath("//input[contains(@class, 'gigya-input-text') and contains(@class, 'gigya-subscriber-phone-number-input') and @placeholder='Numero de contacto']\n");

    private final By txtDepartamento = By.xpath("//select[@id='gigya-dropdown-92626747568210580']");

    private final By txtCiudad = By.xpath("//select[@id='gigya-dropdown-68670919361457840']");

    private final By btnAcepto = By.xpath("//input[@type='submit' and contains(@class, 'gigya-input-submit') and contains(@class, 'hc-c-register-screen-submit') and contains(@class, 'invi') and @value='Enviar']\n");

    public By getLnkRegistrarse() {
        return lnkRegistrarse;
    }

    public By getTxtCorreoElectronico() {
        return txtCorreoElectronico;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtIngresarPassword() {
        return txtIngresarPassword;
    }

    public By getTxtConfirmarPassword() {
        return txtConfirmarPassword;
    }

    public By getDdlLeidoTerminos() {
        return ddlLeidoTerminos;
    }

    public By getDdlAcepto() {
        return ddlAcepto;
    }

    public By getTxtCedula() {
        return txtCedula;
    }

    public By getTxtGenero() {
        return txtGenero;
    }

    public By getTxtFechaNacimiento() {
        return txtFechaNacimiento;
    }

    public By getTxtCodigo() {
        return txtCodigo;
    }

    public By getTxtCelular() {
        return txtCelular;
    }

    public By getTxtDepartamento() {
        return txtDepartamento;
    }

    public By getTxtCiudad() {
        return txtCiudad;
    }

    public By getBtnAcepto() {
        return btnAcepto;
    }
}
