package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IdBadge: ImageVector
    get() {
        if (_idBadge != null) return _idBadge!!
        _idBadge = tablerOutlineIcon(
            name = "IdBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6C5 4.343 6.343 3 8 3h8c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-8C6.343 21 5 19.657 5 18v-12")
            addPathData("M10 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10 6h4")
            addPathData("M9 18h6")
        }
        return _idBadge!!
    }

private var _idBadge: ImageVector? = null
