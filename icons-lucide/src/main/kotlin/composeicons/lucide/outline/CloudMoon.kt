package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = lucideOutlineIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-6C4.369 21.999 2.188 19.96 2.012 17.335 1.836 14.709 3.725 12.397 6.332 12.045c2.607-.352 5.042 1.377 5.568 3.955Z")
            addPathData("M18.376 14.512c1.741-.751 3.024-2.282 3.461-4.127 .148-.625-.659-.97-1.248-.714-1.506 .651-3.257 .317-4.417-.843C15.012 7.668 14.678 5.917 15.33 4.411c.255-.589-.09-1.395-.716-1.248-2.532 .601-4.387 2.766-4.594 5.36")
        }
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
