package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerOutlineIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.286 7.008C5.07 7.008 4 10.238 4 12.928 4 16.157 6.143 21 8.286 21c1.165-.05 1.799-.538 3.214-.538 1.406 0 1.607 .538 3.214 .538C16.321 21 19 17.771 19 15.619c-.03-.011-2.649-.434-2.679-3.23C16.301 10.054 18.91 9.21 19 9.161 17.904 7.555 15.838 7.048 15.25 7.008 13.715 6.888 12.218 8.085 11.5 8.085 10.771 8.085 9.464 7.008 8.286 7.008")
            addPathData("M12 4c1.105 0 2-.895 2-2-1.105 0-2 .895-2 2")
        }
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
