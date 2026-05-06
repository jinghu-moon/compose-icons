package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorThinIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 112c0-11.046-8.954-20-20-20h-76v-16.29C145.775 73.722 155.999 61.918 156 48 156 22.16 131.27 5.37 130.22 4.67c-1.344-.897-3.096-.897-4.44 0C124.73 5.37 100 22.16 100 48c.001 13.918 10.225 25.722 24 27.71v16.29h-76c-11.046 0-20 8.954-20 20v23.33c.004 8.321 2.823 16.396 8 22.91v41.76c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-41.76c5.177-6.514 7.996-14.589 8-22.91ZM108 48c0-17.39 14.37-30.53 20-35 5.63 4.48 20 17.62 20 35 0 11.046-8.954 20-20 20C116.954 68 108 59.046 108 48ZM200 212h-144c-6.627 0-12-5.373-12-12v-34.27c5.592 3.886 12.193 6.064 19 6.27 13.821 .355 26.633-7.208 33-19.48 6.174 11.98 18.523 19.508 32 19.508 13.477 0 25.826-7.528 32-19.508 6.204 11.948 18.537 19.456 32 19.48h1c6.806-.203 13.406-2.378 19-6.26v34.26c0 6.627-5.373 12-12 12ZM220 135.33c0 15.39-12.21 28.25-27.21 28.66-7.56 .213-14.885-2.641-20.308-7.913C167.059 150.805 164 143.563 164 136c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 .003 7.565-3.055 14.809-8.478 20.084-5.423 5.274-12.75 8.13-20.312 7.916C48.21 163.59 36 150.73 36 135.34v-23.34c0-6.627 5.373-12 12-12h160c6.627 0 12 5.373 12 12Z"),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
