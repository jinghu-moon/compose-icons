package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerSkipBack: ImageVector
    get() {
        if (_playerSkipBack != null) return _playerSkipBack!!
        _playerSkipBack = tablerOutlineIcon(
            name = "PlayerSkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 5v14L8 12 20 5")
            addPathData("M4 5v14")
        }
        return _playerSkipBack!!
    }

private var _playerSkipBack: ImageVector? = null
