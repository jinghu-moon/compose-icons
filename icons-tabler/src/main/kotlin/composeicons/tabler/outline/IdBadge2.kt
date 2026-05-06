package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IdBadge2: ImageVector
    get() {
        if (_idBadge2 != null) return _idBadge2!!
        _idBadge2 = tablerOutlineIcon(
            name = "IdBadge2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h3v4h-3v-4")
            addPathData("M10 6h-6C3.448 6 3 6.448 3 7v12c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-12C21 6.448 20.552 6 20 6h-6")
            addPathData("M10 4c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-2C10.448 8 10 7.552 10 7v-3")
            addPathData("M14 16h2")
            addPathData("M14 12h4")
        }
        return _idBadge2!!
    }

private var _idBadge2: ImageVector? = null
