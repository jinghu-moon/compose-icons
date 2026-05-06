package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = tablerOutlineIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.46 20.846C5.195 18.904 1.65 12.292 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .679 2.309 .647 4.769-.09 7.06")
            addPathData("M15 19l2 2 4-4")
        }
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
