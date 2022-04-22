public class CvsData implements InterfazCvsData {
    private List<String[]> arregloCvsData;

    public void agregarCvsData() {

        List<String[]> csvData = new ArrayList<String[]>();
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String[] row = null;

        while ((row = reader.readNext()) != null) {
            csvData.add(row);
        }
        reader.close();
        csvData.remove(0);
        this.arregloCvsData = csvData;
    }

    public contieneKey( Map<String, String> options){
        if (options.containsKey("company_name")) {
            InterfaceWhere<String[]> lambda = (String[] s) -> s[1].equals(options.get("company_name"));
            this.arregloCvsData = Filtro.filtrar(lambda, csvData);
          }
          if (options.containsKey("city")) {
            InterfaceWhere<String[]> lambda = (String[] s) -> s[4].equals(options.get("company_name"));
            this.arregloCvsData = Filtro.filtrar(lambda, csvData);
          }
          if (options.containsKey("state")) {
            InterfaceWhere<String[]> lambda = (String[] s) -> s[5].equals(options.get("company_name"));
            this.arregloCvsData = Filtro.filtrar(lambda, csvData);
          }
          if (options.containsKey("round")) {
            InterfaceWhere<String[]> lambda = (String[] s) -> s[9].equals(options.get("company_name"));
            this.arregloCvsData = Filtro.filtrar(lambda, csvData);
          }
    }

    public List<Map<String, String>> agregarMap() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        for (int i = 0; i < this.arregloCvsData.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", this.arregloCvsData.get(i)[0]);
            mapped.put("company_name", this.arregloCvsData.get(i)[1]);
            mapped.put("number_employees", this.arregloCvsData.get(i)[2]);
            mapped.put("category", this.arregloCvsData.get(i)[3]);
            mapped.put("city", this.arregloCvsData.get(i)[4]);
            mapped.put("state", this.arregloCvsData.get(i)[5]);
            mapped.put("funded_date", this.arregloCvsData.get(i)[6]);
            mapped.put("raised_amount", this.arregloCvsData.get(i)[7]);
            mapped.put("raised_currency", this.arregloCvsData.get(i)[8]);
            mapped.put("round", this.arregloCvsData.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }
}
