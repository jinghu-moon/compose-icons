package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LabelOff: ImageVector
    get() {
        if (_labelOff != null) return _labelOff!!
        _labelOff = tablerOutlineIcon(
            name = "LabelOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-1C4.895 7 4 7.895 4 9v6c0 1.105 .895 2 2 2h10.52c.135-0 .27-.028 .394-.081M18.774 14.782 21 12 17.3 7.375C17.11 7.138 16.823 7 16.52 7h-5.52")
            addPathData("M3 3 21 21")
        }
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
