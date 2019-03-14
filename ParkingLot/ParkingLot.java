import java.util.*;
class ParkingLot{
    HashMap<Spot, Vehicle> hmap = new HashMap();
    Stack<Long> small;
    Stack<Long> medium;
    Stack<Long> large; 
    ParkingLot(int size){
        small = new Stack();
        medium = new Stack();
        large = new Stack();
        int i = 0;
        while(i++ < size){
            small.push((long)i);
            medium.push((long)i);
            large.push((long)i);
        }
    }

    Spot placeSmallCar(Vehicle car){
        if(!small.isEmpty()){
            Spot spot = new Small(small.pop(), false);
            hmap.put(spot, car);
            return spot;
        }else{
            return placeMediumCar(car);
        }
    }
    Spot placeMediumCar(Vehicle car){
        if(!medium.isEmpty()){
            Spot spot = new Medium(medium.pop(), false);
            hmap.put(spot, car);
            return spot;
        }else{
            return placeLargeCar(car);
        }
    }
     Spot placeLargeCar(Vehicle car){
        if(!large.isEmpty()){
            Spot spot = new Large(large.pop(), false);
            hmap.put(spot, car);
            return spot;
        }else{
           System.out.println("No car parking availble");
           return null;
        }
    }

    Vehicle removeVehicle(Spot spot){
        Vehicle vehicle = hmap.get(spot);
        hmap.remove(spot);
        SIZE s = spot.getSIZE();
        if(s==SIZE.S){
            small.push(spot.getId());
        }else if(s==SIZE.M){
            medium.push(spot.getId());
        }else{
            large.push(spot.getId());
        }
        return vehicle;

    }

    public static void main(String[] args){
        ParkingLot lot = new ParkingLot(20);
        Scanner scan = new Scanner(System.in);
        ArrayList<Spot> vehicle_store = new ArrayList();
        while(true){
            System.out.println("1 : To park the vehicle \n  2. To remove the vehicle");
            int i = scan.nextInt();
            if(i==1){
                String s = scan.next();
                if(s.equals("S")){
                    Vehicle vehicle = new Car(scan.next(), SIZE.S);
                    vehicle_store.add(lot.placeSmallCar(vehicle));
                }else if(s.equals("M")){
                    Vehicle vehicle = new Truck(scan.next(), SIZE.M);
                    vehicle_store.add(lot.placeMediumCar(vehicle));
                }else{
                    Vehicle vehicle = new Bus(scan.next(), SIZE.L);
                    vehicle_store.add(lot.placeLargeCar(vehicle));
                }
            }else{
                int j = scan.nextInt();
                System.out.println(lot.removeVehicle(vehicle_store.get(j)));
                vehicle_store.remove(vehicle_store.get(j));
            }
            System.out.println(lot.hmap);
            if(1==5){
                break;
            }
        }
    }
}