package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerPause: ImageVector
    get() {
        if (_playerPause != null) return _playerPause!!
        _playerPause = tablerOutlineIcon(
            name = "PlayerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6C6 5.448 6.448 5 7 5h2c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-2C6.448 19 6 18.552 6 18v-12")
            addPathData("M14 6c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-12")
        }
        return _playerPause!!
    }

private var _playerPause: ImageVector? = null
