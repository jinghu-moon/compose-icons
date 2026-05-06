package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassOff: ImageVector
    get() {
        if (_glassOff != null) return _glassOff!!
        _glassOff = tablerOutlineIcon(
            name = "GlassOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 16v5")
            addPathData("M17 5l1 6c0 .887-.233 1.685-.646 2.37M15.271 15.256C14.33 15.736 13.207 16 12 16 8.686 16 6 14.012 6 11L6.711 6.732")
            addPathData("M10.983 6.959C11.312 6.986 11.652 7 12 7c2.761 0 5-.895 5-2C17 3.895 14.761 3 12 3 10.284 3 8.77 3.346 7.87 3.872")
            addPathData("M3 3 21 21")
        }
        return _glassOff!!
    }

private var _glassOff: ImageVector? = null
