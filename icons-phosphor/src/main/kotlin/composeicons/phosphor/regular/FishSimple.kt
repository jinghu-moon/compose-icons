package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorRegularIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 76c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM210 155.08c-15.08 20.84-37.53 34.88-66.7 41.74-20.08 4.72-43.54 6-70.12 3.93q2.4 17.82 6.72 37.54c.941 4.313-1.788 8.573-6.1 9.52-.565 .127-1.141 .191-1.72 .19-3.757-.002-7.007-2.619-7.81-6.29Q59.38 219.35 56.86 199.09 36.64 196.58 14.28 191.68c-4.316-.947-7.047-5.214-6.1-9.53 .947-4.316 5.214-7.047 9.53-6.1q19.7 4.32 37.5 6.73c-2.09-26.56-.78-50 3.93-70.06C66 83.55 80.05 61.1 100.88 46 115 35.76 140.15 23.64 179.27 24c21.19 .21 40.83 4.33 43.81 6.08 1.168 .688 2.142 1.662 2.83 2.83 1.75 3 5.87 22.59 6.08 43.78 .22 21.62-3.42 52.75-21.99 78.39ZM186.24 157.88C141.732 149.049 106.941 114.25 98.12 69.74 75.64 94 66.7 132.47 71.36 184.6c52.15 4.68 90.64-4.25 114.89-26.72ZM212.44 43.56C199.539 40.925 186.384 39.747 173.22 40.05c-24.34 .64-44.71 6.49-60.76 17.39 4.499 45.555 40.536 81.596 86.09 86.1 10.91-16 16.76-36.42 17.4-60.76 .302-13.164-.875-26.319-3.51-39.22Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
