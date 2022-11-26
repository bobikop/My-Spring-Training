package com.cydeo.repository;

import com.cydeo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name
    Optional<Cinema> findByName(String name);
//    List<Cinema> findByNameExists(String name);
//    List<Cinema> findByNameEquals(String name);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name
    List<Cinema> findFirst3BySponsoredNameContainingOrderBySponsoredName(String sponsoredName);
//  List<Cinema> findTop3ByNameContaining(String name);

    //Write a derived query to list all cinemas in a specific country
    List<Cinema> findCinemaByLocation_Country (String country);
    List<Cinema> findByLocation_PostalCode(String postalCode);


    //Write a derived query to list all cinemas with a specific name or sponsored name
    List<Cinema> findAllByNameOrSponsoredName(String name, String sponsoredName);
//  List<Cinema> findCinemaByNameContainsOrSponsoredNameContains(String str, String str2);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id

    @Query("SELECT c.name FROM Cinema c WHERE c.id = ?1")
    String fetchById(@Param("id") Long id);

//     @Query("SELECT c FROM Cinema c WHERE c.id = ?1" )
//     Cinema readCinemaWithSpecificId(Long id);


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country

    @Query(value = "SELECT * FROM cinema c JOIN location l " +
            "ON l.id = c.location_id WHERE l.country = ?1", nativeQuery = true)
    List<Cinema> retrieveAllBasedOnLocationCountry(@Param("locationCountry") String locationCountry);

//    @Query(value = "select * from cinema right join location l on l.country = ?1",nativeQuery = true)
//    List<Cinema> findByLocation(String location);


    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "SELECT * FROM cinema WHERE name ILIKE concat('%', ?1, '%') " +
            "OR sponsored_name ILIKE concat('%', ?1, '%')", nativeQuery = true)
    List<Cinema> retrieveAllByNameOrSponsoredName(@Param("pattern") String pattern);


//    @Query(value = "SELECT * FROM Cinema WHERE name = ?1 OR sponsored_name = ?1", nativeQuery = true)
//    List<Cinema> findBySponsoredName(String name);

    //Write a native query to sort all cinemas by name
    @Query( value = "select * from Cinema order by name ", nativeQuery = true)
    List<Cinema> sortedByName();

    //Write a native query to distinct all cinemas by sponsored name



    @Query(value = "select distinct sponsored_name from cinema", nativeQuery = true) //  Not sure if this is what the question is asking
    List<String> distinctSponsored();

}