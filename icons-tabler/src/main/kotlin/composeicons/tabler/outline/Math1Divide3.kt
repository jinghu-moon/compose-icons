package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Math1Divide3: ImageVector
    get() {
        if (_math1Divide3 != null) return _math1Divide3!!
        _math1Divide3 = tablerOutlineIcon(
            name = "Math1Divide3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15.5c0-.276 .224-.5 .5-.5h2c.828 0 1.5 .672 1.5 1.5C14 17.328 13.328 18 12.5 18h-1.167 1.167c.828 0 1.5 .672 1.5 1.5C14 20.328 13.328 21 12.5 21h-2C10.224 21 10 20.776 10 20.5")
            addPathData("M5 12h14")
            addPathData("M10 5 12 3v6")
        }
        return _math1Divide3!!
    }

private var _math1Divide3: ImageVector? = null
