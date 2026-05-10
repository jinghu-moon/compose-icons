package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryHigh: ImageVector
    get() {
        if (_batteryHigh != null) return _batteryHigh!!
        _batteryHigh = phosphorFillIcon(
            name = "BatteryHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 96v64c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8ZM224 80v96c0 13.255-10.745 24-24 24h-168C18.745 200 8 189.255 8 176v-96C8 66.745 18.745 56 32 56h168c13.255 0 24 10.745 24 24ZM208 80c0-4.418-3.582-8-8-8h-168c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h168c4.418 0 8-3.582 8-8ZM248 88c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64c0-4.418-3.582-8-8-8Z"),
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
        return _batteryHigh!!
    }

private var _batteryHigh: ImageVector? = null
