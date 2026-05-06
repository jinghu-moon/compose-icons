package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryVerticalMedium: ImageVector
    get() {
        if (_batteryVerticalMedium != null) return _batteryVerticalMedium!!
        _batteryVerticalMedium = phosphorRegularIcon(
            name = "BatteryVerticalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 32h-96C66.745 32 56 42.745 56 56v168c0 13.255 10.745 24 24 24h96c13.255 0 24-10.745 24-24v-168C200 42.745 189.255 32 176 32ZM184 224c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-168c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8ZM168 200c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM88 8C88 3.582 91.582 0 96 0h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64C91.582 16 88 12.418 88 8ZM168 160c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8Z"),
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
        return _batteryVerticalMedium!!
    }

private var _batteryVerticalMedium: ImageVector? = null
