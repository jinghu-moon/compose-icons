package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedLetterC: ImageVector
    get() {
        if (_squareRoundedLetterC != null) return _squareRoundedLetterC!!
        _squareRoundedLetterC = tablerOutlineIcon(
            name = "SquareRoundedLetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10C14 8.895 13.105 8 12 8c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
        }
        return _squareRoundedLetterC!!
    }

private var _squareRoundedLetterC: ImageVector? = null
