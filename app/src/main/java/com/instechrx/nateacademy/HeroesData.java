package com.instechrx.nateacademy;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Kelas Belajar HTML",
            "Kelas Belajar CSS",
            "Kelas Belajar Github",
            "Kelas Belajar Javascript",
            "Kelas Belajar Node JS",
            "Kelas Belajar PHP",
            "Kelas Belajar React Native",
            "Kelas Belajar Rest API",
            "Kelas Belajar AWS",
            "Kelas Belajar GCP"
    };

    private static String[] heroHarga = {
            "GRATIS",
            "GRATIS",
            "GRATIS",
            "Rp75.000",
            "Rp125.000",
            "Rp170.000",
            "Rp125.000",
            "Rp150.000",
            "Rp250.000",
            "Rp250.000"
    };
    private static String[] heroDetails = {
            "HTML (Hypertext Markup Language) adalah sebuah bahasa markah yang digunakan untuk membuat sebuah halaman web, menampilkan berbagai informasi di dalam sebuah penjelajah web Internet dan pemformatan hiperteks sederhana yang ditulis dalam berkas format ASCII agar dapat menghasilkan tampilan wujud yang terintegerasi.\n\nKelas Gratis. Segera bergabung sekarang juga Tunggu apa lagi \nHadiah Promo Terbatas! ",
            "CSS (Cascading Style Sheet) adalah salah satu bahasa desain web (style sheet language) yang mengontrol format tampilan sebuah halaman web yang ditulis dengan menggunakan penanda(markup laguage. Biasanya CSS digunakan untuk mendesain sebuah halaman HTML dan XHTML, tetapi sekarang CSS bisa diaplikasikan untuk segala dokumenXML.\n\nKelas Gratis. Segera bergabung sekarang juga Tunggu apa lagi \nHadiah Promo Terbatas! ",
            "GitHub adalah layanan penginangan web bersama untuk proyek pengembangan perangkat lunak yang menggunakan sistem pengontrol versi Git dan layanan hosting internet. Hal ini banyak digunakan untuk kode komputer. Ini memberikan kontrol akses dan beberapa fitur kolaborasi seperti pelacakan bug, permintaan fitur, manajemen tugas, dan wiki untuk setiap proyek.\n\nKelas Gratis. Segera bergabung sekarang juga Tunggu apa lagi \nHadiah Promo Terbatas!",
            "JavaScript adalah bahasa pemrograman web yang bersifat Client Side Programming Language. Client Side Programming Language adalah tipe bahasa pemrograman yang pemrosesannya dilakukan oleh client. Aplikasi client yang dimaksud merujuk kepada web browser seperti Google Chrome dan Mozilla Firefox.\n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "Node.js adalah perangkat lunak yang didesain untuk mengembangkan aplikasi berbasis web dan ditulis dalam sintaks bahasa pemrograman JavaScript. Bila selama ini kita mengenal JavaScript sebagai bahasa pemrograman yang berjalan di sisi client / browser saja, maka Node.js ada untuk melengkapi peran JavaScript sehingga bisa juga berlaku sebagai bahasa pemrograman yang berjalan di sisi server, seperti halnya PHP, Ruby, Perl, dan sebagainya. \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "PHP adalah bahasa pemrograman script server-side yang didesain untuk pengembangan web. Selain itu, PHP juga bisa digunakan sebagai bahasa pemrograman umum. PHP disebut bahasa pemrograman server side karena PHP diproses pada komputer server. Hal ini berbeda dibandingkan dengan bahasa pemrograman client-side seperti JavaScript yang diproses pada web browser (client). \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "React Native adalah salah satu framework javascript yang kita gunakan untuk mengembangkan aplikasi mobile. Dengan React Native kita akan merasakan sensasi membuat aplikasi yang sangat mendekati bahkan tidak dapat dibedakan dengan dengan aplikasi native. Ini dikarena library yang tersedia dalam React Native memang ada native nya, jadi aplikasi yang kita buat langsung terintegrasi dengan aplikasi native yang sebenarnya. \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "REST (REpresentational State Transfer) merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data. REST pertama kali diperkenalkan oleh Roy Fielding pada tahun 2000. \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "Amazon Web Services (AWS) adalah platform cloud paling komprehensif dan digunakan secara luas di dunia, menawarkan lebih dari 165 layanan unggulan lengkap dari pusat data secara global. Jutaan pelanggan —termasuk beberapa startup dengan pertumbuhan tercepat, perusahaan terbesar, dan lembaga pemerintah terkemuka—mempercayai AWS untuk menggerakkan infrastruktur mereka, menjadi lebih tangkas, dan biaya lebih rendah. \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
            "Google cloud platform, yang ditawarkan olehGoogle, adalah rangkaian layanan komputasi awanyang berjalan di infrastruktur yang sama yang digunakan Google secara internal untuk produk pengguna akhir, seperti Google Penelusuran dan YouTube.. Bersamaan dengan seperangkat alat manajemen, ia menyediakan serangkaian layanan cloud modular termasuk komputasi, penyimpanan data, Analisis data dan pembelajaran mesin. \n\nSegera bergabung sekarang untuk dapat mengikuti pembaelajaran \nHadiah Promo Terbatas! ",
    };

    private static int[] heroesImages = {
            R.drawable.html,
            R.drawable.css,
            R.drawable.github,
            R.drawable.js,
            R.drawable.node_js,
            R.drawable.php,
            R.drawable.react,
            R.drawable.rest_api,
            R.drawable.aws,
            R.drawable.gcp
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            hero.setHarga(heroHarga[position]);
            list.add(hero);
        }
        return list;
    }
}
