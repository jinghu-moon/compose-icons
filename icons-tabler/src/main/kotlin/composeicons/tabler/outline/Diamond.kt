package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = tablerOutlineIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5h12l3 5-8.5 9.5c-.132 .134-.312 .21-.5 .21-.188 0-.368-.076-.5-.21L3 10 6 5")
            addPathData("M10 12 8 9.8l.6-1")
        }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
