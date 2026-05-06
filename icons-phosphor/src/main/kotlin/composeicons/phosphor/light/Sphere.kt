package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorLightIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM218 128c0 6.59-12.94 13.24-24 16.94-9.429 3.025-19.106 5.21-28.92 6.53 .62-7.6 .94-15.46 .94-23.47 0-26.27-3.44-51-9.68-69.78-1.971-6.257-4.656-12.266-8-17.91C189.1 49.827 217.95 86.144 218 128ZM128 38c6.59 0 13.24 12.94 16.94 24 5.84 17.53 9.06 41 9.06 66 0 8.83-.4 17.15-1.11 24.89-8 .73-16.35 1.11-24.89 1.11C73.06 154 38 138.6 38 128 38.055 78.317 78.317 38.055 128 38ZM40.31 148.3c5.644 3.344 11.653 6.029 17.91 8C77 162.56 101.73 166 128 166c8 0 15.86-.32 23.45-.94C146.64 198.2 136 218 128 218 86.132 217.945 49.811 189.076 40.31 148.3ZM148.31 215.69c3.344-5.644 6.029-11.653 8-17.91 3.545-11.073 6.033-22.457 7.43-34 11.543-1.397 22.927-3.885 34-7.43 6.257-1.971 12.266-4.656 17.91-8-7.825 33.423-33.925 59.519-67.35 67.34Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
