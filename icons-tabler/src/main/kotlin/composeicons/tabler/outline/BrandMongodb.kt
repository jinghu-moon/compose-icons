package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMongodb: ImageVector
    get() {
        if (_brandMongodb != null) return _brandMongodb!!
        _brandMongodb = tablerOutlineIcon(
            name = "BrandMongodb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v19")
            addPathData("M18 11.227c0 3.273-1.812 4.77-6 9.273C7.812 15.997 6 14.5 6 11.227 6 6.773 9.071 4.3 12 2c2.929 2.3 6 4.773 6 9.227")
        }
        return _brandMongodb!!
    }

private var _brandMongodb: ImageVector? = null
