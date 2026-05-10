package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorFillIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.43 133l-32-80C206.206 49.973 203.265 47.994 200 48c-.582 .009-1.162 .079-1.73 .21L136 62v-22c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.58L54.27 80.21c-2.572 .561-4.704 2.353-5.7 4.79l-32 80c-.383 .954-.576 1.972-.57 3 0 23.31 24.54 32 40 32 15.46 0 40-8.69 40-32 .006-1.028-.187-2.046-.57-3L66.92 93.77 120 82v126h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-129.58L187 67.1 160.57 133c-.383 .954-.576 1.972-.57 3 0 23.31 24.54 32 40 32 15.46 0 40-8.69 40-32 .006-1.028-.187-2.046-.57-3ZM79.43 168h-46.81L56 109.54ZM176.67 136 200 77.54 223.38 136Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
