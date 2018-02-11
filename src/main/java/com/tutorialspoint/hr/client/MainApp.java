package com.tutorialspoint.hr.client;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import com.tutorialspoint.hr.domain.GetCountryResponse;

public class MainApp {
   public static void main(String[] args) {
      CountryServiceClient client = new CountryServiceClient();
      Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
      marshaller.setContextPath("com.tutorialspoint.hr.domain");
      client.setMarshaller(marshaller);
      client.setUnmarshaller(marshaller);
      GetCountryResponse response = client.getCountryDetails("United States");

      System.out.println("Country : " + response.getCountry().getName());
      System.out.println("Capital : " + response.getCountry().getCapital());
      System.out.println("Population : " + response.getCountry().getPopulation());
      System.out.println("Currency : " + response.getCountry().getCurrency());
   }
}