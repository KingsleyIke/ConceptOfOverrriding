class Teachers extends Staff {

  boolean hasChalk;

  public Teachers (String idCardColor, boolean parkingSpace, boolean hasChalk){
      super(idCardColor, parkingSpace);
      this.hasChalk = hasChalk;
  }

  @Override
  public String getIdCardColor () {
    return "Red";
  }

  @Override
  boolean teach (){
   super.teach();
   return true;
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
