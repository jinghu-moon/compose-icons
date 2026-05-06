package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) return _mouseOff!!
        _mouseOff = lucideOutlineIcon(
            name = "MouseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6v.343")
            addPathData("M18.218 18.218c-1.483 2.869-4.736 4.35-7.874 3.586C7.207 21.04 4.999 18.229 5 15v-6C5 7.88 5.268 6.777 5.782 5.782")
            addPathData("M19 13.343v-4.343C19.001 6.511 17.68 4.209 15.531 2.954 13.381 1.699 10.728 1.679 8.56 2.902")
            addPathData("M22 22 2 2")
        }
        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
