package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Versions: ImageVector
    get() {
        if (_versions != null) return _versions!!
        _versions = tablerOutlineIcon(
            name = "Versions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 7c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-6c-1.105 0-2-.895-2-2v-10")
            addPathData("M7 7v10")
            addPathData("M4 8v8")
        }
        return _versions!!
    }

private var _versions: ImageVector? = null
