package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudCog: ImageVector
    get() {
        if (_cloudCog != null) return _cloudCog!!
        _cloudCog = lucideOutlineIcon(
            name = "CloudCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.852 19.772l-.383 .924")
            addPathData("M13.148 14.228l.383-.923")
            addPathData("M13.148 19.772c1.531-.634 2.258-2.389 1.624-3.92-.634-1.531-2.389-2.258-3.92-1.624l-.383-.923")
            addPathData("M13.53 20.696l-.382-.924c-1.531 .634-3.286-.093-3.92-1.624-.634-1.531 .093-3.286 1.624-3.92")
            addPathData("M14.772 15.852l.923-.383")
            addPathData("M14.772 18.148l.923 .383")
            addPathData("M4.2 15.1C2.34 13.347 1.584 10.719 2.227 8.245 2.87 5.771 4.811 3.844 7.289 3.219c2.479-.625 5.101 .15 6.841 2.023 .731 .786 1.272 1.73 1.58 2.758h1.79c1.957 .026 3.673 1.315 4.244 3.187 .571 1.872-.134 3.899-1.744 5.013")
            addPathData("M9.228 15.852l-.923-.383")
            addPathData("M9.228 18.148l-.923 .383")
        }
        return _cloudCog!!
    }

private var _cloudCog: ImageVector? = null
