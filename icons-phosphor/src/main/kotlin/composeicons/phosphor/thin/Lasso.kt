package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lasso: ImageVector
    get() {
        if (_lasso != null) return _lasso!!
        _lasso = phosphorThinIcon(
            name = "Lasso",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.64 63.34C183.37 50.87 156.51 44 128 44 99.49 44 72.63 50.87 52.36 63.34 31.49 76.19 20 93.48 20 112c0 18.52 11.49 35.83 32.36 48.68 19.29 11.87 44.55 18.65 71.51 19.28 .08 1.27 .13 2.56 .13 3.9 0 15.49-7.28 28.44-20.51 36.46-15.79 9.57-37.34 10.28-53.64 1.77-1.271-.705-2.824-.665-4.058 .104-1.233 .769-1.952 2.147-1.878 3.598 .074 1.452 .93 2.749 2.236 3.388 8.901 4.547 18.765 6.886 28.76 6.82 11.507 .077 22.82-2.971 32.73-8.82C123.35 217.66 132 202.28 132 183.88c0-1.32-.05-2.61-.12-3.9 27.06-.59 52.41-7.38 71.76-19.28C224.51 147.85 236 130.56 236 112 236 93.44 224.51 76.19 203.64 63.34ZM62.16 157.15c5.3-14.49 18.83-18.22 29.3-16.85 13.64 1.78 27.38 12.19 31.38 31.66C99.66 171.25 78.55 165.78 62.16 157.15ZM131 172c-1.465-9.048-5.326-17.538-11.18-24.59-6.913-8.237-16.645-13.606-27.3-15.06-16.82-2.19-31.24 6-37.33 20.74C38.33 142.35 28 127.9 28 112 28 78.91 72.86 52 128 52c55.14 0 100 26.93 100 60 0 32.52-43.26 59.06-97 60Z"),
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
