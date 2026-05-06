package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bible: ImageVector
    get() {
        if (_bible != null) return _bible!!
        _bible = tablerOutlineIcon(
            name = "Bible",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4v16h-12C5.895 20 5 19.105 5 18v-12C5 4.895 5.895 4 7 4h12")
            addPathData("M19 16h-12c-1.105 0-2 .895-2 2")
            addPathData("M12 7v6")
            addPathData("M10 9h4")
        }
        return _bible!!
    }

private var _bible: ImageVector? = null
