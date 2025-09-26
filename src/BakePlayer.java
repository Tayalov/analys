public class BakePlayer implements CakePlayer{
    CakeAdapter cakeAdapter = new CakeAdapter();

    @Override
    public void play(String cakeType,String fileName){
        if (cakeType.equalsIgnoreCase("cook")){
            System.out.println("Playing with cook.Name:"+fileName);
        }
        else if(cakeType.equalsIgnoreCase("Choco") || cakeType.equalsIgnoreCase("vani")) {
            cakeAdapter.play(cakeType, fileName);
        }else{
            System.out.println("invalid media." + cakeType + "no bakiinng");
        }
    }
}
