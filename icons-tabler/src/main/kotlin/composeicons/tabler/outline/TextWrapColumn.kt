package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextWrapColumn: ImageVector
    get() {
        if (_textWrapColumn != null) return _textWrapColumn!!
        _textWrapColumn = tablerOutlineIcon(
            name = "TextWrapColumn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9h7c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4l2-2")
            addPathData("M12 17 10 15")
            addPathData("M3 3v18")
            addPathData("M21 3v18")
        }
        return _textWrapColumn!!
    }

private var _textWrapColumn: ImageVector? = null
