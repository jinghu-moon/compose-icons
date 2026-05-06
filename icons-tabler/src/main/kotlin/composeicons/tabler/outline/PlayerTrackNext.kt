package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerTrackNext: ImageVector
    get() {
        if (_playerTrackNext != null) return _playerTrackNext!!
        _playerTrackNext = tablerOutlineIcon(
            name = "PlayerTrackNext",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5v14l8-7L3 5")
            addPathData("M14 5v14l8-7L14 5")
        }
        return _playerTrackNext!!
    }

private var _playerTrackNext: ImageVector? = null
