public class JackOLantern
{
    String[][] faceFeatures;

    JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
        toString();
    }

    public void edit(String replace, int row, int column)
    {
        this.faceFeatures[row][column] = replace;
    }

    public String toString()
    {
        String pumpkin = "";
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            for(int j = 0; j < this.faceFeatures[i].length; j++)
            {
                pumpkin = pumpkin + this.faceFeatures[i][j];
            }
            pumpkin = pumpkin + "\n";
        }
        return pumpkin;
    }

    public void fill(String str)
    {
        for(int i = 0; i < this.faceFeatures.length; i++)
        {
            for(int j = 0; j < this.faceFeatures[i].length; j++)
            {
                this.faceFeatures[i][j] = str;
            }
        }
    }
}
