package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorBoldIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 108.000 L 140.000 108.000 L 140.000 92.000 L 144.000 92.000 C 155.046 92.000 164.000 83.046 164.000 72.000 L 164.000 40.000 C 164.000 28.954 155.046 20.000 144.000 20.000 L 112.000 20.000 C 100.954 20.000 92.000 28.954 92.000 40.000 L 92.000 72.000 C 92.000 83.046 100.954 92.000 112.000 92.000 L 116.000 92.000 L 116.000 108.000 L 24.000 108.000 C 17.373 108.000 12.000 113.373 12.000 120.000 C 12.000 126.627 17.373 132.000 24.000 132.000 L 52.000 132.000 L 52.000 156.000 L 48.000 156.000 C 36.954 156.000 28.000 164.954 28.000 176.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 80.000 228.000 C 91.046 228.000 100.000 219.046 100.000 208.000 L 100.000 176.000 C 100.000 164.954 91.046 156.000 80.000 156.000 L 76.000 156.000 L 76.000 132.000 L 180.000 132.000 L 180.000 140.000 C 180.000 146.627 185.373 152.000 192.000 152.000 C 198.627 152.000 204.000 146.627 204.000 140.000 L 204.000 132.000 L 232.000 132.000 C 238.627 132.000 244.000 126.627 244.000 120.000 C 244.000 113.373 238.627 108.000 232.000 108.000 ZM 116.000 44.000 L 140.000 44.000 L 140.000 68.000 L 116.000 68.000 ZM 76.000 204.000 L 52.000 204.000 L 52.000 180.000 L 76.000 180.000 ZM 224.490 176.490 L 209.000 192.000 L 224.520 207.510 C 229.214 212.204 229.214 219.816 224.520 224.510 C 219.826 229.204 212.214 229.204 207.520 224.510 L 192.000 209.000 L 176.490 224.520 C 171.796 229.214 164.184 229.214 159.490 224.520 C 154.796 219.826 154.796 212.214 159.490 207.520 L 175.000 192.000 L 159.480 176.490 C 154.786 171.796 154.786 164.184 159.480 159.490 C 164.174 154.796 171.786 154.796 176.480 159.490 L 192.000 175.000 L 207.510 159.480 C 212.204 154.786 219.816 154.786 224.510 159.480 C 229.204 164.174 229.204 171.786 224.510 176.480 Z"),
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
        return _networkX!!
    }

private var _networkX: ImageVector? = null
