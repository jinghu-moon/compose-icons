package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallBasketball: ImageVector
    get() {
        if (_ballBasketball != null) return _ballBasketball!!
        _ballBasketball = tablerOutlineIcon(
            name = "BallBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M5.65 5.65 18.35 18.35")
            addPathData("M5.65 18.35 18.35 5.65")
            addPathData("M12 3c0 4.971 4.029 9 9 9")
            addPathData("M3 12c4.971 0 9 4.029 9 9")
        }
        return _ballBasketball!!
    }

private var _ballBasketball: ImageVector? = null
