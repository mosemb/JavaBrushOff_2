package com.chapter11;

import javax.sound.midi.*;

public class MusicSequencer {
	
	public void play() throws MidiUnavailableException {
		
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We have got a sequencer ");
		
		
	}
	
	public static void main (String []args) throws MidiUnavailableException {
		
		MusicSequencer mtMusicSequencer = new MusicSequencer();
		mtMusicSequencer.play();
		
	}

}
