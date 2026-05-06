package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InputCheck: ImageVector
    get() {
        if (_inputCheck != null) return _inputCheck!!
        _inputCheck = tablerOutlineIcon(
            name = "InputCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13v-4C20 7.895 19.105 7 18 7h-12C4.895 7 4 7.895 4 9v5c0 1.105 .895 2 2 2h6")
            addPathData("M15 19l2 2 4-4")
        }
        return _inputCheck!!
    }

private var _inputCheck: ImageVector? = null
