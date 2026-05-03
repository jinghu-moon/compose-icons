package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorBoldIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 36.954 36.000 28.000 44.954 28.000 56.000 L 28.000 112.000 C 28.000 166.290 54.320 199.220 76.400 217.290 C 100.110 236.680 123.840 243.290 124.840 243.580 C 126.909 244.140 129.091 244.140 131.160 243.580 C 132.160 243.300 155.890 236.680 179.600 217.290 C 201.680 199.220 228.000 166.290 228.000 112.000 L 228.000 56.000 C 228.000 44.954 219.046 36.000 208.000 36.000 ZM 204.000 112.000 C 204.000 147.710 190.910 176.690 165.090 198.150 C 154.023 207.282 141.480 214.462 128.000 219.380 C 114.519 214.464 101.976 207.285 90.910 198.150 C 65.090 176.690 52.000 147.710 52.000 112.000 L 52.000 60.000 L 204.000 60.000 ZM 79.510 144.490 C 74.816 139.796 74.816 132.184 79.510 127.490 C 84.204 122.796 91.816 122.796 96.510 127.490 L 112.000 143.000 L 159.510 95.480 C 164.204 90.786 171.816 90.786 176.510 95.480 C 181.204 100.174 181.204 107.786 176.510 112.480 L 120.510 168.480 C 118.258 170.739 115.200 172.009 112.010 172.009 C 108.820 172.009 105.762 170.739 103.510 168.480 Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
