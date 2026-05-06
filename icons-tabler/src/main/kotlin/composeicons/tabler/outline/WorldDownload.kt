package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldDownload: ImageVector
    get() {
        if (_worldDownload != null) return _worldDownload!!
        _worldDownload = tablerOutlineIcon(
            name = "WorldDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h8.4")
            addPathData("M11.578 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3C14.219 5.755 15 8.876 15 12")
            addPathData("M18 14v7M15 18l3 3 3-3")
        }
        return _worldDownload!!
    }

private var _worldDownload: ImageVector? = null
