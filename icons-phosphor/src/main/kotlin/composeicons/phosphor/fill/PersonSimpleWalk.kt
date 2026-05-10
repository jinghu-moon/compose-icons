package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorFillIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 48c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C134.327 80 120 65.673 120 48ZM208 136c-28.64 0-41.81-13.3-55.75-27.37-3.53-3.57-7.18-7.26-11-10.58-37-32.14-96.22 22.73-98.72 25.08-3.096 3.048-3.194 8.01-.219 11.178 2.974 3.167 7.933 3.381 11.169 .482C62.786 126.383 73.026 119.072 84 113c13.78-7.38 25.39-10.23 34.7-8.58L64.66 228.81c-1.757 4.051 .1 8.76 4.15 10.52 1.005 .444 2.091 .673 3.19 .67 3.186 .001 6.069-1.888 7.34-4.81l33.59-77.27L144 180.12v51.88c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-56c0-2.584-1.248-5.008-3.35-6.51L119.45 142.92 132.88 112c2.64 2.44 5.26 5.07 8 7.84C155.05 134.19 172.69 152 208 152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
