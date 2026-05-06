package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateRectangle: ImageVector
    get() {
        if (_rotateRectangle != null) return _rotateRectangle!!
        _rotateRectangle = tablerOutlineIcon(
            name = "RotateRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.09 4.01l.496-.495c.781-.781 2.047-.781 2.828 0l7.071 7.07c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415l-7.07 7.07c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L3.515 13.415C3.139 13.04 2.928 12.531 2.928 12c0-.531 .211-1.04 .587-1.415L7.05 7.05h-3.988")
            addPathData("M7.05 11.038v-3.988")
        }
        return _rotateRectangle!!
    }

private var _rotateRectangle: ImageVector? = null
