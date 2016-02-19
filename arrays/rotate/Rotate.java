package arrays.rotate;

/**
 * Q: Rotate a pixel array by 90 degrees (clockwise).
 * @author igorpogorelskiy
 */
public class Rotate {
	
	private int[][] pixels;
	private int N;
	
	/**
	 * Constructor: stores the pixel array in the object. 
	 * We assume we are passed an N x N array.
	 * @param pixels the pixel array (picture to rotate)
	 */
	public Rotate(int[][] pixels) {
		if (pixels.length != pixels[0].length) {
			throw new IllegalArgumentException("Picture must be a square!");
		}
		this.pixels = pixels;
		this.N = pixels[0].length;
	}
	
	/**
	 * Rotate the objects pixel array clockwise by 90 degrees.
	 * Solution: We must rotate through the layers
	 * For each layer, we must swap the current corners into their respective 
	 * spaces. Once we finish swapping the first half of the layers, we are done.
	 * Algorithmic outline of swapping:
	 * temp   <- top
	 * top    <- left
	 * left   <- bottom
	 * bottom <- right
	 * right  <- temp
	 */
	public void rotateClockwise90() {
		for (int lyr = 0; lyr < N/2; lyr++) {
			int end = N - 1 - lyr;
			for (int i = lyr; i < end; i++) {
				
				// we need an offset to find the correct position of pixel 
				// to switch out with along row/col
				int offset = i - lyr; 
				
				// store the top
				int top = pixels[lyr][i];
				
				// top <- left
				pixels[lyr][i] = pixels[end - offset][lyr];
				
				// left <- bottom
				pixels[end - offset][lyr] = pixels[end][end - offset];
				
				// bottom <- right
				pixels[end][end - offset] = pixels[i][end];
				
				// right <- temp (top)
				pixels[i][end] = top;
			}
		}
	}
}
