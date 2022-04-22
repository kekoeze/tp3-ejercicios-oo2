package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {
  private InterfazCvsData cvsData;

  public Recaudacion(InterfazCvsData intefarceCvsData) {
    this.cvsData = interfaceCvsData;
  }

  public List<Map<String, String>> where(Map<String, String> options) throws IOException {
    this.cvsData.agregarCvsData();
    this.contieneKey(options);
    return this.cvsData.agregarMap();
  }

  public Map<String, String> findBy(Map<String, String> options)
      throws IOException, NoSuchEntryException {
    List<String[]> csvData = new ArrayList<String[]>();
    CSVReader reader = new CSVReader(new FileReader("data.csv"));
    String[] row = null;

    while ((row = reader.readNext()) != null) {
      csvData.add(row);
    }

    reader.close();
    csvData.remove(0);
    Map<String, String> mapped = new HashMap<String, String>();

    for (int i = 0; i < csvData.size(); i++) {
      if (options.containsKey("company_name")) {
        if (csvData.get(i)[1].equals(options.get("company_name"))) {
          mapped.put("permalink", csvData.get(i)[0]);
          mapped.put("company_name", csvData.get(i)[1]);
          mapped.put("number_employees", csvData.get(i)[2]);
          mapped.put("category", csvData.get(i)[3]);
          mapped.put("city", csvData.get(i)[4]);
          mapped.put("state", csvData.get(i)[5]);
          mapped.put("funded_date", csvData.get(i)[6]);
          mapped.put("raised_amount", csvData.get(i)[7]);
          mapped.put("raised_currency", csvData.get(i)[8]);
          mapped.put("round", csvData.get(i)[9]);
        } else {
          continue;
        }
      }

      if (options.containsKey("city")) {
        if (csvData.get(i)[4].equals(options.get("city"))) {
          mapped.put("permalink", csvData.get(i)[0]);
          mapped.put("company_name", csvData.get(i)[1]);
          mapped.put("number_employees", csvData.get(i)[2]);
          mapped.put("category", csvData.get(i)[3]);
          mapped.put("city", csvData.get(i)[4]);
          mapped.put("state", csvData.get(i)[5]);
          mapped.put("funded_date", csvData.get(i)[6]);
          mapped.put("raised_amount", csvData.get(i)[7]);
          mapped.put("raised_currency", csvData.get(i)[8]);
          mapped.put("round", csvData.get(i)[9]);
        } else {
          continue;
        }
      }

      if (options.containsKey("state")) {
        if (csvData.get(i)[5].equals(options.get("state"))) {
          mapped.put("permalink", csvData.get(i)[0]);
          mapped.put("company_name", csvData.get(i)[1]);
          mapped.put("number_employees", csvData.get(i)[2]);
          mapped.put("category", csvData.get(i)[3]);
          mapped.put("city", csvData.get(i)[4]);
          mapped.put("state", csvData.get(i)[5]);
          mapped.put("funded_date", csvData.get(i)[6]);
          mapped.put("raised_amount", csvData.get(i)[7]);
          mapped.put("raised_currency", csvData.get(i)[8]);
          mapped.put("round", csvData.get(i)[9]);
        } else {
          continue;
        }
      }

      if (options.containsKey("round")) {
        if (csvData.get(i)[9].equals(options.get("round"))) {
          mapped.put("permalink", csvData.get(i)[0]);
          mapped.put("company_name", csvData.get(i)[1]);
          mapped.put("number_employees", csvData.get(i)[2]);
          mapped.put("category", csvData.get(i)[3]);
          mapped.put("city", csvData.get(i)[4]);
          mapped.put("state", csvData.get(i)[5]);
          mapped.put("funded_date", csvData.get(i)[6]);
          mapped.put("raised_amount", csvData.get(i)[7]);
          mapped.put("raised_currency", csvData.get(i)[8]);
          mapped.put("round", csvData.get(i)[9]);
        } else {
          continue;
        }
      }

      return mapped;
    }

    throw new NoSuchEntryException();
  }

  public static void main(String[] args) {
    try {
      Map<String, String> options = new HashMap<String, String>();
      options.put("company_name", "Facebook");
      options.put("round", "a");
      Recaudacion reca = new Recaudacion();
      System.out.print(reca.where(options).size());
    } catch (IOException e) {
      System.out.print(e.getMessage());
      System.out.print("error");
    }
  }
}

class NoSuchEntryException extends Exception {
}