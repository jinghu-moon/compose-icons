package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Torii: ImageVector
    get() {
        if (_torii != null) return _torii!!
        _torii = tablerOutlineIcon(
            name = "Torii",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4C9.333 5.333 14.667 5.333 20 4")
            addPathData("M4 8h16")
            addPathData("M12 5v3")
            addPathData("M18 4.5v15.5")
            addPathData("M6 4.5v15.5")
        }
        return _torii!!
    }

private var _torii: ImageVector? = null
