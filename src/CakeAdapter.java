public class CakeAdapter implements  CakePlayer{

    AdvancedCakePlayer chocoMediaPlayer = new ChocoPlayer();
    AdvancedCakePlayer vaniMediaPlayer = new VaniPlayer();

    @Override
    public void play (String cakeType, String fileName){
        if (cakeType.equalsIgnoreCase("Choco")) {
            chocoMediaPlayer.playChoco(fileName);
        }else if (cakeType.equalsIgnoreCase("Vani")){
            vaniMediaPlayer.playVani(fileName);
        }
    }

}
