package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerSkipForward: ImageVector
    get() {
        if (_playerSkipForward != null) return _playerSkipForward!!
        _playerSkipForward = tablerOutlineIcon(
            name = "PlayerSkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5v14L16 12 4 5")
            addPathData("M20 5v14")
        }
        return _playerSkipForward!!
    }

private var _playerSkipForward: ImageVector? = null
