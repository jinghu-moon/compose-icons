package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TextDirectionLtr: ImageVector
    get() {
        if (_textDirectionLtr != null) return _textDirectionLtr!!
        _textDirectionLtr = tablerOutlineIcon(
            name = "TextDirectionLtr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 19h14")
            addPathData("M17 21l2-2L17 17")
            addPathData("M16 4h-6.5C7.567 4 6 5.567 6 7.5 6 9.433 7.567 11 9.5 11h.5")
            addPathData("M14 15v-11")
            addPathData("M10 15v-11")
        }
        return _textDirectionLtr!!
    }

private var _textDirectionLtr: ImageVector? = null
