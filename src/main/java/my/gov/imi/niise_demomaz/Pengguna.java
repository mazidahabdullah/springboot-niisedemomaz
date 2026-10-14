package my.gov.imi.niise_demomaz;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pengguna") // Names the SQLite database table
public class Pengguna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Handles auto-increment for SQLite
    private int id;

    @Column(name = "nama", length = 255, nullable = false)
    private String fullname;

    @Column(name = "icno", length = 255, nullable = false, unique = true)
    private String icno;

    @Column(name = "hashPassword", length = 255, nullable = false, unique = true)
    private String icno;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String icno;

    // Default no-argument constructor (Required by JPA)
    public Pengguna() {
    }

    // Convenience constructor for creating new records
    public Pengguna(String nama, String icno, String hashPassword, String email ) {
        this.fullname = nama;
        this.icno = icno;
        this.hashPassword = hashPassword;
        this.email = email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

     public String gethashPassword(String hashPassword) {
        return hashPassword;
    }

    public void sethashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
    
    public String getemail(String email) {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}