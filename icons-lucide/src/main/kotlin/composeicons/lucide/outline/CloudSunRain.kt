package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudSunRain: ImageVector
    get() {
        if (_cloudSunRain != null) return _cloudSunRain!!
        _cloudSunRain = lucideOutlineIcon(
            name = "CloudSunRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v2")
            addPathData("M4.93 4.93 6.34 6.34")
            addPathData("M20 12h2")
            addPathData("M19.07 4.93 17.66 6.34")
            addPathData("M15.947 12.65c.251-1.522-.395-3.052-1.66-3.934C13.022 7.835 11.362 7.759 10.022 8.522")
            addPathData("M3 20C1.77 18.358 1.667 16.131 2.742 14.383 3.817 12.635 5.85 11.721 7.871 12.078c2.021 .357 3.618 1.912 4.029 3.922h1.1c1.246-.002 2.363 .766 2.807 1.93 .444 1.164 .123 2.481-.807 3.31")
            addPathData("M11 20v2")
            addPathData("M7 19v2")
        }
        return _cloudSunRain!!
    }

private var _cloudSunRain: ImageVector? = null
