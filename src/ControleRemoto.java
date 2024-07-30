public class ControleRemoto implements Interface {

    //<editor-fold desc="Funções">

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-=-MENU-=-");
        System.out.println("On/Off: "+ this.getLigado());
        System.out.println("Playing: "+ this.getTocando());
        System.out.println("Volume: "+ this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10 ){
            System.out.print("[" + i + "]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Closing Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }


    //</editor-fold>

    //<editor-fold desc="Atributos">
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //</editor-fold>

    //<editor-fold desc="Contrutor">
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    private int getVolume(){
        return volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean l){
         this.ligado = l;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    //</editor-fold>
}
