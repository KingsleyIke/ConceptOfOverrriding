class Principals extends Staff {

  public Principals (String idCardColor, Boolean parkingSpace){
      super(idCardColor, parkingSpace);
  }

  @Override
  public String getIdCardColor () {
    return "Black";
  }

  @Override
  boolean teach (){
    return false;
  }

  @Override
  String punish () {
    return "Punish all students";
  }

  @Override
  int salary () {
    return 600_000;
  }
}