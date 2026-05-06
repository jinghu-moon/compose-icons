package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampRight2: ImageVector
    get() {
        if (_arrowRampRight2 != null) return _arrowRampRight2!!
        _arrowRampRight2 = tablerOutlineIcon(
            name = "ArrowRampRight2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3v8.707")
            addPathData("M16 14l4-4L16 6")
            addPathData("M6 21C6 14.925 10.925 10 17 10h3")
        }
        return _arrowRampRight2!!
    }

private var _arrowRampRight2: ImageVector? = null
