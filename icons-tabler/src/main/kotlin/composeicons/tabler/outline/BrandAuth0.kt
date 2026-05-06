package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAuth0: ImageVector
    get() {
        if (_brandAuth0 != null) return _brandAuth0!!
        _brandAuth0 = tablerOutlineIcon(
            name = "BrandAuth0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14.5 6.5 18l2-6L4 8h6L12 3l2 5h6l-4.5 4 2 6L12 14.5")
            addPathData("M20.507 8.872 18.497 3h-12.994L3.494 8.872c-1.242 3.593-.135 7.094 3.249 9.407L12 22l5.257-3.721c3.385-2.313 4.49-5.814 3.25-9.407")
        }
        return _brandAuth0!!
    }

private var _brandAuth0: ImageVector? = null
