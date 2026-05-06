package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Road: ImageVector
    get() {
        if (_road != null) return _road!!
        _road = lucideOutlineIcon(
            name = "Road",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M12 5v-2")
            addPathData("M12 9v3")
            addPathData("M2.077 18.449c-.173 .604-.052 1.253 .326 1.755 .378 .501 .97 .796 1.597 .796h16c.628 0 1.219-.294 1.598-.795 .378-.501 .499-1.151 .326-1.755l-4-14C17.678 3.591 16.893 3 16 3h-8C7.107 3 6.322 3.591 6.076 4.45Z")
        }
        return _road!!
    }

private var _road: ImageVector? = null
