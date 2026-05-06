package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorRegularIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 96v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 80v96c0 13.255-10.745 24-24 24h-168C18.745 200 8 189.255 8 176v-96C8 66.745 18.745 56 32 56h168c13.255 0 24 10.745 24 24ZM208 80c0-4.418-3.582-8-8-8h-168c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h168c4.418 0 8-3.582 8-8ZM116 132c4.418 0 8-3.582 8-8v-28c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v28c0 4.418 3.582 8 8 8ZM116 144c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
