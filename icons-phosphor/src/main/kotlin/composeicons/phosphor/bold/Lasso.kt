package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorBoldIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207.83 56.53C186.32 43.29 158 36 128 36 98 36 69.68 43.29 48.17 56.53 24.85 70.89 12 90.6 12 112c0 21.4 12.85 41.14 36.17 55.5 18.48 11.37 42 18.34 67.29 20.08-2 11.07-9.09 17.75-15.22 21.54-13.48 8.31-32.75 9.18-46.86 2.1-5.932-2.971-13.149-.572-16.12 5.36-2.971 5.932-.572 13.149 5.36 16.12 9.959 4.873 20.913 7.372 32 7.3 13.443 .095 26.653-3.513 38.18-10.43 15.45-9.54 25-24.58 26.83-41.9 25.6-1.64 49.47-8.65 68.16-20.15C231.15 153.16 244 133.45 244 112 244 90.55 231.15 70.89 207.83 56.53ZM73.39 153.53c4.385-6.708 12.206-10.336 20.16-9.35 10.36 1.39 16.54 9.43 19.72 19.13C99.558 162.107 86.11 158.82 73.39 153.56ZM138.26 163.67c-1.711-8.966-5.386-17.442-10.76-24.82C120.164 128.797 109.072 122.138 96.75 120.39c-18-2.41-34.52 5.89-44.1 21C42.2 133 36 122.84 36 112 36 83.81 78.13 60 128 60c49.87 0 92 23.82 92 52 0 26.26-36.49 48.71-81.74 51.7Z"),
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
