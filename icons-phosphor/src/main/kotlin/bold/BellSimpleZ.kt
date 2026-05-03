package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorBoldIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 140.000 C 156.000 146.627 150.627 152.000 144.000 152.000 L 112.000 152.000 C 107.570 152.007 103.498 149.572 101.405 145.668 C 99.313 141.764 99.542 137.025 102.000 133.340 L 121.580 104.000 L 112.000 104.000 C 105.373 104.000 100.000 98.627 100.000 92.000 C 100.000 85.373 105.373 80.000 112.000 80.000 L 144.000 80.000 C 148.430 79.993 152.502 82.428 154.595 86.332 C 156.687 90.236 156.458 94.975 154.000 98.660 L 134.420 128.000 L 144.000 128.000 C 150.627 128.000 156.000 133.373 156.000 140.000 ZM 225.330 186.000 C 221.791 192.226 215.162 196.052 208.000 196.000 L 48.000 196.000 C 40.846 196.044 34.226 192.220 30.690 186.000 C 27.126 179.783 27.145 172.139 30.740 165.940 C 39.390 151.000 44.000 129.580 44.000 104.000 C 44.000 57.608 81.608 20.000 128.000 20.000 C 174.392 20.000 212.000 57.608 212.000 104.000 C 212.000 129.570 216.590 151.000 225.270 165.930 C 228.875 172.128 228.901 179.777 225.340 186.000 ZM 201.330 172.000 C 192.490 154.000 188.000 131.130 188.000 104.000 C 188.000 70.863 161.137 44.000 128.000 44.000 C 94.863 44.000 68.000 70.863 68.000 104.000 C 68.000 131.140 63.520 154.000 54.670 172.000 ZM 160.000 212.000 L 96.000 212.000 C 89.373 212.000 84.000 217.373 84.000 224.000 C 84.000 230.627 89.373 236.000 96.000 236.000 L 160.000 236.000 C 166.627 236.000 172.000 230.627 172.000 224.000 C 172.000 217.373 166.627 212.000 160.000 212.000 Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
