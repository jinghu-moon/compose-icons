package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockBolt: ImageVector
    get() {
        if (_clockBolt != null) return _clockBolt!!
        _clockBolt = tablerOutlineIcon(
            name = "ClockBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.984 12.53C21.209 8.717 19.002 5.176 15.479 3.7 11.956 2.223 7.885 3.131 5.323 5.965 2.761 8.799 2.268 12.941 4.092 16.297c1.824 3.356 5.569 5.196 9.34 4.588")
            addPathData("M12 7v5l3 3")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _clockBolt!!
    }

private var _clockBolt: ImageVector? = null
