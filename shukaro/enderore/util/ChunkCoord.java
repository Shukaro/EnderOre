package shukaro.enderore.util;

import java.io.Serializable;

public class ChunkCoord implements Serializable
{
    public int chunkX;
    public int chunkZ;
    
    public ChunkCoord(BlockCoord c)
    {
        this(c.x >> 4, c.z >> 4);
    }
    
    public ChunkCoord(int x, int z)
    {
        this.chunkX = x;
        this.chunkZ = z;
    }
    
    public boolean equals(ChunkCoord chunk)
    {
        return (chunk.chunkX == this.chunkX) && (chunk.chunkZ == this.chunkZ);
    }
    
    public boolean contains(BlockCoord c)
    {
    	return this.contains(c.x, c.z);
    }
    
    public boolean contains(int x, int z)
    {
    	return this.chunkX == (x >> 4) && this.chunkZ == (z >> 4);
    }
    
    public int getCenterX()
    {
        return (this.chunkX << 4) + 8;
    }
    
    public int getCenterZ()
    {
        return (this.chunkZ << 4) + 8;
    }
    
    @Override
    public String toString()
    {
        return "[" + this.chunkX + ", " + this.chunkZ + "]";
    }
}