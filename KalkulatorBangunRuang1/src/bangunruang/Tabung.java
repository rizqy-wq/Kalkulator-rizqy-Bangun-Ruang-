/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class Tabung extends BangunRuang {

    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari *
               (jariJari + tinggi);
    }
}