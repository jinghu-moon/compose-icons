package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStarGreen: ImageVector
    get() {
        if (_michelinStarGreen != null) return _michelinStarGreen!!
        _michelinStarGreen = tablerOutlineIcon(
            name = "MichelinStarGreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.432 17.949c.863 1.544 2.589 1.976 4.13 1.112 1.54-.865 1.972-2.594 1.048-4.138-.185-.309-.309-.556-.494-.74 .247 .06 .555 .06 .925 .06 1.726 0 2.959-1.234 2.959-2.963C21 9.55 19.767 8.315 17.98 8.315c-.37 0-.617 0-.925 .062 .185-.185 .308-.432 .493-.74 .863-1.545 .431-3.274-1.048-4.138C14.959 2.634 13.295 3.066 12.37 4.61c-.185 .309-.308 .556-.432 .803-.123-.247-.246-.494-.431-.803C10.705 3.005 8.979 2.572 7.5 3.437 5.959 4.302 5.527 6.031 6.452 7.574c.185 .31 .308 .556 .493 .741C6.699 8.254 6.39 8.254 6.021 8.254 4.233 8.254 3 9.489 3 11.218c0 1.729 1.233 2.964 3.02 2.964")
            addPathData("M4.073 21C8.359 18.244 9.973 15.746 12 12")
        }
        return _michelinStarGreen!!
    }

private var _michelinStarGreen: ImageVector? = null
