package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldMinus: ImageVector
    get() {
        if (_shieldMinus != null) return _shieldMinus!!
        _shieldMinus = tablerOutlineIcon(
            name = "ShieldMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.46 20.871c-.153 .046-.306 .089-.46 .129C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .885 3.009 .556 6.245-.916 9.015")
            addPathData("M16 19h6")
        }
        return _shieldMinus!!
    }

private var _shieldMinus: ImageVector? = null
