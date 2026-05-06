package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacAquarius: ImageVector
    get() {
        if (_zodiacAquarius != null) return _zodiacAquarius!!
        _zodiacAquarius = tablerOutlineIcon(
            name = "ZodiacAquarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10 6 7l3 3L12 7l3 3L18 7l3 3")
            addPathData("M3 17 6 14l3 3 3-3 3 3 3-3 3 3")
        }
        return _zodiacAquarius!!
    }

private var _zodiacAquarius: ImageVector? = null
