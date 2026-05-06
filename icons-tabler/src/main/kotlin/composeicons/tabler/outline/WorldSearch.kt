package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldSearch: ImageVector
    get() {
        if (_worldSearch != null) return _worldSearch!!
        _worldSearch = tablerOutlineIcon(
            name = "WorldSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h7.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.617 2.59 2.506 5.568 2.574 8.62")
            addPathData("M15 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M20.2 20.2 22 22")
        }
        return _worldSearch!!
    }

private var _worldSearch: ImageVector? = null
