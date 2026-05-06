package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnowflake: ImageVector
    get() {
        if (_brandSnowflake != null) return _brandSnowflake!!
        _brandSnowflake = tablerOutlineIcon(
            name = "BrandSnowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 21v-5.5L18.5 18")
            addPathData("M10 21v-5.5L5.5 18")
            addPathData("M3.5 14.5 8 12 3.5 9.5")
            addPathData("M20.5 9.5 16 12l4.5 2.5")
            addPathData("M10 3v5.5L5.5 6")
            addPathData("M14 3v5.5L18.5 6")
            addPathData("M12 11l1 1-1 1L11 12l1-1")
        }
        return _brandSnowflake!!
    }

private var _brandSnowflake: ImageVector? = null
