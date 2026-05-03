package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorBoldIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 80.000 C 160.000 71.163 167.163 64.000 176.000 64.000 C 184.837 64.000 192.000 71.163 192.000 80.000 C 192.000 88.837 184.837 96.000 176.000 96.000 C 167.163 96.000 160.000 88.837 160.000 80.000 ZM 232.000 44.000 L 232.000 212.000 C 232.000 223.046 223.046 232.000 212.000 232.000 L 44.000 232.000 C 32.954 232.000 24.000 223.046 24.000 212.000 L 24.000 44.000 C 24.000 32.954 32.954 24.000 44.000 24.000 L 212.000 24.000 C 223.046 24.000 232.000 32.954 232.000 44.000 ZM 208.000 48.000 L 48.000 48.000 L 48.000 208.000 L 208.000 208.000 ZM 139.510 123.510 L 123.510 139.510 C 118.816 144.204 118.816 151.816 123.510 156.510 C 128.204 161.204 135.816 161.204 140.510 156.510 L 156.510 140.510 C 161.204 135.816 161.204 128.204 156.510 123.510 C 151.816 118.816 144.204 118.816 139.510 123.510 ZM 124.510 107.510 C 122.258 105.251 119.200 103.981 116.010 103.981 C 112.820 103.981 109.762 105.251 107.510 107.510 L 99.510 115.510 C 94.816 120.204 94.816 127.816 99.510 132.510 C 104.204 137.204 111.816 137.204 116.510 132.510 L 124.510 124.510 C 126.767 122.256 128.033 119.196 128.029 116.006 C 128.026 112.816 126.752 109.759 124.490 107.510 ZM 128.000 196.000 C 147.868 195.985 166.737 187.289 179.654 172.194 C 192.572 157.098 198.247 137.111 195.190 117.480 C 194.171 110.930 188.035 106.446 181.485 107.465 C 174.935 108.484 170.451 114.620 171.470 121.170 C 174.426 139.991 164.934 158.576 147.953 167.214 C 130.973 175.853 110.362 172.581 96.890 159.110 C 83.419 145.638 80.147 125.027 88.786 108.047 C 97.424 91.066 116.009 81.574 134.830 84.530 C 141.380 85.549 147.516 81.065 148.535 74.515 C 149.554 67.965 145.070 61.829 138.520 60.810 C 113.281 56.879 87.969 67.424 72.985 88.110 C 58.001 108.797 55.874 136.135 67.477 158.890 C 79.080 181.646 102.457 195.979 128.000 196.000 Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
