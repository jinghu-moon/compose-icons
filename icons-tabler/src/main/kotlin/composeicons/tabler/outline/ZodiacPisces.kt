package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacPisces: ImageVector
    get() {
        if (_zodiacPisces != null) return _zodiacPisces!!
        _zodiacPisces = tablerOutlineIcon(
            name = "ZodiacPisces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3C7.702 8.696 7.702 15.304 5 21")
            addPathData("M19 3c-2.702 5.696-2.702 12.304 0 18")
            addPathData("M5 12h14")
        }
        return _zodiacPisces!!
    }

private var _zodiacPisces: ImageVector? = null
