package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = tablerOutlineIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.462 20.87c-.153 .047-.307 .09-.462 .13C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .61 2.075 .648 4.276 .11 6.37")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
