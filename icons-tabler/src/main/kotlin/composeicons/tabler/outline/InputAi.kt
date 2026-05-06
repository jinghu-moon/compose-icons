package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InputAi: ImageVector
    get() {
        if (_inputAi != null) return _inputAi!!
        _inputAi = tablerOutlineIcon(
            name = "InputAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11v-2C20 7.895 19.105 7 18 7h-12C4.895 7 4 7.895 4 9v5c0 1.105 .895 2 2 2h4")
            addPathData("M14 21v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v4")
            addPathData("M14 19h4")
            addPathData("M21 15v6")
        }
        return _inputAi!!
    }

private var _inputAi: ImageVector? = null
