import org.junit.Test

import static org.junit.Assert.*

class BoardConfigurationTests {

	@Test
	void shouldParseHeader() {
		BoardConfiguration config = new BoardConfiguration("3 2")
		assertEquals 3, config.height
		assertEquals 2, config.width
	}
	
	@Test
	void shouldDetectLastBoard() {
		BoardConfiguration config = new BoardConfiguration("0 0")
		assertTrue config.lastBoard()
	}
	
	@Test
	void shouldDetectValidPlaces() {
		BoardConfiguration config = new BoardConfiguration("3 2")
		assertTrue config.valid(0, 0)
		assertTrue config.valid(1, 1)
		assertFalse config.valid(3, 2)
	}
}