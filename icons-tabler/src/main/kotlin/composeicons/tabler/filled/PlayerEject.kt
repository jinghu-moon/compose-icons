package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerEject: ImageVector
    get() {
        if (_playerEject != null) return _playerEject!!
        _playerEject = tablerFilledIcon(
            name = "PlayerEject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.247 3.341 4.247 11.341C3.682 11.988 4.141 13 5 13h14c.86 0 1.318-1.012 .753-1.659l-7-8C12.563 3.124 12.289 2.999 12 2.999c-.289 0-.563 .125-.753 .342Z")
            addPathData("M18 15h-12c-1.105 0-2 .895-2 2v2c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-2c0-1.105-.895-2-2-2Z")
        }
        return _playerEject!!
    }

private var _playerEject: ImageVector? = null
