package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = tablerOutlineIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3h3l2 2h5c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-10C7.895 16 7 15.105 7 14v-9C7 3.895 7.895 3 9 3")
            addPathData("M17 16v2c0 1.105-.895 2-2 2h-10C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h2")
        }
        return _folders!!
    }

private var _folders: ImageVector? = null
