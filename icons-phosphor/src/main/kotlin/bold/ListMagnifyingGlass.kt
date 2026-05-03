package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorBoldIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 40.000 140.000 L 104.000 140.000 C 110.627 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 110.627 116.000 104.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 ZM 120.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 120.000 204.000 C 126.627 204.000 132.000 198.627 132.000 192.000 C 132.000 185.373 126.627 180.000 120.000 180.000 ZM 240.490 200.490 C 238.238 202.749 235.180 204.019 231.990 204.019 C 228.800 204.019 225.742 202.749 223.490 200.490 L 205.410 182.410 C 186.234 193.103 162.110 188.023 148.875 170.505 C 135.639 152.987 137.343 128.393 152.868 112.868 C 168.393 97.343 192.987 95.639 210.505 108.875 C 228.023 122.110 233.103 146.234 222.410 165.410 L 240.490 183.480 C 242.753 185.732 244.024 188.793 244.024 191.985 C 244.024 195.177 242.753 198.238 240.490 200.490 ZM 184.000 164.000 C 195.046 164.000 204.000 155.046 204.000 144.000 C 204.000 132.954 195.046 124.000 184.000 124.000 C 172.954 124.000 164.000 132.954 164.000 144.000 C 164.000 155.046 172.954 164.000 184.000 164.000 Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
