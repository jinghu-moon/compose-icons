package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorBoldIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 148.400 L 228.000 136.000 C 227.886 94.697 202.492 57.677 164.000 42.700 L 164.000 40.000 C 164.000 28.954 155.046 20.000 144.000 20.000 L 112.000 20.000 C 100.954 20.000 92.000 28.954 92.000 40.000 L 92.000 42.700 C 53.508 57.677 28.114 94.697 28.000 136.000 L 28.000 148.400 C 18.687 150.301 11.998 158.495 12.000 168.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 168.000 C 244.002 158.495 237.313 150.301 228.000 148.400 ZM 204.000 136.000 L 204.000 148.000 L 164.000 148.000 L 164.000 69.070 C 188.579 82.377 203.922 108.050 204.000 136.000 ZM 140.000 44.000 L 140.000 148.000 L 116.000 148.000 L 116.000 44.000 ZM 92.000 69.070 L 92.000 148.000 L 52.000 148.000 L 52.000 136.000 C 52.078 108.050 67.421 82.377 92.000 69.070 ZM 220.000 188.000 L 36.000 188.000 L 36.000 172.000 L 220.000 172.000 Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
