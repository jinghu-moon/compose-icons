package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaylistOff: ImageVector
    get() {
        if (_playlistOff != null) return _playlistOff!!
        _playlistOff = tablerOutlineIcon(
            name = "PlaylistOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M17 13v-9h4")
            addPathData("M13 5h-4M5 5h-2")
            addPathData("M3 9h6")
            addPathData("M9 13h-6")
            addPathData("M3 3 21 21")
        }
        return _playlistOff!!
    }

private var _playlistOff: ImageVector? = null
