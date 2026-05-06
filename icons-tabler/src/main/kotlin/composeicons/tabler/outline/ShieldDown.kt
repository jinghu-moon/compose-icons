package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldDown: ImageVector
    get() {
        if (_shieldDown != null) return _shieldDown!!
        _shieldDown = tablerOutlineIcon(
            name = "ShieldDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.444 20.876c-.147 .044-.295 .085-.444 .124C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .607 2.066 .648 4.256 .117 6.343")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _shieldDown!!
    }

private var _shieldDown: ImageVector? = null
