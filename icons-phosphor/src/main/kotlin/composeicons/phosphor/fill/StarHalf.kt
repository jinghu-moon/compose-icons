package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorFillIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.18 97.26C237.135 90.973 231.51 86.531 224.92 86l-59-4.76L143.14 26.15C140.62 20.01 134.641 16.001 128.005 16.001c-6.636 0-12.615 4.009-15.135 10.149L90.11 81.23 31.08 86c-6.6 .558-12.223 5.018-14.268 11.319-2.045 6.3-.115 13.213 4.898 17.541l45 38.83L53 211.75c-1.547 6.446 .939 13.19 6.301 17.09 5.361 3.899 12.543 4.188 18.199 .73L128 198.49l50.53 31.08c5.655 3.437 12.822 3.138 18.172-.757 5.35-3.896 7.834-10.625 6.298-17.063L189.24 153.68l45-38.83c5.055-4.323 7.006-11.267 4.94-17.59ZM223.84 102.73l-48.7 42c-2.264 1.951-3.251 5.002-2.56 7.91l14.88 62.8c.08 .18 .005 .391-.17 .48-.18 .14-.23 .11-.38 0L132.19 182.27c-1.262-.77-2.712-1.175-4.19-1.17v-149.1c.24 0 .27 .08 .35 .26L153 91.86c1.147 2.778 3.754 4.678 6.75 4.92l63.91 5.16c.16 0 .25 0 .34 .29 .09 .29 0 .4-.16 .5Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
