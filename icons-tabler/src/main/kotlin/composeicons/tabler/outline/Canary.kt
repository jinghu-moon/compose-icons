package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Canary: ImageVector
    get() {
        if (_canary != null) return _canary!!
        _canary = tablerOutlineIcon(
            name = "Canary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20v-2")
            addPathData("M15 8.01v.01")
            addPathData("M3 17 11 9v-1C11 5.791 12.791 4 15 4c2.209 0 4 1.791 4 4h2l-2 2v1c.001 3.228-2.205 6.038-5.341 6.803-3.136 .765-6.388-.714-7.874-3.58")
        }
        return _canary!!
    }

private var _canary: ImageVector? = null
