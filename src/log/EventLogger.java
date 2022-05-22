package log;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager(); // Logmanager 값을 넣어줌
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}				// log를 통한 정보 저장 + 저장된 정보를 파일에서 조회 가능

	public void log(String logMessage) {
		logger.info(logMessage);
	}
}