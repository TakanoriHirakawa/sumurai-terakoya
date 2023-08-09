package review.kadai20;

import java.time.MonthDay;

public enum Constellation {
	Aries("牡羊座", MonthDay.of(3, 21), MonthDay.of(4, 19)), Taurus("牡牛座", MonthDay.of(4, 20), MonthDay.of(5, 20)), Gemini(
			"双子座", MonthDay.of(5, 21), MonthDay.of(6, 21)), Cancer("蟹座", MonthDay.of(6, 22), MonthDay.of(7, 22)), Leo(
					"獅子座", MonthDay.of(7, 23), MonthDay.of(8, 22)), Virgo("乙女座", MonthDay.of(8, 23),
							MonthDay.of(9, 22)), Libra("天秤座", MonthDay.of(9, 23), MonthDay.of(10, 23)), Scorpio("蠍座",
									MonthDay.of(10, 24), MonthDay.of(11, 22)), Sagittarius("射手座", MonthDay.of(11, 23),
											MonthDay.of(12, 21)), Capricorn("山羊座", MonthDay.of(12, 22),
													MonthDay.of(1, 19)), Aquarius("水瓶座", MonthDay.of(1, 20),
															MonthDay.of(2, 18)), Pisces("魚座", MonthDay.of(2, 19),
																	MonthDay.of(3, 20));

	private String sing;
	private MonthDay sDate;
	private MonthDay eDate;

	private Constellation(String sing, MonthDay sDate, MonthDay eDate) {
		this.sing = sing;
		this.sDate = sDate;
		this.eDate = eDate;
	}

	public String getSing() {
		return sing;
	}

	public MonthDay getsDate() {
		return sDate;
	}

	public MonthDay geteDate() {
		return eDate;
	}

	public static Constellation getType(MonthDay birthDay) {
		if (MonthDay.of(3, 20).isBefore(birthDay) && MonthDay.of(4, 20).isAfter(birthDay)) {
			return Aries;
		}else if(MonthDay.of(4, 19).isBefore(birthDay) && MonthDay.of(5, 21).isAfter(birthDay)) {
			return Taurus;
		}else if(MonthDay.of(5, 20).isBefore(birthDay) && MonthDay.of(6, 22).isAfter(birthDay)) {
			return Gemini;
		}else if(MonthDay.of(6, 21).isBefore(birthDay) && MonthDay.of(7, 23).isAfter(birthDay)) {
			return Cancer;
		}else if(MonthDay.of(7, 22).isBefore(birthDay) && MonthDay.of(8, 23).isAfter(birthDay)) {
			return Leo;
		}else if(MonthDay.of(8, 22).isBefore(birthDay) && MonthDay.of(9, 23).isAfter(birthDay)) {
			return Virgo;
		}else if(MonthDay.of(9, 22).isBefore(birthDay) && MonthDay.of(10, 24).isAfter(birthDay)) {
			return Libra;	
		}else if(MonthDay.of(10, 23).isBefore(birthDay) && MonthDay.of(11, 23).isAfter(birthDay)) {
			return Scorpio;
		}else if(MonthDay.of(11, 22).isBefore(birthDay) && MonthDay.of(12, 22).isAfter(birthDay)) {
			return Sagittarius;
		}else if(MonthDay.of(12, 22).isBefore(birthDay) && (MonthDay.of(12, 31).isAfter(birthDay)||(MonthDay.of(12, 31).equals(birthDay)))) {
			return Capricorn;
		}else if((MonthDay.of(1,1).isBefore(birthDay)||MonthDay.of(1, 1).equals(birthDay)) && MonthDay.of(1, 20).isAfter(birthDay)) {
				return Capricorn;
		}else if(MonthDay.of(1, 19).isBefore(birthDay) && MonthDay.of(2,19).isAfter(birthDay)) {
			return Aquarius;
		}else if(MonthDay.of(2, 18).isBefore(birthDay) && MonthDay.of(3,21).isAfter(birthDay)) {
			return Pisces;
		}
		return null;
	}
}
