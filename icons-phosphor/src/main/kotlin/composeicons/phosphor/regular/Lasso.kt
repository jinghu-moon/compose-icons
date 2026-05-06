package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorRegularIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.73 59.93C184.85 47.08 157.24 40 128 40 98.76 40 71.15 47.08 50.27 59.93 28.17 73.52 16 92 16 112c0 20 12.17 38.44 34.27 52 19 11.67 43.49 18.56 69.73 19.73h0c.256 13.557-6.856 26.188-18.58 33-14.64 8.86-34.62 9.52-49.72 1.64-2.542-1.41-5.649-1.331-8.115 .207-2.466 1.538-3.904 4.294-3.756 7.197 .149 2.903 1.86 5.497 4.471 6.776 9.485 4.917 20.016 7.473 30.7 7.45 12.228 .048 24.238-3.237 34.74-9.5 17-10.27 26.29-26.86 26.29-46.7h0c26.24-1.17 50.76-8.06 69.73-19.73C227.83 150.44 240 132 240 112 240 92 227.83 73.52 205.73 59.93ZM67.41 155.18c5.24-9.55 15.44-12 23.53-11 10.9 1.42 21.86 9.13 26.61 23.42C99.11 166.45 81.85 162.16 67.41 155.18ZM197.35 150.41c-16.95 10.43-39.17 16.53-63.13 17.43-1.896-8.49-5.802-16.402-11.39-23.07C115.278 135.773 104.641 129.918 93 128.35c-17-2.2-31.72 5.11-39.38 18.7C39.64 137 32 124.73 32 112 32 97.79 41.47 84.14 58.65 73.57 77.05 62.23 101.68 56 128 56c26.32 0 51 6.23 69.35 17.55C214.53 84.12 224 97.77 224 112c0 14.23-9.47 27.84-26.65 38.41Z"),
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
        return _lasso!!
    }

private var _lasso: ImageVector? = null
