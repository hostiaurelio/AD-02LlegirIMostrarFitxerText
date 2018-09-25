package losjuquers.AD02_MostraContingutFitxerText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Hello world!
 *
 */

public class ArturoPerezReverte 
{
    public static void main( String[] args ) throws IOException, FileNotFoundException
    {
    	FileInputStream input;
    	try {
    		input = new FileInputStream("C:/soll1povresenyor.txt");
    	}catch(FileNotFoundException e) {
    		throw new FileNotFoundException ("no");
    	}
    	
    	FileChannel channel = input.getChannel();
    	byte[] buffer = new byte[256 * 1024];
    	ByteBuffer byteBuffer = ByteBuffer.wrap(buffer);

    	try {
    	    for (int length = 0; (length = channel.read(byteBuffer)) != -1;) {
    	        System.out.write(buffer, 0, length);
    	        byteBuffer.clear();
    	    }
    	} finally {
    	    input.close();
    	}
    }
}
