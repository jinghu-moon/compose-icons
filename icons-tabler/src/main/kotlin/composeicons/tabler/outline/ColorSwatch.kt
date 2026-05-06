package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorSwatch: ImageVector
    get() {
        if (_colorSwatch != null) return _colorSwatch!!
        _colorSwatch = tablerOutlineIcon(
            name = "ColorSwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 3h-4c-1.105 0-2 .895-2 2v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12C21 3.895 20.105 3 19 3")
            addPathData("M13 7.35l-2-2c-.781-.781-2.047-.781-2.828 0L5.344 8.178c-.781 .781-.781 2.047 0 2.828l9 9")
            addPathData("M7.3 13h-2.3c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h12")
            addPathData("M17 17v.01")
        }
        return _colorSwatch!!
    }

private var _colorSwatch: ImageVector? = null
