package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorLightIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.23 101.57l-72.6 29 51.11 65.71c2.032 2.618 1.558 6.388-1.06 8.42-2.618 2.032-6.388 1.558-8.42-1.06L128 137.77 76.74 203.68c-2.032 2.618-5.802 3.092-8.42 1.06-2.618-2.032-3.092-5.802-1.06-8.42l51.11-65.71-72.6-29c-2.007-.785-3.438-2.586-3.75-4.718-.312-2.132 .543-4.268 2.24-5.595 1.697-1.328 3.976-1.643 5.97-.827L122 119.14v-79.14c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v79.14L205.77 90.43c1.994-.816 4.273-.501 5.97 .827 1.697 1.328 2.552 3.463 2.24 5.595-.312 2.132-1.744 3.933-3.75 4.718Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
