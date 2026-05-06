package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SeedlingOff: ImageVector
    get() {
        if (_seedlingOff != null) return _seedlingOff!!
        _seedlingOff = tablerOutlineIcon(
            name = "SeedlingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.412 7.407C10.819 6.174 9.825 5.18 8.592 4.587M4 4h-1v2c0 3.314 2.686 6 6 6h3")
            addPathData("M12 14c-.001-.588 .085-1.173 .255-1.736M13.765 9.75C14.888 8.628 16.412 7.998 18 8h3v1c0 2.158-1.14 4.05-2.85 5.107M15 15h-3")
            addPathData("M12 20v-8")
            addPathData("M3 3 21 21")
        }
        return _seedlingOff!!
    }

private var _seedlingOff: ImageVector? = null
