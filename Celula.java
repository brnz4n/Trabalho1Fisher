package javaLar;

import java.util.ArrayList;

public class Celula {
	private int id;
	private int x;
    private int y;
    private boolean bug;
    private boolean devs;
    private ArrayList<Planeta> Planetas;
    private boolean celulavisitada;
    
    public Celula(int x, int y,int id) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.bug = false;
        this.devs = false;
        this.celulavisitada = false;
        this.Planetas = new ArrayList<Planeta>();
        
    }
    public void addPlaneta(Planeta Planetas) {
    	this.Planetas.add(Planetas);
    	this.celulavisitada = true;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

	public boolean isBug() {
		return bug;
	}

	public boolean isDevs() {
		return devs;
	}

	public void setDevs(boolean devs) {
		this.devs = devs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
    public boolean getBug() {
    	return bug;
    }
    public void setBug(boolean bug) {
    	this.bug = bug;
    }
    public boolean getDevs() {
    	return devs;
    }
    public boolean celulavisitada() {
    	return this.celulavisitada;
    }
    public void removeBugeDevs(){
    	this.bug = false;
    	this.devs = false;
    }
    public ArrayList<Planeta> getPlanetas(){
    	return Planetas;
    }
}
