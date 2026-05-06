package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NorthStar: ImageVector
    get() {
        if (_northStar != null) return _northStar!!
        _northStar = tablerOutlineIcon(
            name = "NorthStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h18")
            addPathData("M12 21v-18")
            addPathData("M7.5 7.5l9 9")
            addPathData("M7.5 16.5l9-9")
        }
        return _northStar!!
    }

private var _northStar: ImageVector? = null
