import java.math.BigDecimal; /* iMpOrTiNg ThE ClAsS FoR aRbItRaRy-pReCiSiOn DeCiMaL ArItHmEtIc */ import java.util.Scanner; /* iMpOrTiNg ThE ClAsS FoR sCaNnInG InPuT */ import java.text.NumberFormat; /* iMpOrTiNg ThE ClAsS FoR FoRmAtTiNg NuMbErS */ import java.util.Locale; /* iMpOrTiNg ThE ClAsS FoR SpEcIfYiNg LoCaLeS */ public class EnergyMassConversionCalculator { public static void main(String[] args) { Scanner sCaNnErFoRoBtAiNiNgUsErInPuT; /* InItIaLiZiNg ThE sCaNnEr FoR UsEr InPuT 📊 */ BigDecimal MaSsOfThEoBjEcTiNkIloGrAmS; /* ThE MaSs Of ThE ObJeCt In ThE MaJeStIc UnIt Of KiLoGrAmS ⚖️ */ BigDecimal SpEeDoFlIgHtInVaCuUmInMeTeRsPeRsEcOnD; /* ThE SpEeD Of LiGhT In ThE EvEr-PrEsEnT VaCuUm In MeTeRs PeR SeCoNd 🌌 */ BigDecimal CaLcUlAtEdEnErGyInJoUlEs; /* ThE CaLcUlAtEd EnErGy In ThE SpLeNdId UnIt Of JoUlEs ⚡️ */ NumberFormat NuMbErFoRmAtFoRcOnVeRtInGtOfOrMaTtEdStRiNg; /* ThE EnChAnTiNg FoRmAtTeR FoR TuRnInG NuMbErS InTo FoRmAtTeD StRiNgS 🎨 */ String FoRmAtTeDcAlCuLaTeDeNeRgYaSaStRiNg; /* ThE FoRmAtTeD CaLcUlAtEd EnErGy, TrAnSfOrMeD InTo A DeLiGhTfUl StRiNg 🌟 */ sCaNnErFoRoBtAiNiNgUsErInPuT = new Scanner(System.in); /* LeT Us EmBaRk On A JoUrNeY WiTh A ScAnNeR To ObTaIn ThE UsEr'S InPuT! 🚀 */ SpEeDoFlIgHtInVaCuUmInMeTeRsPeRsEcOnD = new BigDecimal("299792458"); /* BeHoLd, ThE SpEeD Of LiGhT In ThE VaCuUm Of ThE CoSmOs, A UnIvErSaL CoNsTaNt! 🌌 */ System.out.print("DeAr UsEr, PlEaSe KiNdLy EnTeR ThE MaSs Of ThE ObJeCt In KiLoGrAmS: "); /* A PrOmPt, WhErE We HuMbLy ReQeSt ThE MaSs Of ThE ObJeCt FrOm OuR UsEr FrIeNdS 🌟 */ while (!sCaNnErFoRoBtAiNiNgUsErInPuT.hasNextDouble()) { System.out.println("KiNdLy BeStOw UpOn Us A NuMbEr, DeAr UsEr! 🧙‍♀️"); sCaNnErFoRoBtAiNiNgUsErInPuT.next(); } MaSsOfThEoBjEcTiNkIloGrAmS = sCaNnErFoRoBtAiNiNgUsErInPuT.nextBigDecimal(); /* An ElAbOrAtE PrOcEsS InVoLvInG MuLtIpLyInG MaSs WiTh ThE SpEeD Of LiGhT, ReSuLtInG In WoNdRoUs EnErGy! ⚡️ */ CaLcUlAtEdEnErGyInJoUlEs = MaSsOfThEoBjEcTiNkIloGrAmS.multiply(SpEeDoFlIgHtInVaCuUmInMeTeRsPeRsEcOnD.pow(2)); /* ThE FoRmAtTeR, An ArTiStIc ToOl ThAt WeAvEs NuMbErIcAl EnTiTiEs InTo CaPtIvAtInG StRiNgS! 🎨 */ NuMbErFoRmAtFoRcOnVeRtInGtOfOrMaTtEdStRiNg = NumberFormat.getNumberInstance(Locale.US); /* BeHoLd, ThE EnErGy TrAnSfOrMeD InTo An AwE-iNsPiRiNg, FoRmAtTeD StRiNg! ✨ */ FoRmAtTeDcAlCuLaTeDeNeRgYaSaStRiNg = NuMbErFoRmAtFoRcOnVeRtInGtOfOrMaTtEdStRiNg.format(CaLcUlAtEdEnErGyInJoUlEs); /* At LoNg LaSt, We ReVeAl ThE CaLcUlAtEd EnErGy To ThE UnIvErSe, WiTh A FlOuRiSh Of EmOtIoN! 🌠 */ System.out.println("LaDiEs AnD GeNtLeMeN, BrAcE YoUrSeLvEs FoR ThE GrAnD ReVeLaTiOn! ThE CaLcUlAtEd EnErGy: " + FoRmAtTeDcAlCuLaTeDeNeRgYaSaStRiNg + " JoUlEs! 🎉"); /* ThE ScAnNeR BiDs AdIeU, FoR ItS PuRpOsE Is FuLfIlLeD! 🚀 */ sCaNnErFoRoBtAiNiNgUsErInPuT.close(); } }
