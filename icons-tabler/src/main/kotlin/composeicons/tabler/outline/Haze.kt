package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Haze: ImageVector
    get() {
        if (_haze != null) return _haze!!
        _haze = tablerOutlineIcon(
            name = "Haze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h1")
            addPathData("M12 3v1")
            addPathData("M20 12h1")
            addPathData("M5.6 5.6l.7 .7")
            addPathData("M18.4 5.6l-.7 .7")
            addPathData("M8 12C8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4")
            addPathData("M3 16h18")
            addPathData("M3 20h18")
        }
        return _haze!!
    }

private var _haze: ImageVector? = null
