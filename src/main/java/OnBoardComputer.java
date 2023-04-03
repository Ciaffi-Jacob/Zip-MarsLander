public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if(status.getAltitude() > 5501){
            burn = 100;
        } else if (status.getVelocity() > 100) {
            burn = 200;
        } else if (status.getAltitude() > 100) {
            burn = 100;
        } else if (status.getVelocity() == 100) {
            burn = 201 - status.getAltitude();
        }
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
