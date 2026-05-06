package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSkype: ImageVector
    get() {
        if (_brandSkype != null) return _brandSkype!!
        _brandSkype = tablerOutlineIcon(
            name = "BrandSkype",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c2.857-.001 5.545 1.355 7.242 3.654 1.697 2.298 2.202 5.266 1.361 7.996 .77 1.706 .404 3.71-.919 5.034-1.323 1.323-3.328 1.69-5.034 .919-3.188 .983-6.658 .123-9.017-2.236C3.274 16.008 2.414 12.538 3.397 9.35 2.626 7.644 2.992 5.639 4.316 4.315 5.639 2.992 7.644 2.626 9.35 3.396 10.209 3.132 11.102 2.999 12 3")
            addPathData("M8 14.5c.5 2 2.358 2.5 4 2.5 2.905 0 4-1.187 4-2.5C16 12.997 14.073 12 12 12 9.927 12 8 11 8 9.5 8 8.187 9.095 7 12 7c1.642 0 3.5 .5 4 2.5")
        }
        return _brandSkype!!
    }

private var _brandSkype: ImageVector? = null
