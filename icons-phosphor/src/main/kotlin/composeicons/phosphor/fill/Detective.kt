package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorFillIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 120c0 4.418-3.582 8-8 8h-240C3.582 128 0 124.418 0 120c0-4.418 3.582-8 8-8h27.92L83.42 46.59c2.917-4.005 7.525-6.433 12.478-6.574 4.953-.141 9.692 2.021 12.832 5.854l12.85 14.9 .2 .23c1.508 1.895 3.798 2.999 6.22 2.999 2.422 0 4.712-1.104 6.22-2.999l.2-.23L147.27 45.87c3.14-3.833 7.879-5.995 12.832-5.854 4.953 .141 9.561 2.569 12.478 6.574L220.08 112h27.92c4.418 0 8 3.582 8 8ZM180 144c-18.332 .004-33.733 13.782-35.77 32h-32.46C109.729 157.8 94.348 144.033 76.034 144.013c-18.314-.02-33.725 13.713-35.806 31.909-2.081 18.196 9.83 35.054 27.676 39.17 17.846 4.116 35.938-5.823 42.036-23.092h36.12c6.103 17.261 24.188 27.193 42.028 23.08 17.84-4.113 29.752-20.96 27.682-39.15C213.7 157.739 198.308 143.999 180 144Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
