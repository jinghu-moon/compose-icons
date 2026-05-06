package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Api: ImageVector
    get() {
        if (_api != null) return _api!!
        _api = tablerOutlineIcon(
            name = "Api",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13h5")
            addPathData("M12 16v-8h3c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2h-3")
            addPathData("M20 8v8")
            addPathData("M9 16v-5.5C9 9.119 7.881 8 6.5 8 5.119 8 4 9.119 4 10.5v5.5")
        }
        return _api!!
    }

private var _api: ImageVector? = null
