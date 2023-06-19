## Getting Started

pada kode ini saya membuat sebuah aplikasih yang menggunakan database yang di gunakan untuk 
untuk di manipulasi datanya yakni untuk di hapus, edit, tambahkan, serta untuk di baca .

## Folder Structure

terdapat beberapa kelas yang saya gunakan di program ini yang terpisah menjadi 
4 pakage yakni config, controllers, layout, dan, models
pada layout terdapat 5 class yang masing-masing mewakili layout atau tampilan dari 
aplikasi ini. dan juga secara besamaan mewakili operasi atau manipulasi data yang bisa di lakukan pada data yang ada di database. selain itu dalam pakage config terdapat classs MyConfig yang bertujuan untuk menkonesikan aplikasi dengan database yang ada, lalu pada class Conroler itu adalah class yang di dalamnya terdapay berbagai jenis method yang ada di panggil pada layout tertentu untuk dilakukan manipulasi. lalu pada pakage model terdapat sebuah class produk yang menjadi landasan atau perenst yang biasa di gunakan untuk mengenerate sebuah objek produk yang akan di manipulasi pada sebagian method contohnya method ProdukbyName yang mengambalikan objek bertipe produk 

dan terakhir adalah App yang berada di luar pakage yang sudah saya sebutkan di awal di mana di sinilah aplikasih akan di jalankan dan di sini pula terdapat method main yang bertugas untuk menjalankan seluruh aplikasih dan manipulasi 
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
