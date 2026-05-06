package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) return _hourglassSimpleLow!!
        _hourglassSimpleLow = phosphorLightIcon(
            name = "HourglassSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.8 198 136.68 128 209.8 58l.09-.09c4.01-4.002 5.213-10.026 3.048-15.261C210.773 37.414 205.665 34 200 34h-144c-5.663-0-10.768 3.411-12.935 8.642-2.167 5.232-.969 11.254 3.035 15.258l.09 .09 73.12 70L46.2 198l-.09 .09c-4.01 4.002-5.213 10.026-3.048 15.261 2.165 5.235 7.273 8.649 12.938 8.649h144c5.663 0 10.768-3.411 12.935-8.642 2.167-5.232 .969-11.254-3.035-15.258ZM54.56 49.38c-.551-.578-.705-1.429-.392-2.164C54.481 46.481 55.201 46.003 56 46h144c.801-.001 1.525 .476 1.84 1.212 .316 .736 .162 1.589-.39 2.168L128 119.69ZM128 136.31 163.19 170h-70.38ZM201.84 208.77c-.289 .76-1.027 1.253-1.84 1.23h-144c-.801 .001-1.525-.476-1.84-1.212-.316-.736-.162-1.589 .39-2.169L80.28 182h95.44l25.72 24.62c.571 .562 .731 1.42 .4 2.15Z"),
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
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null
