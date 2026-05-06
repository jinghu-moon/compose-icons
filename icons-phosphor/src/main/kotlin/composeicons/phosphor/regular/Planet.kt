package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorRegularIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.11 60.68C237.46 47.49 217.27 44.52 186.61 52.02 157.651 29.628 118.473 25.669 85.62 41.814 52.767 57.959 31.965 91.394 32 128c.001 4.116 .262 8.227 .78 12.31C5.09 169 5.49 186 10.9 195.32 16 204.16 26.64 208 40.64 208c9.72-.201 19.383-1.544 28.79-4 28.962 22.37 68.128 26.313 100.968 10.166C203.238 198.019 224.03 164.595 224 128c.002-4.095-.255-8.187-.77-12.25 12.5-13 20.82-25.35 23.65-35.92 1.95-7.32 1.36-13.76-1.77-19.15ZM128 48c37.313 .038 69.658 25.832 78 62.2-17.06 16.06-40.15 32.53-62.07 45.13C116.38 171.14 92.48 181 73.42 186.4 49.397 163.994 41.526 129.172 53.578 98.613 65.629 68.053 95.15 47.977 128 48ZM24.74 187.29c-1.46-2.51-.65-7.24 2.22-13 2.838-5.397 6.291-10.447 10.29-15.05 3.964 11.485 10.072 22.113 18 31.32C38 193.46 27.24 191.61 24.74 187.29ZM128 208c-13.489 .014-26.759-3.407-38.56-9.94 21.661-7.661 42.561-17.323 62.43-28.86 21.58-12.39 40.68-25.82 56.07-39.08C206.755 173.433 171.33 207.946 128 208ZM231.42 75.69C229.72 82 225.23 89.22 218.79 96.82c-3.954-11.499-10.063-22.139-18-31.35 14.21-2.35 27.37-2.17 30.5 3.24 .9 1.57 .95 3.92 .13 6.98Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
