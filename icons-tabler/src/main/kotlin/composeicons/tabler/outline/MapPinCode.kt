package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinCode: ImageVector
    get() {
        if (_mapPinCode != null) return _mapPinCode!!
        _mapPinCode = tablerOutlineIcon(
            name = "MapPinCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M11.85 21.48c-.477-.035-.925-.241-1.263-.58L6.343 16.657C3.598 13.911 3.221 9.591 5.448 6.412 7.675 3.232 11.864 2.11 15.382 3.751c3.518 1.641 5.351 5.571 4.346 9.321")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _mapPinCode!!
    }

private var _mapPinCode: ImageVector? = null
