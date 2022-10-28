import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class H01_DateTime_Ilk_Kullanim_Ve_Sorular {
    public static void main(String[] args) {

        //Example 1: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();//Bulundugun mekanda ki anlik tarihi ver.

        System.out.println("Example 1 = "+currentDate);//2022-10-21

        //Example 2: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();//Bulundugun mekanda ki anlik saati ver.

        System.out.println("Example 2 = "+currentTime);//20:41:24.123739 // 123739 ==> Nano saniye'yi gosterir

        //Example 3: "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Example 3 = "+currentDateTime);//2022-10-21T20:45:16.122770

        //Example 4: Japonya'daki "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Example 4 = "+currentDateTimeInJapan);//2022-10-22T02:50:51.524172

        LocalDateTime floridaAnlik = LocalDateTime.now(ZoneId.of("US/Eastern") );
        System.out.println("Example 4 = "+"floridaAnlik = " + floridaAnlik);//2022-10-27T20:28:03.366767

        //Example 5:Istanbul'daki "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.


        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Example 5 = "+currentDateTimeInIstanbul);//2022-10-21T20:52:03.410270


        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println("Example 6 = "+retireDate);

        //      LocalDate currentDate2 = LocalDate.now();
        //      LocalDate retireDate = currentDate2.plusDays(789);


        //Example 7: Iki cocogunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between (dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println("Example 7 = " + diff + " gun fark var");


        //Example 8: Java'dan aldiginiz Date'i "Ay/gun/yil" olarak yaziniz.

        LocalDate anlikTarih = LocalDate.now();
        System.out.println("Example 8 = " + anlikTarih);// 2022-09-28


        /// ==> slash yerine istedigin karakteri katabilirsiniz. 10/28/2022 ==> 10*28*2022
        DateTimeFormatter gunTarih = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                                                               // MM ==> 10'dan kucuk aylari 01,02,03 etc. seklinde yazar.
        String formatlanmisTarih = gunTarih.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih = " + formatlanmisTarih);// 09/28/2022



        DateTimeFormatter gunTarih2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
                                                                // MMM ==> ayin ilk 3 harfini verdi
        String formatlanmisTarih2 = gunTarih2.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih2 = " + formatlanmisTarih2);// Oct/28/2022



        DateTimeFormatter gunTarih3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
                                                                // MMMM ==> ayin full ismini verir
        String formatlanmisTarih3 = gunTarih3.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih3 = " + formatlanmisTarih3);// October/28/2022



        DateTimeFormatter gunTarih4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
                                                                // M ==> 10'dan kucuk aylari 1,2,3 etc. seklinde yazar.
        String formatlanmisTarih4 = gunTarih4.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih4 = " + formatlanmisTarih4);//9/28/2022



        DateTimeFormatter gunTarih5 = DateTimeFormatter.ofPattern("M/dd/yy");
                                                                     // yy ==> Son 2 rakamini yazdirir.
        String formatlanmisTarih5 = gunTarih5.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih5 = " + formatlanmisTarih5);// 9/28/22



        DateTimeFormatter gunTarih6 = DateTimeFormatter.ofPattern("M/d/yy");
                                                                  // d ==> 10'den kucuk gunleri 1,2,3  etc. seklinde yazar.
                                                                  // 01,02,03 kullanmaz.
        String formatlanmisTarih6 = gunTarih5.format(anlikTarih);
        System.out.println("Example 8 = "+"formatlanmisTarih6 = " + formatlanmisTarih6);// 9/8/22



        //Example 9: Java dan aldiginiz time'in formatini degistiriniz.
        LocalTime benimZamanim = LocalTime.of(18,39,07,777505);
        System.out.println("Example 9 = "+ "benimZamanim = " + benimZamanim);



        DateTimeFormatter saat = DateTimeFormatter.ofPattern("HH:mm");
                                                           //"HH" 24 saat sistemini kullanir
        String formattedSaat = saat.format(benimZamanim);
        System.out.println("Example 9 = "+"formattedSaat = " + formattedSaat);//18:39



        DateTimeFormatter saat2 = DateTimeFormatter.ofPattern("hh:mm");
                                                            //"hh" 12 saat sistemini kullanir
        String formattedSaat2 = saat2.format(benimZamanim);
        System.out.println("Example 9 = "+"formattedSaat = " + formattedSaat2);//06:39



        DateTimeFormatter saat3 = DateTimeFormatter.ofPattern("hh:mma");
                                                           // "a" (bosluk a) koyarsaniz size pm - am gosterir.
                                                           // bosluk birakmadan sadece "a" da yazabilirsiniz.
        String formattedSaat3 = saat3.format(benimZamanim);
        System.out.println("Example 9 = "+"formattedSaat = " + formattedSaat3);//06:39 PM



        //Example 10: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(germany, japan);//6
        //eger -6 yazarsa siralamayi yanlis girmissiniz demektir. Daha eski olani once yazmamiz gerekiyo (germany,japan)
        System.out.println(fark);// 6



        // Example 1: Tom Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        // Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER,18);

        LocalDate dobAli2 = dobTom.minusYears(3).minusMonths(8).minusDays(13);

        LocalDate dobVeli1 = dobAli2.plusYears(1).plusDays(15);

        System.out.println("Ali: " + dobAli2);
        System.out.println("Veli " + dobVeli1);




















    }
}
