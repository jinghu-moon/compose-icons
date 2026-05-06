package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerPause: ImageVector
    get() {
        if (_playerPause != null) return _playerPause!!
        _playerPause = tablerFilledIcon(
            name = "PlayerPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4h-2C5.895 4 5 4.895 5 6v12c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-12C11 4.895 10.105 4 9 4Z")
            addPathData("M17 4h-2c-1.105 0-2 .895-2 2v12c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-12C19 4.895 18.105 4 17 4Z")
        }
        return _playerPause!!
    }

private var _playerPause: ImageVector? = null
