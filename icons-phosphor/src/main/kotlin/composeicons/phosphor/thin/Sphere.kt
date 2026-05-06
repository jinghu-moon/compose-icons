package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorThinIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM220 128c0 10.16-22.26 21.21-57.11 25.8C163.61 145.62 164 137 164 128 164 86.84 155.93 53 143.72 37.35 187.778 45.049 219.944 83.275 220 128ZM128 36c13.24 0 28 37.78 28 92 0 9.45-.46 18.39-1.27 26.73C146.39 155.54 137.45 156 128 156 73.78 156 36 141.24 36 128 36.055 77.213 77.213 36.055 128 36ZM37.35 143.72C53 155.93 86.84 164 128 164c9 0 17.62-.39 25.8-1.11C149.21 197.74 138.16 220 128 220 83.275 219.944 45.049 187.778 37.35 143.72ZM143.72 218.65c8.63-11.06 15.19-31.22 18.3-56.63 25.41-3.11 45.57-9.67 56.63-18.3-6.704 38.264-36.666 68.226-74.93 74.93Z"),
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
