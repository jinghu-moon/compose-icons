package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CctvOff: ImageVector
    get() {
        if (_cctvOff != null) return _cctvOff!!
        _cctvOff = lucideOutlineIcon(
            name = "CctvOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.309 6.652l4.797 2.401c.494 .247 .694 .847 .447 1.341l-.501 1.001 .605 .605h2.725c.346 0 .668 .18 .85 .474 .182 .295 .199 .663 .044 .973l-.724 1.448")
            addPathData("M15.166 15.166l-.719 1.439c-.119 .237-.327 .418-.578 .502-.252 .084-.526 .064-.764-.055L3.61 12.3C2.174 11.577 1.593 9.829 2.31 8.39L3.69 5.6c.205-.41 .504-.765 .873-1.037")
            addPathData("M2 19h3.76c.76 .005 1.458-.421 1.8-1.1L9.001 14.998")
            addPathData("M2 2 22 22")
            addPathData("M2 21v-4")
            addPathData("M7 9h.01")
        }
        return _cctvOff!!
    }

private var _cctvOff: ImageVector? = null
