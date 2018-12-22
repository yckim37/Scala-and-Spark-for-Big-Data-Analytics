package chapter4

object OptionsExample {
   def main(args: Array[String]) {
      val countryCapitals = Map("Ireland" -> "Dublin", "Egypt" -> "Cairo")
      
      println("countryCapitals.get( \"Ireland\" ) : " +  countryCapitals.get( "Ireland" ))
      println("countryCapitals.get( \"Britain\" ) : " +  countryCapitals.get( "Britain" ))

   }
}
