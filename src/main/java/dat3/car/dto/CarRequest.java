package dat3.car.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dat3.car.entity.Car;
import dat3.car.entity.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarRequest {

    String brand;
    String model;
    double pricePrDay;
    Integer bestDiscount;

    public static Car getCarEntity(CarRequest c){
        return new Car(c.brand,c.model,c.pricePrDay, c.bestDiscount);
    }

    public CarRequest(Car c){
        this.brand=c.getBrand();
        this.model=c.getModel();
        this.pricePrDay=c.getPricePrDay();
        this.bestDiscount=c.getBestDiscount();
    }



}
