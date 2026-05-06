package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BatteryVerticalHigh: ImageVector
    get() {
        if (_batteryVerticalHigh != null) return _batteryVerticalHigh!!
        _batteryVerticalHigh = phosphorDuotoneIcon(
            name = "BatteryVerticalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 56v168c0 8.837-7.163 16-16 16h-96c-8.837 0-16-7.163-16-16v-168C64 47.163 71.163 40 80 40h96c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M88 8C88 3.582 91.582 0 96 0h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64C91.582 16 88 12.418 88 8ZM200 56v168c0 13.255-10.745 24-24 24h-96C66.745 248 56 237.255 56 224v-168C56 42.745 66.745 32 80 32h96c13.255 0 24 10.745 24 24ZM184 56c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8v168c0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8ZM160 112h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 152h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 192h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _batteryVerticalHigh!!
    }

private var _batteryVerticalHigh: ImageVector? = null
