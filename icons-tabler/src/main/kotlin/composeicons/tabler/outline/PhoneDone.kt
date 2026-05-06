package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneDone: ImageVector
    get() {
        if (_phoneDone != null) return _phoneDone!!
        _phoneDone = tablerOutlineIcon(
            name = "PhoneDone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h4l2 5L8.5 10.5c1.071 2.172 2.828 3.929 5 5L15 13l5 2v4c0 1.105-.895 2-2 2C9.928 20.51 3.49 14.072 3 6 3 4.895 3.895 4 5 4")
            addPathData("M15 5l2 2L21 3")
        }
        return _phoneDone!!
    }

private var _phoneDone: ImageVector? = null
