package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Viewfinder: ImageVector
    get() {
        if (_viewfinder != null) return _viewfinder!!
        _viewfinder = tablerOutlineIcon(
            name = "Viewfinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 3v4")
            addPathData("M12 21v-3")
            addPathData("M3 12h4")
            addPathData("M21 12h-3")
            addPathData("M12 12v.01")
        }
        return _viewfinder!!
    }

private var _viewfinder: ImageVector? = null
