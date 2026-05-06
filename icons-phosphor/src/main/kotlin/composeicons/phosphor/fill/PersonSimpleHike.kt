package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorFillIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 48c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C134.327 80 120 65.673 120 48ZM192 136c-23.37 0-28.92-8.56-36.6-20.4-3.65-5.64-7.79-12-14.16-17.55-2.441-2.134-5.126-3.97-8-5.47-1.967-1.013-4.266-1.167-6.35-.424-2.084 .743-3.768 2.315-4.65 4.344L64.66 228.81c-1.757 4.051 .1 8.76 4.15 10.52 1.005 .444 2.091 .673 3.19 .67 3.186 .001 6.069-1.888 7.34-4.81l33.59-77.27L144 180.12v51.88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56c0-2.584-1.248-5.008-3.35-6.51L119.45 142.92l13.4-30.81c3.57 3.62 6.28 7.8 9.13 12.19 7.67 11.84 16.27 25.11 42 27.36v80.34c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88c0-4.41-3.57-7.989-7.98-8ZM72 152c3.203 .003 6.099-1.906 7.36-4.85l24-56c1.738-4.059-.142-8.759-4.2-10.5l-28-12c-4.059-1.738-8.759 .142-10.5 4.2l-24 56c-1.738 4.059 .142 8.759 4.2 10.5l28 12c.992 .426 2.06 .647 3.14 .65Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
