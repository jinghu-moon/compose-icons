package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorThinIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 60h-168C20.954 60 12 68.954 12 80v96c0 11.046 8.954 20 20 20h168c11.046 0 20-8.954 20-20v-96C220 68.954 211.046 60 200 60ZM212 176c0 6.627-5.373 12-12 12h-168c-6.627 0-12-5.373-12-12v-96C20 73.373 25.373 68 32 68h168c6.627 0 12 5.373 12 12ZM252 96v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM112 124v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM124 156c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
