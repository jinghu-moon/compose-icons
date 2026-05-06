package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextWrapDisabled: ImageVector
    get() {
        if (_textWrapDisabled != null) return _textWrapDisabled!!
        _textWrapDisabled = tablerOutlineIcon(
            name = "TextWrapDisabled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h10")
            addPathData("M4 18h10")
            addPathData("M4 12h17L18 9M18 15l3-3")
        }
        return _textWrapDisabled!!
    }

private var _textWrapDisabled: ImageVector? = null
