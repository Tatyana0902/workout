package tinkoff.task5;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static final Comparator<TeamResult> TEAM_RESULT_COMPARATOR = (r1, r2) -> {
        if (r1.servers != r2.servers) {
            return -1;
        }
        if (r1.time != r2.time) {
            return r1.time - r2.time;
        }
        return r1.team.compareTo(r2.team);
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalTime start = LocalTime.parse(scan.nextLine());
        Map<String, Map<String, List<Attempt>>> teamServerAttempts = new HashMap<>();

        SortedSet<TeamResult> teamResults = new TreeSet<>(TEAM_RESULT_COMPARATOR);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String[] split = line.split("\"");
            String team = split[1];
            String ostatok = split[2];
            Scanner scan2 = new Scanner(ostatok);
            LocalTime time = LocalTime.parse(scan2.next());
            String server = scan2.next();
            Status status = Status.valueOf(scan2.next());

            Attempt attempt = new Attempt(status, time);
            Map<String, List<Attempt>> serverAttempts = teamServerAttempts.computeIfAbsent(team, x -> new HashMap<>());
            List<Attempt> attempts = serverAttempts.computeIfAbsent(server, x -> new ArrayList<>());
            attempts.add(attempt);
        }

        for (String team : teamServerAttempts.keySet()) {
            int c = 0;
            int t = 0;
            for (String server : teamServerAttempts.get(team).keySet()) {
                List<Attempt> attempts = teamServerAttempts.get(team).get(server);
                if (attempts.get(attempts.size() - 1).status == Status.ACCESSED) {
                    c++;
                    for (Attempt attempt : attempts) {
                        if (attempt.status == Status.FORBIDEN || attempt.status == Status.DENIED) {
                            t += 20;
                        } else if (attempt.status == Status.ACCESSED) {
                            int duration = (int) Duration.between(start, attempt.time).toMinutes();
                            if (duration < 0) {
                                duration += 24 * 60;
                            }
                            t += duration;
                        }
                    }
                }
            }
            teamResults.add(new TeamResult(team, c, t));
        }

        int place = 0;
        boolean isFirst = true;
        if (teamResults.isEmpty()) {
            return;
        }

        TeamResult best = teamResults.iterator().next();

        for (TeamResult teamResult : teamResults) {
            place++;
            if (teamResult.servers != best.servers || teamResult.time != best.time) {
                isFirst = false;
            }
            if (isFirst) {
                System.out.println("1 \"" + teamResult.team + "\" " + teamResult.servers + " " + teamResult.time);
            } else {
                System.out.println(place + " \"" + teamResult.team + "\" " + teamResult.servers + " " + teamResult.time);
            }
        }
    }

    static class TeamResult implements Comparable<TeamResult> {
        String team;
        int servers;
        int time;

        public TeamResult(String team, int servers, int time) {
            this.team = team;
            this.servers = servers;
            this.time = time;
        }

        @Override
        public int compareTo(TeamResult o) {
            return 0;
        }
    }

    enum Status {
        PONG,
        ACCESSED,
        DENIED,
        FORBIDEN
    }

    static class Attempt {
        Status status;
        LocalTime time;

        public Attempt(Status status, LocalTime time) {
            this.status = status;
            this.time = time;
        }
    }
}
