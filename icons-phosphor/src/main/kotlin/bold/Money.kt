package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorBoldIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 52.000 L 16.000 52.000 C 9.373 52.000 4.000 57.373 4.000 64.000 L 4.000 192.000 C 4.000 198.627 9.373 204.000 16.000 204.000 L 240.000 204.000 C 246.627 204.000 252.000 198.627 252.000 192.000 L 252.000 64.000 C 252.000 57.373 246.627 52.000 240.000 52.000 ZM 181.210 180.000 L 74.790 180.000 C 69.937 156.459 51.541 138.063 28.000 133.210 L 28.000 122.790 C 51.541 117.937 69.937 99.541 74.790 76.000 L 181.210 76.000 C 186.063 99.541 204.459 117.937 228.000 122.790 L 228.000 133.210 C 204.459 138.063 186.063 156.459 181.210 180.000 ZM 228.000 97.940 C 217.767 94.287 209.713 86.233 206.060 76.000 L 228.000 76.000 ZM 49.940 76.000 C 46.287 86.233 38.233 94.287 28.000 97.940 L 28.000 76.000 ZM 28.000 158.060 C 38.233 161.713 46.287 169.767 49.940 180.000 L 28.000 180.000 ZM 206.060 180.000 C 209.713 169.767 217.767 161.713 228.000 158.060 L 228.000 180.000 ZM 128.000 88.000 C 105.909 88.000 88.000 105.909 88.000 128.000 C 88.000 150.091 105.909 168.000 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 ZM 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _money!!
    }

private var _money: ImageVector? = null
