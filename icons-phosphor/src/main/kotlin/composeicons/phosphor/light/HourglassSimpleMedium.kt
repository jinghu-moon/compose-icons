package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassSimpleMedium: ImageVector
    get() {
        if (_hourglassSimpleMedium != null) return _hourglassSimpleMedium!!
        _hourglassSimpleMedium = phosphorLightIcon(
            name = "HourglassSimpleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.8 198 136.68 128 209.8 58l.09-.09c4.01-4.002 5.213-10.026 3.048-15.261C210.773 37.414 205.665 34 200 34h-144c-5.663-0-10.768 3.411-12.935 8.642-2.167 5.232-.969 11.254 3.035 15.258l.09 .09 73.12 70L46.2 198l-.09 .09c-4.01 4.002-5.213 10.026-3.048 15.261 2.165 5.235 7.273 8.649 12.938 8.649h144c5.663 0 10.768-3.411 12.935-8.642 2.167-5.232 .969-11.254-3.035-15.258ZM92.81 86h70.38L128 119.69ZM54.16 47.23C54.449 46.47 55.187 45.977 56 46h144c.801-.001 1.525 .476 1.84 1.212 .316 .736 .162 1.589-.39 2.168L175.72 74h-95.44L54.56 49.38c-.571-.562-.731-1.42-.4-2.15ZM201.84 208.77c-.289 .76-1.027 1.253-1.84 1.23h-144c-.801 .001-1.525-.476-1.84-1.212-.316-.736-.162-1.589 .39-2.169L122 142.05v25.95c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-25.95l67.44 64.57c.571 .562 .731 1.42 .4 2.15Z"),
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
        return _hourglassSimpleMedium!!
    }

private var _hourglassSimpleMedium: ImageVector? = null
