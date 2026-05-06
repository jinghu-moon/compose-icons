package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = tablerOutlineIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11 18h7c1.105 0 2-.895 2-2v-7C20 7.895 19.105 7 18 7h-9.5C5.462 7 3 9.462 3 12.5v3.5c0 1.105 .895 2 2 2h2")
            addPathData("M8 7 15 4l1 3")
            addPathData("M13 11.5c0-.276 .224-.5 .5-.5h2c.276 0 .5 .224 .5 .5v2c0 .276-.224 .5-.5 .5h-2C13.224 14 13 13.776 13 13.5v-2")
            addPathData("M20 16h2")
        }
        return _caravan!!
    }

private var _caravan: ImageVector? = null
