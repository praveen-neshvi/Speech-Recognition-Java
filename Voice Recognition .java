package com.voicerecog.test;

import java.io.IOException;

import demo.classNames;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

class Introduction implements ProjectInter
{
	public void function()
	{
		System.out.println("This project is created by PRAVEEN KUMAR N P, 4NI19IS066, ISE B.");
	}
}

class configurationObject extends classNames
{
	
	Configuration func()
	{
		Configuration obj = new Configuration();
		
		classNames a = new classNames("configurationObject");
		a.printClassName();
		
		return obj;
	}
	
	public void show()
	{
		super.show();
	}
	
	public void show(String s)
	{
		super.show(s);
	}

}

class speechResultObject extends classNames
{
	String name;
	
	SpeechResult func()
	{
		SpeechResult obj = null;
		
		classNames a = new classNames("speechResultObject");
		a.printClassName();
		
		return obj;
	}
	
	public void show()
	{
		super.show();
	}
	
	public void show(String s)
	{
		super.show(s);
	}
}

public class VoiceRecognizer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Introduction i = new Introduction();
		i.function();
		
		Configuration config;
		
		configurationObject ob1 = new configurationObject();
		config = ob1.func();
		ob1.show();
		
		config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		config.setDictionaryPath("/Users/91900/eclipse-workspace/voiceRecogniser/src/com/voicerecog/resources/7546.dic");
		config.setLanguageModelPath("/Users/91900/eclipse-workspace/voiceRecogniser/src/com/voicerecog/resources/7546.lm");
		
		try 
		{
			LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(config);
			classNames a = new classNames("LiveSpeechRecognizer");
			a.printClassName();
			recognize.startRecognition(true);
			
			SpeechResult speechResult;
			
			speechResultObject ob2 = new speechResultObject();
			speechResult = ob2.func();
			ob2.show("speechResultObject");
			
			while ((speechResult = recognize.getResult()) != null) {
				String voiceCommand = speechResult.getHypothesis();
				String work = null;
				System.out.println("Voice Command is " + voiceCommand);
				
				if (voiceCommand.equalsIgnoreCase("Open Chrome")) {
					work = "cmd.exe /c start chrome www.google.com";
				} 
				else if (voiceCommand.equalsIgnoreCase("Close Chrome"))
				{
					work = "cmd.exe /c TASKKILL /IM chrome.exe";
				}
				
				if(work != null) {
				Runtime.getRuntime().exec(work);
				}
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
			
	}

}
