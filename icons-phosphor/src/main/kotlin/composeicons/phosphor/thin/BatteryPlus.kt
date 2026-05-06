package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorThinIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 128c0 2.209-1.791 4-4 4h-24v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-24h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v24h24c2.209 0 4 1.791 4 4ZM220 80v96c0 11.046-8.954 20-20 20h-168C20.954 196 12 187.046 12 176v-96C12 68.954 20.954 60 32 60h168c11.046 0 20 8.954 20 20ZM212 80c0-6.627-5.373-12-12-12h-168C25.373 68 20 73.373 20 80v96c0 6.627 5.373 12 12 12h168c6.627 0 12-5.373 12-12ZM248 92c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-64c0-2.209-1.791-4-4-4Z"),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
