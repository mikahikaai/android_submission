package com.dicoding.picodiploma.rianpedia

object DataWisata {
    private val wisataNames = arrayOf(
        "Labirin Pelaihari",
        "Jembatan Gantung Desa Nateh",
        "Pasar Terapung Lok Baintan",
        "Goa Batu Hapu",
        "Goa Liang Tapah",
        "Danau Biru Pengaron",
        "Waduk Riam Kanan",
        "Hutan Pinus Mentaos",
        "Rumah Pohon Cempaka Banjarbaru",
        "Rumah Jomblo Banjarbaru"
    )

    private val wisataLokasi = arrayOf(
        "Lokasi: Pelaihari, Sungai Jelai, Tambang Ulang, Kabupaten Tanah Laut, Kalimantan Selatan",
        "Lokasi: Desa Nateh, Kecamatan Batang Alai Timur, Kabupaten Hulu Sungai Tengah, Kalimantan Selatan",
        "Lokasi: Desa Sungai Tandipah, Kecamatan Sungai Tabuk, Sungai Tandipah, Sungai Tabuk, Banjar, Kalimantan Selatan",
        "Lokasi: Batu Hapu, Hatungun, Kabupaten Tapin, Kalimantan Selatan",
        "Lokasi: Garagata, Jaro, Kabupaten Tabalong, Kalimantan Selatan",
        "Lokasi: Desa Sungkai, Kecamatan Simpang Empat Pengaron, Banjar, Kalimantan Selatan",
        "Lokasi: Tiwingan Lama, Aranio, Banjar, Kalimantan Selatan",
        "Lokasi: Kelurahan Mentaos, Kecamatan Banjarbaru Utara, Kota Banjar Baru, Kalimantan Selatan",
        "Lokasi: Desa Beruntung Jaya, Kelurahan Sungai Tiung, Kecamatan Cempaka, Kota Banjar Baru, Kalimantan Selatan",
        "Lokasi: Cempaka, Kota Banjar Baru, Kalimantan Selatan"
    )

    private val wisataDetails = arrayOf(
        "Pernah menonton film aksi The Maze Runner dan sekuelnya? Ingin merasakan sensasi lolos dari labirin seperti di film tersebut? Mungkin sensasi itu bisa Anda dapatkan di Labirin Pelaihari. Memang tak sampai mengancam kehilangan nyawa, tapi keseruan dan hype-nya cukup menegangkan, terutama bila Anda sudah mulai tersesat dan tak tahu arah.",
        "Jembatan yang ada di Indonesia selalu memiliki keunikan tersendiri, tak terkecuali yang ada di Desa Nateh, Kecamatan Batang Alai Timur, Kabupaten Hulu Sungai Tengah ini. Dua bukit, yang jaraknya cukup berjauhan, dihubungkan dengan sebuah jembatan gantung yang desainya begitu… eksotis.",
        "Sama halnya Candi Borobudur di Yogyakarta atau Gunung Tangkuban Parahu di Bandung, Pasar Terapung Lok Baintan adalah tempat wajib yang harus Anda kunjungi bila berkunjung ke Kalimantan Selatan. Di mana lagi Anda bisa menemukan pasar terapung yang begitu ikonik, dengan metode transaksi yang masih tradisional.",
        "\"WOW!\" Demikian kesan yang pertama terucap ketika berkunjung ke Goa Batu Hapu, Tapin, Kalsel. Goa karst ini memiliki ruang yang luas dan tekstur dinding yang tidak biasa. Keberadaan stalagmit dan stalaktit pada dasar dan langit goa menambah alasan untuk terus terpukau. Lubang di langit goa, yang membiarkan sinar matahari masuk juga menambah eksotisme goa itu sendiri.",
        "Selalu menjadi hal yang menyenangkan bisa menikmati pemandangan bawah tanah yang ajaib, tak terkecuali di Tabalong, Kalimantan Selatan. Goa Liang Tanah menjadi spot di mana Anda bisa menikmati keindahan ciptaan Tuhan tersebut di Kalimantan Selatan. Dengan aliran air bawah tanah yang ada, Goa Liang Tanah memiliki keistimewaan tersendiri di kalangan para petualang.",
        "Bekas tanah tambang atau penggalian batu bara bisa juga menjadi tempat yang keren. Salah satu contohnya adalah Danau Biru Pengaron. Terletak di Kabupaten Banjar, danau ini menampilkan keindahan yang alami. Airnya berwarna biru, dengan tebing-tebing hasil kerukan alat berat mengelilingi danau itu sendiri.",
        "Konon katanya ada sembilan desa di dalam Waduk Riam Kanan ini, desa yang sengaja ditenggelamkan demi pembangunan waduk tersebut. Terlepas dari kontroversi tersebut, pemandangan dan panorama di waduk itu sendiri memang indah. Suasana yang tenang dan syahdu, juga alam perbukitan nan hijau, menambah keindahan dan keasrian Waduk Riam Kanan.",
        "Fungsi utamanya adalah menjadi paru-paru kota, tapi kini Hutan Pinus Mentaos telah menjadi destinasi wajib bagi para traveler dan Instagrammer yang datang ke Banjar Baru. Bagaimana tidak, selain atmosfernya yang adem, Hutan Pinus Mentaos juga cozy banget untuk bersantai. Di sejumlah sudut, terdapat payung-payung gantung ber warna-warni yang disusun rapi dan bisa menjadi background kece untuk foto-foto.",
        "Tak mudah untuk menemukan tempat ini. Selain tempatnya yang tersembunyi, minim sekali penunjuk jalan untuk bisa sampai ke tujuan. Tapi sesampainya di salah satu wisata andalan di Desa Beruntung Jaya ini, Anda pasti langsung ingin segera beraktivitas di sana. Dengan konsep wisata alam outbound, Rumah Pohon Cempaka menyediakan sejumlah wahana yang asyik, termasuk di antaranya sejumlah spot rumah pohon untuk berswafoto.",
        "Sejatinya spot ini bukanlah tempat wisata. Tapi, keunikannya menjadi hal yang tak boleh dilewatkan para traveler maupun pecinta fotografi. Secara konstruksi, Rumah Jomblo tak menunjukkan sesuatu yang istimewa. Terbuat dari kayu, memiliki kesan rapuh, usang dan luas rumah juga tidak begitu besar."
    )

    private val wisataImages = intArrayOf(
        R.drawable.labirin,
        R.drawable.jembatan_gantung,
        R.drawable.pasar_terapung,
        R.drawable.goa_batu_hapu,
        R.drawable.goa_liang_tapah,
        R.drawable.danau_biru,
        R.drawable.waduk,
        R.drawable.hutan_pinus,
        R.drawable.rumah_pohon,
        R.drawable.rumah_jomblo)

    val listData: ArrayList<Wisata>
    get(){
        val list = arrayListOf<Wisata>()
        for (position in wisataNames.indices){
            var wisata = Wisata()
            wisata.name = wisataNames[position]
            wisata.lokasi = wisataLokasi[position]
            wisata.detail = wisataDetails[position]
            wisata.img = wisataImages[position]
            list.add(wisata)
        }
        return list
    }
}