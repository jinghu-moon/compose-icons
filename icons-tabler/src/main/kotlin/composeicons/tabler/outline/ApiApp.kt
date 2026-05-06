package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ApiApp: ImageVector
    get() {
        if (_apiApp != null) return _apiApp!!
        _apiApp = tablerOutlineIcon(
            name = "ApiApp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15h-6.5C4.119 15 3 13.881 3 12.5 3 11.119 4.119 10 5.5 10h.5")
            addPathData("M15 12v6.5C15 19.881 13.881 21 12.5 21 11.119 21 10 19.881 10 18.5v-.5")
            addPathData("M12 9h6.5C19.881 9 21 10.119 21 11.5 21 12.881 19.881 14 18.5 14h-.5")
            addPathData("M9 12v-6.5C9 4.119 10.119 3 11.5 3 12.881 3 14 4.119 14 5.5v.5")
        }
        return _apiApp!!
    }

private var _apiApp: ImageVector? = null
