package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedLetterN: ImageVector
    get() {
        if (_squareRoundedLetterN != null) return _squareRoundedLetterN!!
        _squareRoundedLetterN = tablerOutlineIcon(
            name = "SquareRoundedLetterN",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-8l4 8v-8")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedLetterN!!
    }

private var _squareRoundedLetterN: ImageVector? = null
