package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = tablerOutlineIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 17v-13h4")
            addPathData("M13 5h-10")
            addPathData("M3 9h10")
            addPathData("M9 13h-6")
        }
        return _playlist!!
    }

private var _playlist: ImageVector? = null
