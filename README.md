# A101TestOtomasyon_FinalCase
TestNG Framework 'ü kullanıldı. Tool olarak Maven Repository kullanıldı. Java dili ile Selenium kullanılarak yazıldı.

![InkedFRAMEWORK](https://user-images.githubusercontent.com/108357127/200181325-9088e499-1e16-452f-9359-443ee21c437e.jpg)
---
![InkedFRAMEWORK02](https://user-images.githubusercontent.com/108357127/200182233-d106b1c6-1b7b-4e01-876b-99916fd8480e.jpg)
-----
![Ekran Görüntüsü (725)](https://user-images.githubusercontent.com/108357127/200182593-b0b601db-eb83-41f3-b8f0-25adcc2c3c96.jpg)
##### HomePage:
-	İlk olarak pageBase i extend ediyoruz ki oradaki özellikleri burada da kullanabilelim.
- Daha sonra super constructor yazıyoruz.
-	Şirketin verdiği bir login bilgisi ile giriş yapmamız gereken bir durum var ise içi boş bir login metodu yazıyoruz.
##### MethodPage:
-	Tekrardan  pageBase i extend ediyoruz.
-	Daha sonra super constructor yazıyoruz.
- Şimdi ise metod yazıyoruz. Yapacağımız bütün fonksiyonları buraya yazıyoruz mesela şifre gönderme, data alma, click yapma vb. Bu metodun sonuna ise return value olarak tekrardan method page i yazıyoruz çünkü her seferinde tekrar bu sayfaya dönülmesini istiyoruz.
---

![Ekran Görüntüsü (726)](https://user-images.githubusercontent.com/108357127/200182920-347e985c-b257-4877-ba66-3fe4c2ae8dde.png)
#### İkinci Adım:
- **myCompanyUtil** paketini main java içerisine açıyoruz. Burada util paketi içerisine test esnasında kullanılacak kodların bulunduğu class lar açıyoruz. 
Mesela browser tanımlamaları ile ilgili kodlar, javascript ile ilgili kodlar, api için kodlar vb. kodların bulunduğu class lar açıyoruz. Burada herhangi bir sınırımız yok istediğimiz kadar class ekleyebiliriz.

---
![Ekran Görüntüsü (727)](https://user-images.githubusercontent.com/108357127/200183183-859a96d2-fe08-44e5-9158-a3a488105b88.png)
#### Üçüncü Adım: 
##### *myCompanyTest* paketini açıyoruz ve daha sonra,
-	**testBase class** ı açıyoruz. Bunun içerisine test öncesi, test sırası ve test sonrası yapılacak şeyleri yazıyoruz. Yani testin izleyeceği adımları yazıyoruz. (TestConfigProperties i burada path olarak verip oradan url, browser filan alıyoruz.)
-	**callTest class** ı açıyoruz. Burada testleri test annotationu (@test) ile çağırıyoruz. Metod sayfasında metoda ne isim verdiysek burada testi o isim ile çağırıyoruz. Ayrıca testin sonucuna assertion ekliyoruz test başarılı veya değil diye. Bu sayfada testlerimize priority verebiliyoruz 1, 2, 3 şeklinde.
---

📚 İstenilen Final Test Case' nin İçeriği

### Kullanılacak Teknolojiler: Selenium
### Konu: Hepsiburada.com üzerinden sepete ürün eklenmesi 

Tets1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
- Kullanıcı Hepsiburada.com sitesini ziyaret eder.
- Kullanıcı giriş işlemi yapılır.
- Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
- Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
- Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
- Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
- Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

Test2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
- Kullanıcı Hepsiburada.com sitesini ziyaret eder.
- Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
- Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
- Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

### Gereksinimler
- Proje Java programlama dilinde yazılmalıdır. Maven repo kullanılmalıdır.
- Kodlar github üzerinden paylaşılması gereklidir. 
- Yazılacak senaryo için Selenium ve JUnit/Testng kullanılmalıdır.
- Assertions kullanarak senaryonun doğru çalışırlığı kontrol edilmelidir.
- Log kullanılmalıdır.
- Page object model uygulanmalıdır.
- OOP prensiplerine uygun geliştirilmelidir.
