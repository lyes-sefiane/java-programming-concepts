package com.design.patterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * PlayingState.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Mar. 6, 2021
 *
 */
public class PlayingState implements State {

	private static Logger logger = LoggerFactory.getLogger(PlayingState.class);

	@Override
	public void pause(MediaPlayer mediaPlayer) {
		mediaPlayer.setState(new PauseState());
		mediaPlayer.setIcon("Play Button");
		logger.info("Video Paused, Icon set to {}", mediaPlayer.getIcon());
	}

	@Override
	public void play(MediaPlayer mediaPlayer) {
		//
	}

}
