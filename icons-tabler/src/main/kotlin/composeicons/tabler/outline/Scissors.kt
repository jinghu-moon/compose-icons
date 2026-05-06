package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = tablerOutlineIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7c0 1.657 1.343 3 3 3C7.657 10 9 8.657 9 7 9 5.343 7.657 4 6 4 4.343 4 3 5.343 3 7")
            addPathData("M3 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 15.343 7.657 14 6 14 4.343 14 3 15.343 3 17")
            addPathData("M8.6 8.6 19 19")
            addPathData("M8.6 15.4 19 5")
        }
        return _scissors!!
    }

private var _scissors: ImageVector? = null
