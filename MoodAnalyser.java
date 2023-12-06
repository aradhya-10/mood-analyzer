enum MoodAnalysisError {
    NULL_MOOD,
    EMPTY_MOOD
}

class MoodAnalysisException extends Exception {
    MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error) {
        this.error = error;
    }
}

public class MoodAnalyser {
	String message;

	/*
		MoodAnalyser will have 2 Constructors –
		Default - MoodAnalyser() and with
		Parameters – MoodAnalyser(message)
	*/

	MoodAnalyser(){
		this.message = "";
	}

	MoodAnalyser(String message){
		this.message = message;
	}

	/*
		UC1: Given a Message, ability to 
		analyse and respond	Happy or Sad Mood

		RF1: AnalyseMood method will 
		change to support no parameters

		UC2: Handle Exception if User 
		Provides Invalid Mood, return Happy

		UC3: Different responses for
		Null and Empty Messages
	*/

    public String analyseMood() throws MoodAnalysisException {
        if (this.message == null || this.message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
        }
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } 
		else if (this.message.toLowerCase().contains("happy")) {
            return "HAPPY";
        } 
		else {
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
        }
    }

    public static void main(String[] args) throws MoodAnalysisException {
		try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in A Sad Mood");
            String mood = moodAnalyser.analyseMood();
            System.out.println("Mood: " + mood);
            
			MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in A Happy Mood");
            String mood1 = moodAnalyser1.analyseMood();
            System.out.println("Mood: " + mood1);
            
			// MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
            // String mood2 = moodAnalyser2.analyseMood();
            // System.out.println("Mood: " + mood2);

            MoodAnalyser nullMoodAnalyser = new MoodAnalyser(null);
            String nullMood = nullMoodAnalyser.analyseMood();
            System.out.println("Mood: " + nullMood);
        } 
		catch (MoodAnalysisException e) 
		{
            if (e.error == MoodAnalysisError.EMPTY_MOOD) {
                System.out.println("Error: Empty Mood Provided");
            } else if (e.error == MoodAnalysisError.NULL_MOOD) {
                System.out.println("Error: No Mood Entered");
            }
        }
    }
}
