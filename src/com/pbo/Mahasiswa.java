package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini menampilkan perkenalan dari para Mahasiswa
 *
 */

public class Mahasiswa {
    public String nim;
    public String nama;

    public void perkenalkanDiri() {
        System.out.println("\nHallo everyone");
        System.out.println("My NIM is ".concat(this.nim));
        System.out.println("My name is ".concat(this.nama));
    }

    public static void main(String[] args) {

        String[] listOfNim = {"10110269", "10110270", "10110271", "10110272"};
        String[] listOfName = {"Rizki Adam Kurniawan", "Indra Tiola", "Robi Tanzil Genefi", "Muhammadn Nur Avaludin"};

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = listOfNim[0];
        mahasiswa1.nama = listOfName[0];

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = listOfNim[1];
        mahasiswa2.nama = listOfName[1];

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = listOfNim[2];
        mahasiswa3.nama = listOfName[2];

        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = listOfNim[3];
        mahasiswa4.nama = listOfName[3];

        mahasiswa1.perkenalkanDiri();
        mahasiswa2.perkenalkanDiri();
        mahasiswa3.perkenalkanDiri();
        mahasiswa4.perkenalkanDiri();
    }
}

