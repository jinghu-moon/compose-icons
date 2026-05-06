package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedLetterR: ImageVector
    get() {
        if (_squareRoundedLetterR != null) return _squareRoundedLetterR!!
        _squareRoundedLetterR = tablerOutlineIcon(
            name = "SquareRoundedLetterR",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h2c1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8h-2v8M14 16 11 12")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedLetterR!!
    }

private var _squareRoundedLetterR: ImageVector? = null
