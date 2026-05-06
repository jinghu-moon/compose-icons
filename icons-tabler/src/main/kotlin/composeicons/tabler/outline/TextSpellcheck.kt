package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextSpellcheck: ImageVector
    get() {
        if (_textSpellcheck != null) return _textSpellcheck!!
        _textSpellcheck = tablerOutlineIcon(
            name = "TextSpellcheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 15v-7.5C5 5.567 6.567 4 8.5 4 10.433 4 12 5.567 12 7.5v7.5")
            addPathData("M5 10h7")
            addPathData("M10 18l3 3 7-7")
        }
        return _textSpellcheck!!
    }

private var _textSpellcheck: ImageVector? = null
