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
                pathData = parseSvgPathData("M 148.000 128.000 C 148.000 130.209 146.209 132.000 144.000 132.000 L 120.000 132.000 L 120.000 156.000 C 120.000 158.209 118.209 160.000 116.000 160.000 C 113.791 160.000 112.000 158.209 112.000 156.000 L 112.000 132.000 L 88.000 132.000 C 85.791 132.000 84.000 130.209 84.000 128.000 C 84.000 125.791 85.791 124.000 88.000 124.000 L 112.000 124.000 L 112.000 100.000 C 112.000 97.791 113.791 96.000 116.000 96.000 C 118.209 96.000 120.000 97.791 120.000 100.000 L 120.000 124.000 L 144.000 124.000 C 146.209 124.000 148.000 125.791 148.000 128.000 ZM 220.000 80.000 L 220.000 176.000 C 220.000 187.046 211.046 196.000 200.000 196.000 L 32.000 196.000 C 20.954 196.000 12.000 187.046 12.000 176.000 L 12.000 80.000 C 12.000 68.954 20.954 60.000 32.000 60.000 L 200.000 60.000 C 211.046 60.000 220.000 68.954 220.000 80.000 ZM 212.000 80.000 C 212.000 73.373 206.627 68.000 200.000 68.000 L 32.000 68.000 C 25.373 68.000 20.000 73.373 20.000 80.000 L 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 200.000 188.000 C 206.627 188.000 212.000 182.627 212.000 176.000 ZM 248.000 92.000 C 245.791 92.000 244.000 93.791 244.000 96.000 L 244.000 160.000 C 244.000 162.209 245.791 164.000 248.000 164.000 C 250.209 164.000 252.000 162.209 252.000 160.000 L 252.000 96.000 C 252.000 93.791 250.209 92.000 248.000 92.000 Z"),
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
