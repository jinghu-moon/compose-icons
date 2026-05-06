package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlobeOff: ImageVector
    get() {
        if (_globeOff != null) return _globeOff!!
        _globeOff = lucideOutlineIcon(
            name = "GlobeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.114 4.462C10.653 3.576 11.285 2.751 12 2c3.305-0 6.396 1.633 8.259 4.362 1.863 2.729 2.258 6.203 1.054 9.281")
            addPathData("M15.557 15.556C14.945 17.974 13.72 20.194 12 22 7.955 22 4.309 19.564 2.761 15.827 1.214 12.09 2.069 7.789 4.929 4.929")
            addPathData("M15.892 10.234C15.513 7.143 14.148 4.255 12 2 10.753 2 9.518 2.233 8.357 2.687")
            addPathData("M17.656 12h4.344")
            addPathData("M19.071 19.071C17.196 20.946 14.652 22 12 22 8.565 18.394 7.221 13.278 8.44 8.45")
            addPathData("M2 12h10")
            addPathData("M2 2 22 22")
        }
        return _globeOff!!
    }

private var _globeOff: ImageVector? = null
