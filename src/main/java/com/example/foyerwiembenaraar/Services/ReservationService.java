package com.example.foyerwiembenaraar.Services;

import com.example.foyerwiembenaraar.DAO.Entities.Chambre;
import com.example.foyerwiembenaraar.DAO.Entities.Etudiant;
import com.example.foyerwiembenaraar.DAO.Entities.Reservation;
import com.example.foyerwiembenaraar.DAO.Entities.TypeChambre;
import com.example.foyerwiembenaraar.DAO.Repositories.ChambreRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.EtudiantRepository;
import com.example.foyerwiembenaraar.DAO.Repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Builder
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
    ChambreRepository chambreRepository;


    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public Reservation editReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteById(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public void delete(Reservation r) {
        reservationRepository.delete(r);
    }

    @Override
    public Reservation ajouterReservationEtAssignerAChambreEtAEtudiant(int numChambre, long cin) {
        LocalDate dateDebutAU;
        LocalDate dateFinAU;
        int i=0;
        int numReservation;
        int year = LocalDate.now().getYear() % 100;
        if (LocalDate.now().getMonthValue() <= 7) {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + (year - 1)), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + year), 6, 30);
        } else {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + year), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + (year + 1)), 6, 30);
        }

        Etudiant e = etudiantRepository.findEtudiantByCin(cin);
       Chambre c=new Chambre();
        boolean test=false;
        if (e !=null){
            c=chambreRepository.findByNumeroChambre(numChambre);


           Set<Reservation>reservations= c.getReservations();

                  i=(int) reservations.stream().filter(Reservation::getEstValide).count();
         if (c.getTypeChambre().equals(TypeChambre.SIMPLE)&&i==0){
             test=true;
         } else if (c.getTypeChambre().equals(TypeChambre.DOUBLE)&&i<=1) {
             test=true;
         }
         else if (c.getTypeChambre().equals(TypeChambre.TRIPLE)&&i<=2){
             test=true;
         }
        }
        if(!test) {
            return new Reservation();
        }else{
            Reservation r=new Reservation();
            r.setIdReservation(dateDebutAU.getYear()+"/"+dateFinAU.getYear()+"-"+c.getBloc().getNomBloc()+"-"+c.getNumeroChambre()+"-"+e.getCin());
            r.setAnneeReservation(new Date());
            r.setEstValide(true);

            //chambre geta il parent
            c.getReservations().add(r);
            chambreRepository.save(c);
            //reservation heya parent w etudiant child
            r.getEtudiants().add(e);

            return reservationRepository.save(r);
        }



    }


}
