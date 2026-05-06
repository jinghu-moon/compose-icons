package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number: ImageVector
    get() {
        if (_number != null) return _number!!
        _number = tablerOutlineIcon(
            name = "Number",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17v-10l7 10v-10")
            addPathData("M15 17h5")
            addPathData("M15 10c0 1.657 1.119 3 2.5 3C18.881 13 20 11.657 20 10 20 8.343 18.881 7 17.5 7 16.119 7 15 8.343 15 10")
        }
        return _number!!
    }

private var _number: ImageVector? = null
