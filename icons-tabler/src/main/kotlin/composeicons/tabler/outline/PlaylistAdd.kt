package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaylistAdd: ImageVector
    get() {
        if (_playlistAdd != null) return _playlistAdd!!
        _playlistAdd = tablerOutlineIcon(
            name = "PlaylistAdd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8h-14")
            addPathData("M5 12h9")
            addPathData("M11 16h-6")
            addPathData("M15 16h6")
            addPathData("M18 13v6")
        }
        return _playlistAdd!!
    }

private var _playlistAdd: ImageVector? = null
