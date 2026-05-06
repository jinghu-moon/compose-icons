package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PencilOff: ImageVector
    get() {
        if (_pencilOff != null) return _pencilOff!!
        _pencilOff = lucideOutlineIcon(
            name = "PencilOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10 3.843 16.162c-.233 .232-.404 .518-.5 .833L2.021 21.355c-.053 .176-.006 .368 .124 .498 .13 .13 .321 .179 .498 .126L7.001 20.656c.313-.096 .598-.268 .83-.5L14 13.982")
            addPathData("M12.829 7.172 17.188 2.826c1.101-1.101 2.885-1.101 3.986 0 1.101 1.101 1.101 2.885 0 3.986l-4.353 4.353")
            addPathData("M15 5l4 4")
            addPathData("M2 2 22 22")
        }
        return _pencilOff!!
    }

private var _pencilOff: ImageVector? = null
