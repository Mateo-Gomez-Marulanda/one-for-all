package com.PatronesDeDiseño.PatronesComportamentales.Command.taller0;

//ejemplo clase 10/30/2024

// clase receptor con los comandos definidos
class MusicPlayer {

    public void play() {
        System.out.println("reproduciendo musica");
    }

    public void stop() {
        System.out.println("deteniendo musica");
    }
}

// interfaz command para los tipos de comandos
interface Command {
    void execute(); // metodo general para los comandos
}

// comandos concretos
class PlayMusic implements Command {
    private MusicPlayer player; // referencia al Receptor

    public PlayMusic(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}

class StopMusic implements Command {
    private MusicPlayer player;

    public StopMusic(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}

// clase invocador para llamar los comandos
class Invocador {
    private Command command; // referencia a los comandos

    public Invocador(Command command) {
        this.command = command;
    }

    // metodo para invocar los diferentes tipos de comandos
    public void invocar() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
        invocar();
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        Command playMusic = new PlayMusic(player);
        Command stopMusic = new StopMusic(player);

        Invocador invocador = new Invocador(playMusic);
        invocador.invocar();

        invocador.setCommand(stopMusic);

    }
}
