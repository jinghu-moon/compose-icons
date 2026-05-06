package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorFillIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 8C88 3.582 91.582 0 96 0h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64C91.582 16 88 12.418 88 8ZM200 56v168c0 13.255-10.745 24-24 24h-96C66.745 248 56 237.255 56 224v-168C56 42.745 66.745 32 80 32h96c13.255 0 24 10.745 24 24ZM120 136c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8ZM140 172c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
