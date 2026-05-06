package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorThinIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.78 170.13 165.56 149c-3.719-1.609-7.999-1.233-11.38 1-.133 .084-.26 .178-.38 .28L129 171.42c-1.119 .689-2.51 .768-3.7 .21-16.24-7.84-33-24.52-40.89-40.57-.563-1.182-.496-2.568 .18-3.69l21.2-25.21c.1-.12 .19-.25 .28-.38 2.226-3.376 2.602-7.647 1-11.36L85.9 43.28C83.801 38.376 78.716 35.446 73.42 36.09 47.387 39.522 27.946 61.742 28 88c0 77.2 62.8 140 140 140 26.258 .054 48.478-19.387 51.91-45.42 .639-5.27-2.261-10.334-7.13-12.45ZM212 181.57c-2.917 22.052-21.757 38.506-44 38.43C95.22 220 36 160.78 36 88 35.923 65.76 52.372 46.921 74.42 44c.16-.01 .32-.01 .48 0 1.614 .014 3.061 .996 3.67 2.49L99.68 93.63c.5 1.168 .414 2.505-.23 3.6L78.26 122.43c-.1 .13-.2 .25-.29 .39-2.296 3.511-2.592 7.966-.78 11.75 8.69 17.79 26.61 35.58 44.6 44.27 3.81 1.8 8.285 1.47 11.79-.87l.37-.28 24.83-21.12c1.078-.658 2.406-.759 3.57-.27l47.21 21.16c1.632 .68 2.625 2.351 2.44 4.11ZM140 80c0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
