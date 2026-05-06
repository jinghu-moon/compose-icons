package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) return _shieldExclamation!!
        _shieldExclamation = tablerOutlineIcon(
            name = "ShieldExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.04 19.745C14.098 20.296 13.076 20.721 12 21 8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .575 1.956 .642 4.026 .195 6.015")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
