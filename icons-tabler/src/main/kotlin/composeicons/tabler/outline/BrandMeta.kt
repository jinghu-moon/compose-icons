package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMeta: ImageVector
    get() {
        if (_brandMeta != null) return _brandMeta!!
        _brandMeta = tablerOutlineIcon(
            name = "BrandMeta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10.174C13.766 7.39 15.315 6 16.648 6c2 0 3.263 2.213 4 5.217 .704 2.869 .5 6.783-2 6.783C17.534 18 16 16.435 14.5 14.348 13.546 13.033 12.709 11.636 12 10.174")
            addPathData("M12 10.174C10.234 7.39 8.685 6 7.352 6c-2 0-3.263 2.213-4 5.217C2.648 14.086 2.852 18 5.352 18 6.466 18 8 16.435 9.5 14.348c1-1.391 1.833-2.783 2.5-4.174")
        }
        return _brandMeta!!
    }

private var _brandMeta: ImageVector? = null
