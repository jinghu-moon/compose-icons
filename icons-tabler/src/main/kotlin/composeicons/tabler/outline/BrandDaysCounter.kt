package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDaysCounter: ImageVector
    get() {
        if (_brandDaysCounter != null) return _brandDaysCounter!!
        _brandDaysCounter = tablerOutlineIcon(
            name = "BrandDaysCounter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.779 10.007C19.791 5.663 15.774 2.696 11.332 3.028 6.89 3.36 3.359 6.891 3.028 11.334c-.331 4.442 2.637 8.458 6.981 9.445")
            addPathData("M13 21h8v-7")
            addPathData("M12 8v4l3 3")
        }
        return _brandDaysCounter!!
    }

private var _brandDaysCounter: ImageVector? = null
