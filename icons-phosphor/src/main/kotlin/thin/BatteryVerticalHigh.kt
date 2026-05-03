package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryVerticalHigh: ImageVector
    get() {
        if (_batteryVerticalHigh != null) return _batteryVerticalHigh!!
        _batteryVerticalHigh = phosphorThinIcon(
            name = "BatteryVerticalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 8.000 C 92.000 5.791 93.791 4.000 96.000 4.000 L 160.000 4.000 C 162.209 4.000 164.000 5.791 164.000 8.000 C 164.000 10.209 162.209 12.000 160.000 12.000 L 96.000 12.000 C 93.791 12.000 92.000 10.209 92.000 8.000 ZM 196.000 56.000 L 196.000 224.000 C 196.000 235.046 187.046 244.000 176.000 244.000 L 80.000 244.000 C 68.954 244.000 60.000 235.046 60.000 224.000 L 60.000 56.000 C 60.000 44.954 68.954 36.000 80.000 36.000 L 176.000 36.000 C 187.046 36.000 196.000 44.954 196.000 56.000 ZM 188.000 56.000 C 188.000 49.373 182.627 44.000 176.000 44.000 L 80.000 44.000 C 73.373 44.000 68.000 49.373 68.000 56.000 L 68.000 224.000 C 68.000 230.627 73.373 236.000 80.000 236.000 L 176.000 236.000 C 182.627 236.000 188.000 230.627 188.000 224.000 ZM 160.000 116.000 L 96.000 116.000 C 93.791 116.000 92.000 117.791 92.000 120.000 C 92.000 122.209 93.791 124.000 96.000 124.000 L 160.000 124.000 C 162.209 124.000 164.000 122.209 164.000 120.000 C 164.000 117.791 162.209 116.000 160.000 116.000 ZM 160.000 156.000 L 96.000 156.000 C 93.791 156.000 92.000 157.791 92.000 160.000 C 92.000 162.209 93.791 164.000 96.000 164.000 L 160.000 164.000 C 162.209 164.000 164.000 162.209 164.000 160.000 C 164.000 157.791 162.209 156.000 160.000 156.000 ZM 160.000 196.000 L 96.000 196.000 C 93.791 196.000 92.000 197.791 92.000 200.000 C 92.000 202.209 93.791 204.000 96.000 204.000 L 160.000 204.000 C 162.209 204.000 164.000 202.209 164.000 200.000 C 164.000 197.791 162.209 196.000 160.000 196.000 Z"),
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
