/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class kerucut extends BangunRuang {

    private double jariJari, tinggi, garisPelukis;

    public kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;

        this.garisPelukis = Math.sqrt(
            jariJari * jariJari +
            tinggi * tinggi
        );
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * jariJari *
                jariJari * tinggi) / 3;
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.PI * jariJari *
               (jariJari + garisPelukis);
    }
}