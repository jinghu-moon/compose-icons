package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassGin: ImageVector
    get() {
        if (_glassGin != null) return _glassGin!!
        _glassGin = tablerOutlineIcon(
            name = "GlassGin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 15v6")
            addPathData("M5.5 5c0 1.105 2.91 2 6.5 2 3.59 0 6.5-.895 6.5-2C18.5 3.895 15.59 3 12 3 8.41 3 5.5 3.895 5.5 5")
            addPathData("M5.75 4.5C5.138 5.25 5 6.5 5 8c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 6.5 18.906 5.25 18.25 4.5")
        }
        return _glassGin!!
    }

private var _glassGin: ImageVector? = null
