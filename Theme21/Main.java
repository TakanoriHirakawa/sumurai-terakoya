package review.kadai21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	final static String STR = "Alice was beginning to get very tired of sitting by "
			+ "her sister on the bank, and of having nothing to do: once or "
			+ "twice she had peeped into the book her sister was reading, but "
			+ "it had no pictures or conversations in it, and what is the use "
			+ "of a book,\' thought Alice without pictures or conversation?'\n"
			+ "So she was considering in her own mind (as well as she could, "
			+ "for the hot day made her feel very sleepy and stupid), whether "
			+ "the pleasure of making a daisy-chain would be worth the trouble "
			+ "of getting up and picking the daisies, when suddenly a White "
			+ "Rabbit with pink eyes ran close by her.\nThere was nothing so "
			+ "very remarkable in that; nor did Alice think it so very much "
			+ "out of the way to hear the Rabbit say to itself, `Oh dear! "
			+ "Oh dear! I shall be late!' (when she thought it over afterwards, "
			+ "it occurred to her that she ought to have wondered at this, but "
			+ "at the time it all seemed quite natural); but when the Rabbit "
			+ "actually took a watch out of its waistcoat-pocket, and looked "
			+ "at it, and then hurried on, Alice started to her feet, for it "
			+ "flashed across her mind that she had never before seen a rabbit "
			+ "with either a waistcoat-pocket, or a watch to take out of it, "
			+ "and burning with curiosity, she ran across the field after it, "
			+ "and fortunately was just in time to see it pop down a large "
			+ "rabbit-hole under the hedge.";

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String[] splitList = STR.split("[.,:\\!?()\n\s]");

		for (String word : splitList) {
			words.add(word);
		}

		CharacterCountFilterFunction ccff = (list, y) -> list.stream().filter(x -> x.length() >= y)
				.collect(Collectors.toList());

		System.out.println("上記文章中に10文字以上の単語は、" + ccff.call(words, 10).size() + "個あります。");
		System.out.println("*************************************");

		for (String splitWord : ccff.call(words, 10)) {
			System.out.println(splitWord + "：文字数：" + splitWord.length());
		}
	}

}
