package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Clock2: ImageVector
    get() {
        if (_clock2 != null) return _clock2!!
        _clock2 = tablerOutlineIcon(
            name = "Clock2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 4.448 4.448 4 5 4h14c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14C4.448 20 4 19.552 4 19v-14")
            addPathData("M12 7v5l3 3")
            addPathData("M4 12h1")
            addPathData("M19 12h1")
            addPathData("M12 19v1")
        }
        return _clock2!!
    }

private var _clock2: ImageVector? = null
