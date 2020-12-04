class NonAcademicStaff extends Staff {

  public NonAcademicStaff (String idCardColor, Boolean parkingSpace){
      super(idCardColor, parkingSpace);
  }


public NonAcademicStaff (String idCardColor){
      this(idCardColor, false);
  }
  
  @Override
  public String getIdCardColor () {
    return "Blue";
  }

  @Override
  boolean teach (){
    return false;
  }

  @Override
  String punish () {
    return "punish junior students";
  }

  @Override
  int salary () {
    return 200_000;
  }

}