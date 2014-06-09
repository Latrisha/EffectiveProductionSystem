package effectiveproductionsystem;

import java.util.ArrayList;
import java.util.List;

class RequestPart
{
    private Instrument instrument;
    private int time;
    private int startTime = 0;
    
    public RequestPart(Instrument inst, int time)
    {
        this.instrument = inst;
        this.time = time;
    }
    
    public Instrument getInstrument()
    {
        return this.instrument;
    }
    
    public int getTime()
    {
        return this.time;
    }
    
    public int getStartTime()
    {
        return this.startTime;
    }
    
    public void setStartTime(int time)
    {
        this.startTime = time;
    }
}

class Instrument
{
    private String name;
    private int count;
    
    public Instrument(String name, int count)
    {
        this.name = name;
        this.count = count;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getCount()
    {
        return this.count;
    }
            
}


class Request
{
    private List<RequestPart> parts = new ArrayList<RequestPart>();
    
    public void addPart(Instrument instrument, int time)
    {
        parts.add(new RequestPart(instrument, time));
        
    }
    
    public List getParts()
    {
        return parts;
    }
    
    
}

public class EffectiveProductionSystem
{
    private List<Request> requests = new ArrayList<Request>();
    private List<Instrument> instruments = new ArrayList<Instrument>();
    
    public static void main(String[] args) 
    {
        
    }
    
    public void save()
    {
        
    }
    
    public void load()
    {
        
    }
    
    public void processRequests()
    {
        
    }
    
}