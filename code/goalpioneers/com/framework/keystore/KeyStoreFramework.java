package goalpioneers.com.framework.keystore;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class KeyStoreFramework 
        implements KeyStoreInterface
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     * @param element
     */
    @Override
    public void store( String key, 
                       KeyStoreElement element ) 
    {
        
    }
    
    
    /**
     * 
     * @param key
     * @return
     */
    @Override
    public KeyStoreElement retrieve( String key ) 
    {
        return null;
    }
    
    
    /**
     * 
     * @param key
     */
    @Override
    public void remove( String key ) 
    {
        
    }
    
    
    /**
     * 
     */
    @Override
    public void optimize() 
    {
        
    }
    
    
    /**
     * 
     */
    @Override
    public void garbageCollection() 
    {
        
    }
}
