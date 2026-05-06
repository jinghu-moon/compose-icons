package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = tablerOutlineIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M14.8 9C14.431 8.36 13.739 7.975 13 8h-2C9.895 8 9 8.895 9 10c0 1.105 .895 2 2 2h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2c-.739 .025-1.431-.36-1.8-1")
            addPathData("M12 7v10")
        }
        return _coin!!
    }

private var _coin: ImageVector? = null
