package service;

import java.time.LocalDate;
import java.util.Date;

public class RaceService {
    private LocalDate raceDate;

    private HorseService horseService;


  public static RaceService getInstance(){
      RaceService race=new RaceService();
      race.setRaceDate(LocalDate.now());
      race.setHorseService(new HorseService());
      return race;
  }
    RaceService(){}


    public RaceService(LocalDate raceDate, HorseService horseService) {
        this.raceDate = raceDate;
        this.horseService = horseService;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }

    public RaceService getRace(){
        return new RaceService();
    }

    @Override
    public String toString() {
        return "RaceService{" +
                "raceDate=" + raceDate +
                ", horseService=" + horseService +
                '}';
    }

    public LocalDate getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(LocalDate raceDate) {
        this.raceDate = raceDate;
    }
}
