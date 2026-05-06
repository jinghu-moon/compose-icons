package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = lucideOutlineIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.05 10.966c-.94 .649-2.447 1.034-4.05 1.034-1.603 0-3.11-.385-4.05-1.034")
            addPathData("M16.923 14.049l4.48 2.04c.363 .159 .598 .518 .598 .915 0 .397-.234 .756-.597 .916l-8.574 3.9c-.527 .24-1.133 .24-1.66 0L2.596 17.91c-.363-.16-.597-.519-.597-.915 0-.396 .234-.755 .597-.915L7.08 14.04")
            addPathData("M16.949 14.14c.276 .968-.603 1.928-2.249 2.456-1.646 .528-3.757 .528-5.403 0C7.652 16.068 6.773 15.108 7.049 14.14L10.063 3.5C10.29 2.616 11.087 1.998 12 1.998c.913 0 1.71 .618 1.937 1.502Z")
            addPathData("M9.194 6.57c1.694 .574 3.916 .574 5.61 0")
        }
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
