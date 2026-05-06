package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampLeft2: ImageVector
    get() {
        if (_arrowRampLeft2 != null) return _arrowRampLeft2!!
        _arrowRampLeft2 = tablerOutlineIcon(
            name = "ArrowRampLeft2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 3v8.707")
            addPathData("M8 14 4 10 8 6")
            addPathData("M18 21C18 14.925 13.075 10 7 10h-3")
        }
        return _arrowRampLeft2!!
    }

private var _arrowRampLeft2: ImageVector? = null
