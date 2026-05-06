package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RubberStampOff: ImageVector
    get() {
        if (_rubberStampOff != null) return _rubberStampOff!!
        _rubberStampOff = tablerOutlineIcon(
            name = "RubberStampOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.273 8.273c.805 2.341 2.857 5.527-1.484 5.527C4.421 13.8 3 13.8 3 17.85h14.85")
            addPathData("M5 21h14")
            addPathData("M3 3 21 21")
            addPathData("M8.712 4.722C9.458 3.642 10.687 2.998 12 3c2.209 0 4 1.791 4 4 0 .992-.806 2.464-1.223 3.785M20.975 16.981c-.182-2.883-1.332-3.153-3.172-3.178")
        }
        return _rubberStampOff!!
    }

private var _rubberStampOff: ImageVector? = null
