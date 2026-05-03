package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorThinIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 60.000 L 172.000 60.000 L 172.000 16.000 C 172.000 13.791 170.209 12.000 168.000 12.000 C 165.791 12.000 164.000 13.791 164.000 16.000 L 164.000 60.000 L 92.000 60.000 L 92.000 16.000 C 92.000 13.791 90.209 12.000 88.000 12.000 C 85.791 12.000 84.000 13.791 84.000 16.000 L 84.000 60.000 L 32.550 60.000 C 28.130 60.000 28.000 63.590 28.000 64.000 C 28.000 66.209 29.791 68.000 32.000 68.000 L 52.000 68.000 L 52.000 160.000 C 52.000 179.882 68.118 196.000 88.000 196.000 L 124.000 196.000 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 196.000 L 168.000 196.000 C 187.882 196.000 204.000 179.882 204.000 160.000 L 204.000 68.000 L 224.000 68.000 C 226.209 68.000 228.000 66.209 228.000 64.000 C 228.000 61.791 226.209 60.000 224.000 60.000 ZM 196.000 160.000 C 196.000 175.464 183.464 188.000 168.000 188.000 L 88.000 188.000 C 72.536 188.000 60.000 175.464 60.000 160.000 L 60.000 68.000 L 196.000 68.000 ZM 108.710 130.280 C 107.963 129.203 107.791 127.828 108.250 126.600 L 120.250 94.600 C 121.023 92.529 123.329 91.477 125.400 92.250 C 127.471 93.023 128.523 95.329 127.750 97.400 L 117.750 124.000 L 144.000 124.000 C 145.312 123.999 146.540 124.641 147.288 125.718 C 148.037 126.796 148.209 128.171 147.750 129.400 L 135.750 161.400 C 134.977 163.471 132.671 164.523 130.600 163.750 C 128.529 162.977 127.477 160.671 128.250 158.600 L 138.250 132.000 L 112.000 132.000 C 110.688 132.001 109.458 131.358 108.710 130.280 Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
