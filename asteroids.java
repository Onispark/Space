public class asteroids {

    
    double distance;
    double angle;
    double diameter;
    java.lang.String col;
    double centreOfRotationDistance;
    double centreOfRotationAngle;

public asteroids(double dist, double ang, double diameter, java.lang.String col, double R_dist, double R_ang)
{

    this.distance = dist;
    this.angle = ang;
    this.diameter = diameter;
    this.col = col;
    this.centreOfRotationDistance = R_dist;
    this.centreOfRotationAngle = R_ang;

}

double getDistance(){
    return distance;
}
double getAngle(){
    return angle;
}
double getDiameter(){
    return diameter;
}
double getcORA(){
    return centreOfRotationAngle;
}
double getcORD(){
    return centreOfRotationDistance;
}

public void setDistance(double distance){
    this.distance = distance;
}

public void setAngle(double angle){
    this.angle = angle;

}

public void setDiameter(double diameter){
    this.diameter = diameter;
}

public void setcORA(double centreOfRotationAngle){
    this.centreOfRotationAngle = centreOfRotationAngle;

}

public void setcORD(double centreOfRotationDistance){
    this.centreOfRotationDistance = centreOfRotationDistance;
}


    
}
