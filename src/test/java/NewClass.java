
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Administrator
 */
public class NewClass {

    public static void main(String[] args) {
//        rc.soop.servlet.OperazioniSA.uploadRegistrioAula(a) 14:00
//rc.soop.servlet.OperazioniSA.uploadRegistrioAula(a) 46800000
//rc.soop.servlet.OperazioniSA.uploadRegistrioAula(a) 19:00
//rc.soop.servlet.OperazioniSA.uploadRegistrioAula(a) 64800000
        String or = "2023-01-01 00:00";
        String hh1 = "2023-01-01 14:00";
        String hh2 = "2023-01-01 19:00";

        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");

        System.out.println(dtf.parseDateTime(hh1).toDateTime().getMillis() - dtf.parseDateTime(or).toDateTime().getMillis());
        System.out.println(dtf.parseDateTime(hh2).toDateTime().getMillis() - dtf.parseDateTime(or).toDateTime().getMillis());

//        Entity e = new Entity();
//        ProgettiFormativi p = e.getEm().find(ProgettiFormativi.class, 122L);
//        e.close();
//
//        List<ProgettiFormativi> prgs = new ArrayList<>();
//        prgs.add(p);
//
//        ByteArrayOutputStream out = createTarArchive(prgs);
//        
////        compileTabella1(56L);
//        Database db1 = new Database();
//        String base64or = db1.getBase64Report(38);
//        List<FadCalendar> calendarioFAD = db1.calendarioFAD("38");
//        db1.closeDB();
//        Entity e = new Entity();
//
////        calendarioFAD.forEach(c1 -> {
////        
////            System.out.println(c1.toString());
////        });
//        ProgettiFormativi pf = e.getEm().find(ProgettiFormativi.class, 38L);
//        List<Docenti> list_docenti = e.getDocentiPrg(pf);
//        List<DocumentiPrg> list_doc_pr = e.getDocPrg(pf);
//        List<Documenti_Allievi> list_doc_al = e.getDocAllieviPR(pf);
//        
//
////        list_doc_pr.forEach(r1 -> {
////
////            if (r1.getGiorno() != null) {
////                System.out.println("NewClass.main() "+r1.getGiorno().getTime());
////            }
////        });
//
//        impostaregistri(base64or, pf.getAllievi(), calendarioFAD, list_doc_pr, list_doc_al);
//
////        presenti.add(new Presenti(a.getId(), a.getNome(), a.getCognome(), in, out, getHour(in, out)));
    }
}
