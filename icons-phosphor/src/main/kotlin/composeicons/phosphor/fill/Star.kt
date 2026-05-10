package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorFillIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.29 114.85l-45 38.83L203 211.75c1.547 6.446-.939 13.19-6.301 17.09-5.361 3.899-12.543 4.188-18.199 .73L128 198.49 77.47 229.57c-5.655 3.437-12.822 3.138-18.172-.757C53.948 224.917 51.464 218.187 53 211.75L66.76 153.68 21.76 114.85C16.757 110.526 14.828 103.629 16.86 97.337 18.893 91.045 24.493 86.58 31.08 86L90.08 81.24 112.84 26.16c2.52-6.14 8.499-10.149 15.135-10.149 6.636 0 12.615 4.009 15.135 10.149l22.75 55.08 59 4.76c6.6 .558 12.223 5.018 14.268 11.319 2.045 6.3 .115 13.213-4.898 17.541Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
