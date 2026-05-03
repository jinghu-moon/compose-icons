package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) return _batteryEmpty!!
        _batteryEmpty = phosphorThinIcon(
            name = "BatteryEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 200.000 196.000 C 211.046 196.000 220.000 187.046 220.000 176.000 L 220.000 80.000 C 220.000 68.954 211.046 60.000 200.000 60.000 ZM 212.000 176.000 C 212.000 182.627 206.627 188.000 200.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 L 20.000 80.000 C 20.000 73.373 25.373 68.000 32.000 68.000 L 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 ZM 252.000 96.000 L 252.000 160.000 C 252.000 162.209 250.209 164.000 248.000 164.000 C 245.791 164.000 244.000 162.209 244.000 160.000 L 244.000 96.000 C 244.000 93.791 245.791 92.000 248.000 92.000 C 250.209 92.000 252.000 93.791 252.000 96.000 Z"),
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
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
