package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextIncrease: ImageVector
    get() {
        if (_textIncrease != null) return _textIncrease!!
        _textIncrease = tablerOutlineIcon(
            name = "TextIncrease",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19v-10.5C4 6.567 5.567 5 7.5 5 9.433 5 11 6.567 11 8.5v10.5")
            addPathData("M4 13h7")
            addPathData("M18 9v6")
            addPathData("M21 12h-6")
        }
        return _textIncrease!!
    }

private var _textIncrease: ImageVector? = null
