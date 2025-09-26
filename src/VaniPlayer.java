public class VaniPlayer implements AdvancedCakePlayer {
    @Override
    public void playChoco(String fileName) {
        //Do nothing
    }

    @Override
    public void playVani(String fileName) {
        System.out.println("Playing when i use vani file. Name" + fileName);
    }
}
