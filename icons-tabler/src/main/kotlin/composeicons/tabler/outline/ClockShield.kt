package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockShield: ImageVector
    get() {
        if (_clockShield != null) return _clockShield!!
        _clockShield = tablerOutlineIcon(
            name = "ClockShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.358 18.805 5.075 15.44 3.683 12.074 2.291 8.201 3.065 5.629 5.643 3.057 8.221 2.292 12.096 3.691 15.458c1.399 3.362 4.687 5.55 8.329 5.542")
            addPathData("M12 7v5l1 1")
            addPathData("M22 16c0 4-2.5 6-3.5 6C17.5 22 15 20 15 16c1 0 2.5-.5 3.5-1.5C19.5 15.5 21 16 22 16")
        }
        return _clockShield!!
    }

private var _clockShield: ImageVector? = null
