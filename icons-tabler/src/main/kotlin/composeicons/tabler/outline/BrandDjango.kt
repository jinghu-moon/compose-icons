package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDjango: ImageVector
    get() {
        if (_brandDjango != null) return _brandDjango!!
        _brandDjango = tablerOutlineIcon(
            name = "BrandDjango",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12")
            addPathData("M12 7v8.5l-2.015 .201C8.954 15.806 7.954 15.315 7.406 14.436c-.548-.879-.548-1.994 0-2.873 .548-.879 1.549-1.37 2.579-1.265L12 10.5")
            addPathData("M16 7v.01")
            addPathData("M16 10v5.586c0 .905-.36 1.774-1 2.414")
        }
        return _brandDjango!!
    }

private var _brandDjango: ImageVector? = null
