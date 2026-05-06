package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = tablerOutlineIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 17c.638 .278 1.362 .278 2 0")
            addPathData("M12 3C7.336 3 4.604 5.331 4.138 8.595c-.468 3.015 .249 6.094 2 8.592 .843 1.232 1.932 2.275 3.199 3.064 1.666 1 3.664 1 5.33 0 1.267-.789 2.356-1.832 3.199-3.064 1.744-2.502 2.46-5.577 2-8.592C19.4 5.33 16.668 3 12.004 3h-.004")
            addPathData("M8 11l2 2")
            addPathData("M16 11l-2 2")
        }
        return _alien!!
    }

private var _alien: ImageVector? = null
