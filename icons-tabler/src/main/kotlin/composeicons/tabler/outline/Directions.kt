package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Directions: ImageVector
    get() {
        if (_directions != null) return _directions!!
        _directions = tablerOutlineIcon(
            name = "Directions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21v-4")
            addPathData("M12 13v-4")
            addPathData("M12 5v-2")
            addPathData("M10 21h4")
            addPathData("M8 5v4h11L21 7 19 5h-11")
            addPathData("M14 13v4h-8L4 15 6 13h8")
        }
        return _directions!!
    }

private var _directions: ImageVector? = null
