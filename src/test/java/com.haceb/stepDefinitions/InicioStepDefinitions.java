package com.haceb.stepDefinitions;

import com.haceb.steps.InicioSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioStepDefinitions {


        @Steps
        InicioSteps inicio;

        @Dado("que el usuario ha iniciado sesion en la aplicacion.")
        public void queElUsuarioHaIniciadoSesionEnLaAplicacion() {
                inicio.abrirNavegador();
        }

        @Cuando("hace click en el menu de categorias")
        public void haceClickEnElMenuDeCategorias() {
            // Write code here that turns the phrase above into concrete actions
        }

        @Cuando("selecciona una subcategoria de forma aleatoria")
        public void seleccionaUnaSubcategoriaDeFormaAleatoria() {
            // Write code here that turns the phrase above into concrete actions
        }

        @Cuando("seleccina un producto de forma aleatoria")
        public void seleccinaUnProductoDeFormaAleatoria() {
            // Write code here that turns the phrase above into concrete actions
        }
        @Cuando("agrega el producto al carrito")
        public void agregaElProductoAlCarrito() {
            // Write code here that turns the phrase above into concrete actions
        }
        @Entonces("valida que el producto quede dentro del carrito de compra")
        public void validaQueElProductoQuedeDentroDelCarritoDeCompra() {
            // Write code here that turns the phrase above into concrete actions
        }

}
