public class MoodAnalyser {

	/*
	Given a Message, ability to analyse 
	and respond	Happy or Sad Mood
	*/

    public String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
			return "HAPPY";
        }
    }

    public static void main(String[] args) {
		String mood1 = "I am in a Happy mood.";
		String mood2 = "I am in a Sad mood.";
		int chance = (int)(Math.random()*2);
		String mood = chance == 1 ? mood1 : mood2;

		MoodAnalyser moodAnalyser = new MoodAnalyser();
		System.out.println(moodAnalyser.analyseMood(mood));
    }
}
