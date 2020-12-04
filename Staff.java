public class Staff {

  private String idCardColor;
  Boolean parkingSpace;

  public Staff (String idCardColor, Boolean parkingSpace) {
    this.idCardColor = idCardColor;
    this.parkingSpace= parkingSpace;

  }

  public void setIdCardColor (String idCardColor) {
    this.idCardColor = idCardColor;
    
  }

  public String getIdCardColor () {
    return idCardColor;
  }

  boolean teach (){
    return true;
  }

  String punish () {
    return "punish....";
  }

  int salary () {
    return 500_000;
  }

  
}