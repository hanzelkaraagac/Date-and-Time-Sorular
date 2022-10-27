import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class H01_DateTime_Ilk_Kullanim {
    public static void main(String[] args) {

        //Example 1: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();//Bulundugun mekanda ki anlik tarihi ver.

        System.out.println(currentDate);//2022-10-21

        //Example 2: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();//Bulundugun mekanda ki anlik saati ver.

        System.out.println(currentTime);//20:41:24.123739 // 123739 ==> Nano saniye'yi gosterir

        //Example 3: "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:45:16.122770

        //Example 4: Japonya'daki "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:51.524172

        //Example 5:Istanbul'daki "Anlik tarihi" (Current Date) ve "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.


        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:52:03.410270


        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //      LocalDate currentDate2 = LocalDate.now();
        //      LocalDate retireDate = currentDate2.plusDays(789);


        //Example 7: Iki cocogunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between (dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff + " gun fark var");

    }
}
