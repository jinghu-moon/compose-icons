package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCloudflare: ImageVector
    get() {
        if (_brandCloudflare != null) return _brandCloudflare!!
        _brandCloudflare = tablerOutlineIcon(
            name = "BrandCloudflare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.031 7.007C15.5 7 16.326 8.3 17 10c4 0 4.994 3.825 5 6h-20C1.999 14.36 3.36 13.046 5 13 5 11.5 6 10 8 10 8.66 8.058 10.562 7.014 13.031 7.007")
            addPathData("M12 13h6")
            addPathData("M17 10l-2.5 6")
        }
        return _brandCloudflare!!
    }

private var _brandCloudflare: ImageVector? = null
