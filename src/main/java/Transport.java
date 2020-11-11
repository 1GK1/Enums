
    public enum Transport{
        CAR(200),
        TIR(110),
        PLANE(900),
        TRAIN(250),
        SHIP(40),
        SPACESHIP(20000);

        private int speed;

        Transport(int speed) {
            this.speed = speed;
        }

        public int getSpeed(){
            return speed;
        }

    }








