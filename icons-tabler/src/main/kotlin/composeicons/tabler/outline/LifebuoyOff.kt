package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LifebuoyOff: ImageVector
    get() {
        if (_lifebuoyOff != null) return _lifebuoyOff!!
        _lifebuoyOff = tablerOutlineIcon(
            name = "LifebuoyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.171 9.172c-1.534 1.565-1.523 4.074 .025 5.625 1.548 1.552 4.056 1.568 5.625 .038M16 12C16 9.791 14.209 8 12 8")
            addPathData("M5.64 5.632C3.336 7.9 2.425 11.229 3.254 14.354c.829 3.125 3.27 5.565 6.395 6.393 3.125 .828 6.454-.084 8.721-2.389M20.037 16.056C21.79 12.589 21.12 8.388 18.375 5.638 15.63 2.888 11.431 2.21 7.96 3.956")
            addPathData("M15 15l3.35 3.35")
            addPathData("M9 15 5.65 18.35")
            addPathData("M5.65 5.65 9 9")
            addPathData("M18.35 5.65 15 9")
            addPathData("M3 3 21 21")
        }
        return _lifebuoyOff!!
    }

private var _lifebuoyOff: ImageVector? = null
