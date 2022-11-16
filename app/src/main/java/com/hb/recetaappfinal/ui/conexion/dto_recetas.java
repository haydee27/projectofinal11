package com.hb.recetaappfinal.ui.conexion;

public class dto_recetas {

    int id_recetas;
    String nombre;
    String ingrediente;
    String procedimiento;
    int id;

    public int getId_recetas() {
        return id_recetas;
    }

    public void setId_recetas(int id_recetas) {
        this.id_recetas = id_recetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public dto_recetas() {


    }

    public dto_recetas(int id_recetas, String nombre, String ingrediente, String procedimiento, int id) {
        this.id_recetas = id_recetas;
        this.nombre = nombre;
        this.ingrediente = ingrediente;
        this.procedimiento = procedimiento;
        this.id = id;
    }
}
