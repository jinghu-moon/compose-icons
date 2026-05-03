package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorBoldIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 76.000 C 196.000 84.837 188.837 92.000 180.000 92.000 C 171.163 92.000 164.000 84.837 164.000 76.000 C 164.000 67.163 171.163 60.000 180.000 60.000 C 188.837 60.000 196.000 67.163 196.000 76.000 ZM 244.000 98.740 C 242.369 143.948 205.347 179.809 160.110 180.000 L 160.000 180.000 C 151.995 180.012 144.031 178.874 136.350 176.620 L 128.490 184.490 C 126.238 186.740 123.184 188.003 120.000 188.000 L 108.000 188.000 L 108.000 200.000 C 108.000 206.627 102.627 212.000 96.000 212.000 L 84.000 212.000 L 84.000 224.000 C 84.000 230.627 78.627 236.000 72.000 236.000 L 40.000 236.000 C 28.954 236.000 20.000 227.046 20.000 216.000 L 20.000 187.310 C 19.986 182.003 22.096 176.911 25.860 173.170 L 79.380 119.650 C 70.118 87.802 80.464 53.486 105.786 32.064 C 131.107 10.642 166.663 6.126 196.536 20.537 C 226.409 34.948 245.005 65.588 244.000 98.740 ZM 202.430 53.570 C 190.726 41.761 174.615 35.390 158.000 36.000 C 126.000 37.000 100.000 63.890 100.000 95.890 C 99.975 103.487 101.401 111.018 104.200 118.080 C 106.130 122.591 105.121 127.822 101.650 131.290 L 44.000 189.000 L 44.000 212.000 L 60.000 212.000 L 60.000 200.000 C 60.000 193.373 65.373 188.000 72.000 188.000 L 84.000 188.000 L 84.000 176.000 C 84.000 169.373 89.373 164.000 96.000 164.000 L 115.000 164.000 L 124.650 154.350 C 128.120 150.875 133.357 149.865 137.870 151.800 C 144.913 154.594 152.423 156.020 160.000 156.000 L 160.080 156.000 C 192.080 156.000 218.950 129.930 219.970 98.000 C 220.580 81.391 214.221 65.283 202.430 53.570 Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
