package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorLightIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 80C238 59.013 220.987 42 200 42h-152C29.768 42.009 14.112 54.965 10.692 72.873 7.273 90.781 17.054 108.594 34 115.32v84.68c0 7.732 6.268 14 14 14h152c7.732 0 14-6.268 14-14v-84.68C228.471 109.564 237.978 95.574 238 80ZM46 200v-82c.66 0 1.33 0 2 0 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6C33.641 106 22 94.359 22 80 22 65.641 33.641 54 48 54h96c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 .67 0 1.34 0 2 0v82c0 1.105-.895 2-2 2h-96c-1.105 0-2-.895-2-2ZM200 106c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 .67 0 1.34 0 2 0v82c0 1.105-.895 2-2 2h-42.16c.099-.662 .152-1.33 .16-2v-84.68c11.688-4.643 20.321-14.767 23.06-27.042C183.798 76.004 180.286 63.17 171.68 54h28.32c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
