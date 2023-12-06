public class MoodAnalyser {
	String message;

	/*
		MoodAnalyser will have 2 Constructors –
		Default - MoodAnalyser() and with
		Parameters – MoodAnalyser(message)
	*/

	MoodAnalyser(){
		String mood1 = "I am in a Happy mood.";
		String mood2 = "I am in a Sad mood.";
		int chance = (int)(Math.random()*2);
		this.message = chance == 1 ? mood1 : mood2;
	}

	MoodAnalyser(String message){
		this.message = message;
	}

	/*
		UC1: Given a Message, ability to 
		analyse and respond	Happy or Sad Mood

		RF1: AnalyseMood method will 
		change to support no parameters
	*/

    public String analyseMood() {
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
			return "HAPPY";
        }
    }

    public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		System.out.println(moodAnalyser.analyseMood());
    }
}
