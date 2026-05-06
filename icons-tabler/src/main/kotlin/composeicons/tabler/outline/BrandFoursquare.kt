package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFoursquare: ImageVector
    get() {
        if (_brandFoursquare != null) return _brandFoursquare!!
        _brandFoursquare = tablerOutlineIcon(
            name = "BrandFoursquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c.644 0 1.11 .696 .978 1.33l-1.984 9.859c-.097 .474-.516 .814-1 .811h-2.254c-.308 0-.6 .141-.793 .382L7.803 20.632C7.204 21.384 5.994 20.963 5.994 20v-16c0-.564 .44-1 1-1h.006")
            addPathData("M12 9h5")
        }
        return _brandFoursquare!!
    }

private var _brandFoursquare: ImageVector? = null
