package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFeedly: ImageVector
    get() {
        if (_brandFeedly != null) return _brandFeedly!!
        _brandFeedly = tablerOutlineIcon(
            name = "BrandFeedly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.833 12.278 12.278 7.833")
            addPathData("M10.055 14.5l2.223-2.222")
            addPathData("M12.278 16.722l.555-.555")
            addPathData("M19.828 14.828c1.562-1.562 1.562-4.094 0-5.656l-5-5C13.266 2.61 10.734 2.61 9.172 4.172l-5 5c-1.562 1.562-1.562 4.094 0 5.656L10.343 21h3.314l6.171-6.172")
        }
        return _brandFeedly!!
    }

private var _brandFeedly: ImageVector? = null
