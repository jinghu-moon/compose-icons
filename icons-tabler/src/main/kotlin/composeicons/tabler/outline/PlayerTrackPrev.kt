package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerTrackPrev: ImageVector
    get() {
        if (_playerTrackPrev != null) return _playerTrackPrev!!
        _playerTrackPrev = tablerOutlineIcon(
            name = "PlayerTrackPrev",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 5v14L13 12 21 5")
            addPathData("M10 5v14L2 12 10 5")
        }
        return _playerTrackPrev!!
    }

private var _playerTrackPrev: ImageVector? = null
