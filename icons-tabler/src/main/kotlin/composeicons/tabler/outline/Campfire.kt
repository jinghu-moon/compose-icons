package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = tablerOutlineIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 21 20 17")
            addPathData("M20 21 4 17")
            addPathData("M12 15c2.209 0 4-1.791 4-4C16 8 14 8 14 3 10 5 8 8 8 11c0 2.209 1.791 4 4 4")
        }
        return _campfire!!
    }

private var _campfire: ImageVector? = null
