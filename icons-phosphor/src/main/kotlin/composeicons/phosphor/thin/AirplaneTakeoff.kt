package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorThinIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM243.93 92.41c-.21 1.128-.895 2.111-1.88 2.7l-147.41 88c-5.522 3.231-11.802 4.94-18.2 4.95-9.133-.011-17.916-3.513-24.55-9.79L15.73 142.89c-2.909-2.767-4.242-6.806-3.551-10.761 .691-3.955 3.315-7.303 6.991-8.919l3.07-1.5c.936-.454 2.012-.526 3-.2l30 10.13L81.5 115.8 55.91 91C52.899 88.251 51.489 84.16 52.169 80.139c.679-4.021 3.354-7.422 7.101-9.029l.16-.06 7.15-2.71c.903-.337 1.897-.337 2.8 0l55.73 20.46L178.32 57c15.288-9.093 34.933-5.593 46.14 8.22l18.69 24c.705 .903 .989 2.064 .78 3.19ZM234.06 90.56 218.21 70.24C209.488 59.553 194.257 56.86 182.4 63.91L127.58 96.64c-1.039 .622-2.304 .74-3.44 .32L68 76.31l-5.66 2.14c-1.227 .562-2.089 1.705-2.29 3.04-.202 1.335 .284 2.681 1.29 3.58 .034 .039 .071 .076 .11 .11l29.35 28.49c.888 .864 1.326 2.091 1.185 3.322-.141 1.231-.844 2.327-1.905 2.968L57.86 139.44c-1.008 .611-2.233 .746-3.35 .37L24.28 129.61l-1.67 .82-.18 .09c-1.239 .532-2.126 1.653-2.36 2.982-.234 1.328 .217 2.685 1.2 3.608l36.15 35.39c9 8.467 22.507 9.982 33.16 3.72Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
