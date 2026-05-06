package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorFillIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 112C239.967 81.086 214.914 56.033 184 56c-1.77 0-3.54 .1-5.29 .26C169.492 36.586 149.726 24.019 128 24.019c-21.726 0-41.492 12.567-50.71 32.241C75.54 56.1 73.77 56 72 56 45.817 56.006 23.133 74.155 17.381 99.699c-5.751 25.544 6.965 51.663 30.619 62.891v45.41c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-45.41c19.526-9.286 31.976-28.969 32-50.59ZM152.24 142.06l8-32c1.131-4.216 5.433-6.747 9.667-5.688 4.234 1.059 6.839 5.316 5.853 9.568l-8 32c-.89 3.561-4.089 6.059-7.76 6.06-.657-.001-1.312-.081-1.95-.24-4.281-1.076-6.881-5.417-5.81-9.7ZM120 112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM86.06 104.24c4.286-1.071 8.628 1.535 9.7 5.82l8 32c1.071 4.286-1.535 8.628-5.82 9.7-.654 .163-1.326 .243-2 .24-3.667-.005-6.861-2.503-7.75-6.06l-8-32c-.513-2.065-.182-4.249 .92-6.069 1.102-1.82 2.883-3.127 4.95-3.631ZM192 208h-128v-40.58c2.649 .386 5.323 .58 8 .58h112c2.677-0 5.351-.194 8-.58Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
