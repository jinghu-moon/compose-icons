package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCtemplar: ImageVector
    get() {
        if (_brandCtemplar != null) return _brandCtemplar!!
        _brandCtemplar = tablerOutlineIcon(
            name = "BrandCtemplar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.04 14.831l4.46-4.331")
            addPathData("M12.555 20.82c4.55-3.456 7.582-8.639 8.426-14.405 .115-.731-.265-1.45-.934-1.767C17.511 3.538 14.768 2.976 12 3 9.232 2.976 6.489 3.537 3.953 4.647 3.284 4.964 2.904 5.683 3.019 6.414c.844 5.766 3.875 10.95 8.426 14.406 .331 .239 .779 .239 1.11 0")
            addPathData("M20 5c-2 0-4.37 3.304-8 6.644C8.37 8.304 6 5 4 5")
            addPathData("M17.738 15 13.5 10.5")
        }
        return _brandCtemplar!!
    }

private var _brandCtemplar: ImageVector? = null
