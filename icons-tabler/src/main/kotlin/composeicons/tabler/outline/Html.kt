package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Html: ImageVector
    get() {
        if (_html != null) return _html!!
        _html = tablerOutlineIcon(
            name = "Html",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16v-8l2 5L17 8v8")
            addPathData("M1 16v-8")
            addPathData("M5 8v8")
            addPathData("M1 12h4")
            addPathData("M7 8h4")
            addPathData("M9 8v8")
            addPathData("M20 8v8h3")
        }
        return _html!!
    }

private var _html: ImageVector? = null
