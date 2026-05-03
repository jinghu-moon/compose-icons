package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorBoldIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 203.570 51.000 C 172.563 20.497 126.273 11.593 86.163 28.417 C 46.053 45.242 19.967 84.504 20.000 128.000 C 20.000 172.720 47.600 210.250 92.000 225.940 C 103.018 229.836 115.242 228.140 124.784 221.393 C 134.326 214.646 140.000 203.687 140.000 192.000 C 140.000 185.373 145.373 180.000 152.000 180.000 L 198.210 180.000 C 215.038 180.079 229.647 168.424 233.310 152.000 C 235.165 143.828 236.067 135.469 236.000 127.090 C 235.801 98.410 224.121 71.006 203.570 51.000 ZM 209.910 146.670 C 208.682 152.136 203.812 156.007 198.210 155.970 L 152.000 155.970 C 132.118 155.970 116.000 172.088 116.000 191.970 C 115.996 195.863 114.103 199.512 110.923 201.758 C 107.743 204.004 103.671 204.568 100.000 203.270 C 83.350 197.390 69.350 187.510 59.520 174.710 C 49.308 161.293 43.849 144.861 44.000 128.000 C 43.998 81.946 81.078 44.477 127.130 44.000 L 128.000 44.000 C 174.038 44.187 211.422 81.255 212.000 127.290 C 212.054 133.822 211.353 140.339 209.910 146.710 ZM 144.000 76.000 C 144.000 84.837 136.837 92.000 128.000 92.000 C 119.163 92.000 112.000 84.837 112.000 76.000 C 112.000 67.163 119.163 60.000 128.000 60.000 C 136.837 60.000 144.000 67.163 144.000 76.000 ZM 100.000 100.000 C 100.000 108.837 92.837 116.000 84.000 116.000 C 75.163 116.000 68.000 108.837 68.000 100.000 C 68.000 91.163 75.163 84.000 84.000 84.000 C 92.837 84.000 100.000 91.163 100.000 100.000 ZM 100.000 156.000 C 100.000 164.837 92.837 172.000 84.000 172.000 C 75.163 172.000 68.000 164.837 68.000 156.000 C 68.000 147.163 75.163 140.000 84.000 140.000 C 92.837 140.000 100.000 147.163 100.000 156.000 ZM 188.000 100.000 C 188.000 108.837 180.837 116.000 172.000 116.000 C 163.163 116.000 156.000 108.837 156.000 100.000 C 156.000 91.163 163.163 84.000 172.000 84.000 C 180.837 84.000 188.000 91.163 188.000 100.000 Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
