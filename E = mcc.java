import java.math.BigDecimal; // Importing the class for arbitrary-precision decimal arithmetic
import java.util.Scanner; // Importing the class for scanning input
import java.text.NumberFormat; // Importing the class for formatting numbers
import java.util.Locale; // Importing the class for specifying locales

// The glorious class that orchestrates energy-mass conversion calculations! 🚀
public class EnergyMassConversionCalculator {
    public static void main(String[] args) {
        Scanner scannerForObtainingUserInput; // Initializing the scanner for user input 📊
        BigDecimal massOfTheObjectInKilograms; // The mass of the object in the majestic unit of kilograms ⚖️
        BigDecimal speedOfLightInVacuumInMetersPerSecond; // The speed of light in the ever-present vacuum in meters per second 🌌
        BigDecimal calculatedEnergyInJoules; // The calculated energy in the splendid unit of joules ⚡️
        NumberFormat numberFormatForConvertingToFormattedString; // The enchanting formatter for turning numbers into formatted strings 🎨
        String formattedCalculatedEnergyAsString; // The formatted calculated energy, transformed into a delightful string 🌟
        
        // Let us embark on a journey with a scanner to obtain the user's input! 🚀
        scannerForObtainingUserInput = new Scanner(System.in); 
        
        // Behold, the speed of light in the vacuum of the cosmos, a universal constant! 🌌
        speedOfLightInVacuumInMetersPerSecond = new BigDecimal("299792458"); 
        
        // A prompt, where we humbly request the mass of the object from our user friends 🌟
        System.out.print("Dear user, please kindly enter the mass of the object in kilograms: "); 
        
        // A magical loop that beckons for numeric input, should there be any hesitation 🧙‍♂️
        while (!scannerForObtainingUserInput.hasNextDouble()) {
            System.out.println("Kindly bestow upon us a number, dear user! 🧙‍♀️"); // A reminder for the numerically challenged
            scannerForObtainingUserInput.next(); // Proceeding to the next token
        }
        massOfTheObjectInKilograms = scannerForObtainingUserInput.nextBigDecimal(); // The noble mass is bestowed upon us!
        
        // An elaborate process involving multiplying mass with the speed of light, resulting in wondrous energy! ⚡️
        calculatedEnergyInJoules = massOfTheObjectInKilograms.multiply(speedOfLightInVacuumInMetersPerSecond.pow(2)); 
        
        // The formatter, an artistic tool that weaves numerical entities into captivating strings! 🎨
        numberFormatForConvertingToFormattedString = NumberFormat.getNumberInstance(Locale.US); 
        
        // Behold, the energy transformed into an awe-inspiring, formatted string! ✨
        formattedCalculatedEnergyAsString = numberFormatForConvertingToFormattedString.format(calculatedEnergyInJoules); 
        
        // At long last, we reveal the calculated energy to the universe, with a flourish of emotion! 🌠
        System.out.println("Ladies and gentlemen, brace yourselves for the grand revelation! The Calculated Energy: " 
                           + formattedCalculatedEnergyAsString + " Joules! 🎉"); 
        
        // The scanner bids adieu, for its purpose is fulfilled! 🚀
        scannerForObtainingUserInput.close(); 
    }
}
