package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BatteryPlusVertical: ImageVector
    get() {
        if (_batteryPlusVertical != null) return _batteryPlusVertical!!
        _batteryPlusVertical = phosphorThinIcon(
            name = "BatteryPlusVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 8.000 C 92.000 5.791 93.791 4.000 96.000 4.000 L 160.000 4.000 C 162.209 4.000 164.000 5.791 164.000 8.000 C 164.000 10.209 162.209 12.000 160.000 12.000 L 96.000 12.000 C 93.791 12.000 92.000 10.209 92.000 8.000 ZM 196.000 56.000 L 196.000 224.000 C 196.000 235.046 187.046 244.000 176.000 244.000 L 80.000 244.000 C 68.954 244.000 60.000 235.046 60.000 224.000 L 60.000 56.000 C 60.000 44.954 68.954 36.000 80.000 36.000 L 176.000 36.000 C 187.046 36.000 196.000 44.954 196.000 56.000 ZM 188.000 56.000 C 188.000 49.373 182.627 44.000 176.000 44.000 L 80.000 44.000 C 73.373 44.000 68.000 49.373 68.000 56.000 L 68.000 224.000 C 68.000 230.627 73.373 236.000 80.000 236.000 L 176.000 236.000 C 182.627 236.000 188.000 230.627 188.000 224.000 ZM 156.000 136.000 L 132.000 136.000 L 132.000 112.000 C 132.000 109.791 130.209 108.000 128.000 108.000 C 125.791 108.000 124.000 109.791 124.000 112.000 L 124.000 136.000 L 100.000 136.000 C 97.791 136.000 96.000 137.791 96.000 140.000 C 96.000 142.209 97.791 144.000 100.000 144.000 L 124.000 144.000 L 124.000 168.000 C 124.000 170.209 125.791 172.000 128.000 172.000 C 130.209 172.000 132.000 170.209 132.000 168.000 L 132.000 144.000 L 156.000 144.000 C 158.209 144.000 160.000 142.209 160.000 140.000 C 160.000 137.791 158.209 136.000 156.000 136.000 Z"),
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
        return _batteryPlusVertical!!
    }

private var _batteryPlusVertical: ImageVector? = null
