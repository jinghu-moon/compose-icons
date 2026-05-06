package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PresentationAnalytics: ImageVector
    get() {
        if (_presentationAnalytics != null) return _presentationAnalytics!!
        _presentationAnalytics = tablerOutlineIcon(
            name = "PresentationAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12v-4")
            addPathData("M15 12v-2")
            addPathData("M12 12v-1")
            addPathData("M3 4h18")
            addPathData("M4 4v10c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-10")
            addPathData("M12 16v4")
            addPathData("M9 20h6")
        }
        return _presentationAnalytics!!
    }

private var _presentationAnalytics: ImageVector? = null
