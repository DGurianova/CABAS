package gud.template.persistance.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "area")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id")
    private int areaId;
    @Column(name = "area_name")
    private String areaName;
    @Column(name = "area_code")
    private String areaCode;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private List<City> cityIds;
    @Column(name = "severity_type")
    private Severity severity;

}

