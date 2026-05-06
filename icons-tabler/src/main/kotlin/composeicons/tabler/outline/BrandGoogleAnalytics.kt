package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleAnalytics: ImageVector
    get() {
        if (_brandGoogleAnalytics != null) return _brandGoogleAnalytics!!
        _brandGoogleAnalytics = tablerOutlineIcon(
            name = "BrandGoogleAnalytics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10.105C10 9.495 10.495 9 11.105 9h1.79C13.505 9 14 9.495 14 10.105v9.79C14 20.505 13.505 21 12.895 21h-1.79C10.495 21 10 20.505 10 19.895v-9.79")
            addPathData("M17 4.105C17 3.495 17.495 3 18.105 3h1.79C20.505 3 21 3.495 21 4.105v15.79C21 20.505 20.505 21 19.895 21h-1.79C17.495 21 17 20.505 17 19.895v-15.79")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
        }
        return _brandGoogleAnalytics!!
    }

private var _brandGoogleAnalytics: ImageVector? = null
