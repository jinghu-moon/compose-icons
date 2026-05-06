package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextWrap: ImageVector
    get() {
        if (_textWrap != null) return _textWrap!!
        _textWrap = tablerOutlineIcon(
            name = "TextWrap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M4 18h5")
            addPathData("M4 12h13c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4l2-2M15 20 13 18")
        }
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
