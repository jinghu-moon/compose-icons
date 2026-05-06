package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorDuotoneIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 180c0 15.464-12.536 28-28 28C60.536 208 48 195.464 48 180c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM180 152c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM166.11 51.29c-1.468-2.011-3.789-3.224-6.278-3.28-2.489-.057-4.863 1.049-6.422 2.99L140.47 66c-3.037 3.778-7.623 5.975-12.47 5.975-4.847 0-9.433-2.197-12.47-5.975L102.59 51c-1.559-1.942-3.932-3.047-6.422-2.99-2.489 .057-4.81 1.269-6.278 3.28L40 120h176Z"),
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
                pathData = parseSvgPathData("M248 112h-27.92L172.58 46.59c-2.917-4.005-7.525-6.433-12.478-6.574-4.953-.141-9.692 2.021-12.832 5.854L134.42 60.77l-.2 .23c-1.508 1.895-3.798 2.999-6.22 2.999-2.422 0-4.712-1.104-6.22-2.999l-.2-.23L108.73 45.87c-3.14-3.833-7.879-5.995-12.832-5.854-4.953 .141-9.561 2.569-12.478 6.574L35.92 112h-27.92c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h240c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM96.34 56l.19 .24 12.85 14.89c4.557 5.604 11.397 8.857 18.62 8.857 7.223 0 14.063-3.253 18.62-8.857L159.47 56.24c.06-.08 .1-.16 .17-.24l40.66 56h-144.61ZM180 144c-18.332 .004-33.733 13.782-35.77 32h-32.46C109.729 157.8 94.348 144.033 76.034 144.013c-18.314-.02-33.725 13.713-35.806 31.909-2.081 18.196 9.83 35.054 27.676 39.17 17.846 4.116 35.938-5.823 42.036-23.092h36.12c6.103 17.261 24.188 27.193 42.028 23.08 17.84-4.113 29.752-20.96 27.682-39.15C213.7 157.739 198.308 143.999 180 144ZM76 200C64.954 200 56 191.046 56 180c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM180 200c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
