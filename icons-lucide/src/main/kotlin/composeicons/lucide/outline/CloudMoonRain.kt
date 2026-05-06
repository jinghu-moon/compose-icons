package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) return _cloudMoonRain!!
        _cloudMoonRain = lucideOutlineIcon(
            name = "CloudMoonRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20v2")
            addPathData("M18.376 14.512c1.741-.751 3.024-2.282 3.461-4.127 .148-.625-.659-.97-1.248-.714-1.506 .651-3.257 .317-4.417-.843C15.012 7.668 14.678 5.917 15.33 4.411c.255-.589-.09-1.395-.716-1.248-2.532 .601-4.387 2.766-4.594 5.36")
            addPathData("M3 20C1.77 18.358 1.667 16.131 2.742 14.383 3.817 12.635 5.85 11.721 7.871 12.078c2.021 .357 3.618 1.912 4.029 3.922h1.1c1.246-.002 2.363 .766 2.807 1.93 .444 1.164 .123 2.481-.807 3.31")
            addPathData("M7 19v2")
        }
        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
