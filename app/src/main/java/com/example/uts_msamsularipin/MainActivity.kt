package com.example.uts_msamsularipin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Anime>()

        list.add(Anime("One Piece", "Adalah sebuah Manga dan Anime yang menceritakan tentang " +
                "petualangan sekelompok bajak laut dalam mencari harta karun legendaris, " +
                "One Piece. One Piece dibuat oleh Eiichiro Oda pada Agustus 1997 di Shonen Jump " +
                "terbitan Shueisha dan hingga kini.", R.drawable.poster_onepiece)
        )
        list.add(
            Anime("Naruto", "Manga Naruto bercerita seputar kehidupan tokoh utamanya, " +
                    "Naruto Uzumaki, seorang ninja yang hiperaktif, periang, " +
                    "dan ambisius yang ingin mewujudkan keinginannya untuk mendapatkan gelar Hokage, " +
                    "pemimpin dan ninja terkuat di desanya.", R.drawable.poster_naruto)
        )
        list.add(
            Anime("Death Note", "Adalah sebuah serial manga shōnen Jepang yang ditulis oleh Tsugumi Ohba " +
                    "dan diilustrasikan oleh Takeshi Obata.", R.drawable.poster_note)
        )
        list.add(Anime("Doraemon", "adalah karakter fiksi dalam serial manga dan anime Jepang dengan nama " +
                    "yang sama yang dibuat oleh Fujiko Fujio, nama pena dari tim penulisan Hiroshi Fujimoto dan " +
                    "Motoo Abiko.", R.drawable.poster_doraemon)
        )
        list.add(Anime("Detective Conan","Biasa dikenal sebagai Case Closed " +
                "adalah seri manga detektif Jepang yang ditulis dan diilustrasikan oleh Gosho Aoyama", R.drawable.poster_conan)
        )

        listView.adapter = AnimeJepang( this, R.layout.animejepang, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih One Piece", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih anime Naruto", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih anime Death Note", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih anime Doraemon", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih anime Detective Conan", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Apakah anda yakin ingin keluar?")
            .setPositiveButton("Ya",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("Tidak",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}