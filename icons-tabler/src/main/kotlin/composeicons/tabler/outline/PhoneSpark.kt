package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneSpark: ImageVector
    get() {
        if (_phoneSpark != null) return _phoneSpark!!
        _phoneSpark = tablerOutlineIcon(
            name = "PhoneSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.584 19.225C6.598 16.63 3.34 11.61 3 6 3 4.895 3.895 4 5 4h4l2 5L8.5 10.5c1.071 2.172 2.828 3.929 5 5L15 13l.65 .26")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _phoneSpark!!
    }

private var _phoneSpark: ImageVector? = null
