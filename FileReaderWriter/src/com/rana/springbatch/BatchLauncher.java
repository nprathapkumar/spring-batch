package com.rana.springbatch;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.support.CommandLineJobRunner;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

public class BatchLauncher {

	public static void main(String[] args)
			throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		String str[] = new String[] { "fileReaderJob.xml", "stepJob",
				"inputFile=C:\\Test.xml",
				"outputFile=C:\\TestOutput.xml" };
		try {
			CommandLineJobRunner.main(str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
