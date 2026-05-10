package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorFillIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.59 24.066 24.066 70.59 24 128v56c0 13.255 10.745 24 24 24 5.098-.008 10.063-1.633 14.18-4.64C74.33 194.53 95.6 184 128 184c32.4 0 53.67 10.52 65.81 19.35 7.293 5.346 16.971 6.14 25.037 2.053C226.913 201.316 231.998 193.042 232 184v-56C231.934 70.59 185.41 24.066 128 24ZM40 128C40.057 86.43 69.149 50.549 109.81 41.9 93.956 64.689 84.034 91.071 80.94 118.66 66.533 122.855 52.76 128.984 40 136.88ZM216 184c.049 3.007-1.641 5.773-4.34 7.1-2.714 1.4-5.989 1.132-8.44-.69C189.16 180.2 164.7 168 128 168c-36.7 0-61.16 12.2-75.22 22.42-2.451 1.822-5.726 2.09-8.44 .69C41.638 189.781 39.947 187.011 40 184v-27.93C55.071 145.306 71.997 137.414 89.93 132.79c.339-.062 .673-.149 1-.26 24.354-6.04 49.816-6.04 74.17 0 .328 .11 .662 .2 1 .27 17.923 4.622 34.839 12.511 49.9 23.27ZM216 136.87c-12.76-7.896-26.533-14.025-40.94-18.22C171.965 91.065 162.042 64.686 146.19 41.9 186.851 50.549 215.943 86.43 216 128Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
