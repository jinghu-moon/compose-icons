package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorFillIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 3.379-.018 6.382-2.157 7.503-5.345 1.121-3.187 .12-6.735-2.503-8.865h0c-1.12-.91-20.88-17.32-31.06-49.77h26c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-29.86c-2.76-15.881-2.76-32.119 0-48h59.88c1.377 7.919 2.06 15.943 2.04 23.98 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .011-8.036-.604-16.06-1.84-24h38.51c2.216 7.807 3.337 15.884 3.33 24 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C231.939 70.588 185.412 24.061 128 24ZM102 88c5.123-16.786 14.016-32.178 26-45 11.979 12.825 20.872 28.216 26 45ZM170.75 88C166.261 71.529 158.694 56.057 148.45 42.4c25.062 6.006 46.249 22.663 58 45.6ZM221.7 173.66 203.31 192l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L192 203.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L180.69 192 162.34 173.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L192 180.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
