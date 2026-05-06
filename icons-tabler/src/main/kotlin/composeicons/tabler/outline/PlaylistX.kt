package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaylistX: ImageVector
    get() {
        if (_playlistX != null) return _playlistX!!
        _playlistX = tablerOutlineIcon(
            name = "PlaylistX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8h-14")
            addPathData("M5 12h7")
            addPathData("M12 16h-7")
            addPathData("M16 14l4 4")
            addPathData("M20 14l-4 4")
        }
        return _playlistX!!
    }

private var _playlistX: ImageVector? = null
