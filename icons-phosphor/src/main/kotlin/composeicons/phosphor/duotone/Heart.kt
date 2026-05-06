package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorDuotoneIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 102c0 66-104 122-104 122C128 224 24 168 24 102 24 72.177 48.177 48 78 48c22.59 0 41.94 12.31 50 32 8.06-19.69 27.41-32 50-32 29.823 0 54 24.177 54 54Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M178 40c-20.65 0-38.73 8.88-50 23.89C116.73 48.88 98.65 40 78 40 43.774 40.039 16.039 67.774 16 102c0 70 103.79 126.66 108.21 129 2.366 1.273 5.214 1.273 7.58 0C136.21 228.66 240 172 240 102 239.961 67.774 212.226 40.039 178 40ZM128 214.8C109.74 204.16 32 155.69 32 102 32.033 76.609 52.609 56.033 78 56c19.45 0 35.78 10.36 42.6 27 1.233 3.001 4.156 4.96 7.4 4.96 3.244 0 6.167-1.959 7.4-4.96C142.22 66.33 158.55 56 178 56c25.391 .033 45.967 20.609 46 46 0 53.61-77.76 102.15-96 112.8Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
