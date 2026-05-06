package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorDuotoneIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 3.389-.008 6.405-2.15 7.529-5.348 1.123-3.197 .11-6.756-2.529-8.882h0C131.88 216.86 112.12 200.45 101.94 168h26c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-29.86c-2.76-15.881-2.76-32.119 0-48h59.88c1.378 7.925 2.061 15.956 2.04 24 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .011-8.036-.604-16.06-1.84-24h38.51c2.216 7.807 3.337 15.884 3.33 24 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C231.939 70.588 185.412 24.061 128 24ZM107.59 42.4C97.346 56.057 89.779 71.529 85.29 88h-35.66C61.373 65.073 82.543 48.417 107.59 42.4ZM107.59 213.6C82.528 207.594 61.341 190.937 49.59 168h35.7c4.489 16.471 12.056 31.943 22.3 45.6ZM81.84 152h-38.51c-4.44-15.692-4.44-32.308 0-48h38.51c-2.453 15.906-2.453 32.094 0 48ZM102 88c5.123-16.786 14.016-32.178 26-45 11.979 12.825 20.872 28.216 26 45ZM170.75 88C166.261 71.529 158.694 56.057 148.45 42.4c25.062 6.006 46.249 22.663 58 45.6ZM221.7 173.66 203.31 192l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L192 203.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L180.69 192 162.34 173.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L192 180.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
