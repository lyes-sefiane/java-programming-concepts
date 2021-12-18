package com.design.patterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * PauseState.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class PauseState implements State {

	private static Logger logger = LoggerFactory.getLogger(PauseState.class);

	@Override
	public void pause(MediaPlayer mediaPlayer) {
		//
	}

	@Override
	public void play(MediaPlayer mediaPlayer) {
		mediaPlayer.setState(new PlayingState());
		mediaPlayer.setIcon("Pause Button");
		logger.info("Video Playing, Icon set to {}", mediaPlayer.getIcon());
	}

}
