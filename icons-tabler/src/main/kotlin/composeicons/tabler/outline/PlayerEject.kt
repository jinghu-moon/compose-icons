package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayerEject: ImageVector
    get() {
        if (_playerEject != null) return _playerEject!!
        _playerEject = tablerOutlineIcon(
            name = "PlayerEject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h14L12 4 5 12")
            addPathData("M5 17c0-.552 .448-1 1-1h12c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-12C5.448 20 5 19.552 5 19v-2")
        }
        return _playerEject!!
    }

private var _playerEject: ImageVector? = null
