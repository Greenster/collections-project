package com.sqa.lg;

import java.util.*;

import org.testng.annotations.*;

public class CollectionsTest {

	@Test
	public void elementNotDuplicatedAndNotInOrderTest() {
		// HashSet

		String[] citiesOfCaliArray = new String[] { "San Francisco", "Daly City", "Chico", "Ontario", "Compton",
				"San Diego", "Laguna", "Palm Springs", "Los Angeles", "Santa Barbra" };
		HashSet<String> citiesOfCali = new HashSet<String>();
		citiesOfCali.addAll(Arrays.asList(citiesOfCaliArray));
		for (String city : citiesOfCali) {
			System.out.println(city);

		}

		// Uses Iterator and a little more complex
		for (Iterator iterator = citiesOfCali.iterator(); iterator.hasNext();) {
			String city = (String) iterator.next();
			System.out.println(city);
		}
	}

	@Test
	public void elementsConnectedInOrderTest() {
		// TreeMap
		/*
		 * String[] stateNames = new String[] { "Alaska", "Arkansas", "Arizona",
		 * "California", "Colorado", "Connecticut", "Delaware", "Florida",
		 * "Georgia", "Hawaii" }; String[] stateAbv = new String[] { "AK", "AR",
		 * "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI" };
		 * Arrays.sort(stateAbv); Arrays.sort(stateNames);
		 */

		TreeMap<String, String> stateAbvNames = new TreeMap<String, String>();
		stateAbvNames.put("AL", "Alaska");
		stateAbvNames.put("FL", "Florida");
		stateAbvNames.put("CA", "California");
		stateAbvNames.put("HI", "Hawaii");
		stateAbvNames.put("CO", "Colorado");
		for (String abv : stateAbvNames.keySet()) {
			System.out.println(abv + " : " + stateAbvNames.get(abv));
		}
		/*
		 * for (int i = 0; i < stateAbvNames.length; i++) {
		 * System.out.println(stateAbvNames[i] + " : " + stateAbvNames[i]); }
		 */

	}

	@Test
	public void elementsConnectedNotInOrderTest() {
		// HashMap
		String[] stockCompany = new String[] { "AAPL", "T", "TWX", "MSFT", "VS" };
		double[] stockPrice = new double[] { -2.25, -0.74, 1.77, -0.59, -0.44 };
		System.out.println();
		for (int i = 0; i < stockPrice.length; i++) {
			System.out.format("%d. + %s | Stock Price: $%.2f\n", i + 1, stockCompany[i], stockPrice[i]);

		}
	}

	@Test
	public void elementsInsertedBeginingAndEndTest() {
		// ArrayList
		String nflWinningTeamsArray[] = new String[] { "Buccaneers", "Colts", "Chargers", "Raiders", "Bengals",
				"Falcons", "Dolphins", "Chiefs", "Patriots", "Titans" };
		// System.out.println();
		ArrayList<String> nflWinningTeams = new ArrayList<String>();
		nflWinningTeams.addAll(Arrays.asList(nflWinningTeamsArray));
		Collections.reverse(nflWinningTeams);
		for (int i = 0, j = 10; i < nflWinningTeams.size(); i++, j--) {
			System.out.format("NFL Team Rank [%d]: %s\n", j, nflWinningTeams.get(i));
		}
	}

	@Test
	public void elementsNotDuplicatedInOrderTest() {
		// TreeSet
		String[] hurricanesList = new String[] { "Alex", "Bonnie", "Earl", "Hermine", "Julia", "Lisa", "Matthew",
				"Nicole", "Virginie", "Karl" };
		for (int i = 0; i < hurricanesList.length; i++) {
			System.out.println("Hurricanes of 2016: " + hurricanesList[i]);
		}
	}

	@Test
	public void elementsRemovedAndAddedInMiddleTest() {
		// LinkedList
		String[] topMovies = new String[] { "Boo!, A Madea Halloween", "Jack Reacher", "Ouija", "The Accoutant",
				"The Girl The Train", "Miss Peregrine's Home", "Keeping Up With The Joneses", "Kevin Hart", "Storks",
				"Deepwater Horizon" };
		for (int i = 0; i < topMovies.length; i++) {
			System.out.println("The top Movies of 2016: " + topMovies[i]);
		}
	}

}
