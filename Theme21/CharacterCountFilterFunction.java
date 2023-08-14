package review.kadai21;

import java.util.List;

@FunctionalInterface
public interface CharacterCountFilterFunction {
	List<String> call(List<String> words, int wordCount);
}
