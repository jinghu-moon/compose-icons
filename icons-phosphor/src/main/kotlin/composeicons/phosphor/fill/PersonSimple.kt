package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorFillIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M95.89 48c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32ZM228.12 121.14C226.4 120.11 185.55 96 128 96 70.45 96 29.6 120.11 27.88 121.14c-3.789 2.275-5.015 7.191-2.74 10.98 2.275 3.789 7.191 5.015 10.98 2.74 .36-.22 34.91-20.6 83.88-22.68v36.82L58 218.69c-2.933 3.314-2.624 8.377 .69 11.31 3.314 2.933 8.377 2.624 11.31-.69L128 164l58 65.27c2.933 3.314 7.996 3.623 11.31 .69 3.314-2.933 3.623-7.996 .69-11.31L136 149v-36.81c48.77 2.08 83.53 22.46 83.88 22.67 3.789 2.275 8.705 1.049 10.98-2.74 2.275-3.789 1.049-8.705-2.74-10.98Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
