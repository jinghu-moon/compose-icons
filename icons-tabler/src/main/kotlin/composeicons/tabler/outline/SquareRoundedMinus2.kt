package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedMinus2: ImageVector
    get() {
        if (_squareRoundedMinus2 != null) return _squareRoundedMinus2!!
        _squareRoundedMinus2 = tablerOutlineIcon(
            name = "SquareRoundedMinus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21c-.18 .002-.314 0-.5 0C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3c7.2 0 9 1.8 9 9 0 1.136-.046 2.138-.152 3.02")
            addPathData("M16 19h6")
        }
        return _squareRoundedMinus2!!
    }

private var _squareRoundedMinus2: ImageVector? = null
