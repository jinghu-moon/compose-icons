package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorFillIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPathData("M12 111l112 64c2.46 1.406 5.48 1.406 7.94 0l112-64c2.497-1.423 4.038-4.076 4.038-6.95 0-2.874-1.541-5.527-4.038-6.95l-112-64c-2.46-1.406-5.48-1.406-7.94 0l-112 64c-2.497 1.423-4.038 4.076-4.038 6.95 0 2.874 1.541 5.527 4.038 6.95Z")
            addPathData("M236 137.05 128 198.79 20 137.05c-3.852-2.209-8.766-.877-10.975 2.975C6.816 143.877 8.148 148.791 12 151l112 64c2.46 1.406 5.48 1.406 7.94 0l112-64c3.838-2.193 5.173-7.082 2.98-10.92-2.193-3.838-7.082-5.173-10.92-2.98Z")
        }
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
