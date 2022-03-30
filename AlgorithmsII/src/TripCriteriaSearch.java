/*
 * 3. Searching for all trips with a given arrival time, returning full details of all trips matching the
criteria (zero, one or more), sorted by trip id
Arrival time should be provided by the user as hh:mm:ss. When reading in stop_times.txt file you
will need to remove all invalid times, e.g., there are times in the file that start at 27/28 hours, so are
clearly invalid. Maximum time allowed is 23:59:59. 
 */

import java.sql.Time;

public class TripCriteriaSearch {

	protected class TripInfo{
		
		protected int trip_id;
		protected Time arrival_time;
		protected Time departure_time;
		protected int stop_id;
		protected int stop_sequence;
		protected String stop_headsign;
		protected int pickup_type;
		protected int drop_off_type;
		protected double shape_dist_traveled;
		
		protected TripInfo(int trip_id, Time arrival_time, Time departure_time, int stop_id, int stop_sequence,
				String stop_headsign, int pickup_type, int drop_off_type, double shape_dist_traveled) {
			this.trip_id = trip_id;
			this.arrival_time = arrival_time;
			this.departure_time = departure_time;
			this.stop_id = stop_id;
			this.stop_sequence = stop_sequence;
			this.stop_headsign = stop_headsign;
			this.pickup_type = pickup_type;
			this.drop_off_type = drop_off_type;
			this.shape_dist_traveled = shape_dist_traveled;
	}
}
}