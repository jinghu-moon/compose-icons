package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerLeftUpDouble: ImageVector
    get() {
        if (_cornerLeftUpDouble != null) return _cornerLeftUpDouble!!
        _cornerLeftUpDouble = tablerOutlineIcon(
            name = "CornerLeftUpDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 19h-6C10.343 19 9 17.657 9 16v-7")
            addPathData("M13 13 9 9 5 13 13 8 9 4 5 8")
        }
        return _cornerLeftUpDouble!!
    }

private var _cornerLeftUpDouble: ImageVector? = null
