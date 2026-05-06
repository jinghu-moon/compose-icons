package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ReportAnalytics: ImageVector
    get() {
        if (_reportAnalytics != null) return _reportAnalytics!!
        _reportAnalytics = tablerOutlineIcon(
            name = "ReportAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h-2C5.895 5 5 5.895 5 7v12c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-12C19 5.895 18.105 5 17 5h-2")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2C9.895 7 9 6.105 9 5")
            addPathData("M9 17v-5")
            addPathData("M12 17v-1")
            addPathData("M15 17v-3")
        }
        return _reportAnalytics!!
    }

private var _reportAnalytics: ImageVector? = null
