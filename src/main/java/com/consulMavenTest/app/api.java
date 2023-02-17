package com.consulMavenTest.app;

import static java.lang.Float.parseFloat;
import static spark.Spark.*;
public class Api {

    public static void main( String[] args ) {
        Calculadora calculadora = new Calculadora();
        get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));

        get("/calculator/suma/:num1/:num2", (req, res) -> {
            float num1 = parseFloat(req.params(":num1"));
            float num2 = parseFloat(req.params(":num2"))
            return calculadora.suma(num1, num2);
        });

        get("/calculator/resta/:num1/:num2", (req, res) -> {
            float num1 = parseFloat(req.params(":num1"));
            float num2 = parseFloat(req.params(":num2"))
            return calculadora.resta(num1, num2);
        });

        get("/calculator/multiplicacion/:num1/:num2", (req, res) -> {
            float num1 = parseFloat(req.params(":num1"));
            float num2 = parseFloat(req.params(":num2"))
            return calculadora.multiplicacion(num1, num2);
        });

        get("/calculator/division/:num1/:num2", (req, res) -> {
            float num1 = parseFloat(req.params(":num1"));
            float num2 = parseFloat(req.params(":num2"))
            return calculadora.division(num1, num2);
        });
    }
}
