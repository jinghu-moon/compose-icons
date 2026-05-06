package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextGrammar: ImageVector
    get() {
        if (_textGrammar != null) return _textGrammar!!
        _textGrammar = tablerOutlineIcon(
            name = "TextGrammar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 9c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 7.343 18.657 6 17 6 15.343 6 14 7.343 14 9")
            addPathData("M4 12v-5C4 5.343 5.343 4 7 4c1.657 0 3 1.343 3 3v5")
            addPathData("M4 9h6")
            addPathData("M20 6v6")
            addPathData("M4 16h12")
            addPathData("M4 20h6")
            addPathData("M14 20l2 2 5-5")
        }
        return _textGrammar!!
    }

private var _textGrammar: ImageVector? = null
