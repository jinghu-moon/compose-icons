package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorRegularIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80c17.673 0 32-14.327 32-32C160 30.327 145.673 16 128 16 110.327 16 96 30.327 96 48c0 17.673 14.327 32 32 32ZM128 32c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM230.86 132.12c-1.092 1.825-2.867 3.14-4.931 3.655-2.064 .514-4.248 .185-6.069-.915-.35-.21-35.11-20.59-83.88-22.67v36.81l62 69.73c2.933 3.314 2.624 8.377-.69 11.31-3.314 2.933-8.377 2.624-11.31-.69L128 164 70 229.31c-2.933 3.314-7.996 3.623-11.31 .69C55.376 227.067 55.067 222.004 58 218.69L120 149v-36.82c-49 2.08-83.52 22.46-83.88 22.68-2.452 1.507-5.525 1.58-8.047 .191-2.521-1.388-4.102-4.024-4.14-6.902-.038-2.878 1.473-5.555 3.957-7.009C29.6 120.11 70.45 96 128 96c57.55 0 98.4 24.11 100.12 25.14 1.82 1.092 3.131 2.863 3.645 4.922 .514 2.059 .188 4.238-.905 6.058Z"),
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
