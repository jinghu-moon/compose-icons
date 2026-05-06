package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = lucideOutlineIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v2")
            addPathData("M4.93 4.93 6.34 6.34")
            addPathData("M20 12h2")
            addPathData("M19.07 4.93 17.66 6.34")
            addPathData("M15.947 12.65c.251-1.522-.395-3.052-1.66-3.934C13.022 7.835 11.362 7.759 10.022 8.522")
            addPathData("M13 22h-6C4.369 21.999 2.188 19.96 2.012 17.335 1.836 14.709 3.725 12.397 6.332 12.045c2.607-.352 5.042 1.377 5.568 3.955h1.1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3Z")
        }
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
