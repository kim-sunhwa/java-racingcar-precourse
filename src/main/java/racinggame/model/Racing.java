package racinggame.model;

import static racinggame.commons.response.RacingCode.*;

import nextstep.utils.Randoms;

public class Racing {
	public static final boolean BOOLEAN = true;
	private int distance;

	Racing() {
		this.distance = CAR_MOVE_RANGE_MIN;
	}

	void isForward() {
		if (isMoved() > STOP_NUMBER) {
			this.distance += MOVE_FORWARD;
		}
	}

	private int isMoved() {
		while (BOOLEAN) {
			int number = getNumber();
			if (number < CAR_MOVE_RANGE_MIN || number > CAR_MOVE_RANGE_MAX) {
				continue;
			}
			return number;
		}
	}

	private int getNumber() {
		return Randoms.pickNumberInRange(CAR_MOVE_RANGE_MIN, CAR_MOVE_RANGE_MAX);
	}

	int getDistance() {
		return distance;
	}
}
