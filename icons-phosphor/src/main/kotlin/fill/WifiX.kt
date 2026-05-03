package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorFillIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 98.340 C 232.786 101.466 232.786 106.534 229.660 109.660 C 226.534 112.786 221.466 112.786 218.340 109.660 L 200.000 91.310 L 181.660 109.660 C 178.534 112.786 173.466 112.786 170.340 109.660 C 167.214 106.534 167.214 101.466 170.340 98.340 L 188.690 80.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 200.000 68.690 L 218.340 50.340 C 221.466 47.214 226.534 47.214 229.660 50.340 C 232.786 53.466 232.786 58.534 229.660 61.660 L 211.310 80.000 ZM 206.850 131.000 C 205.386 130.065 203.998 129.015 202.700 127.860 C 201.176 126.480 198.854 126.480 197.330 127.860 C 184.669 139.142 165.405 138.588 153.413 126.597 C 141.422 114.605 140.868 95.341 152.150 82.680 C 153.512 81.161 153.512 78.859 152.150 77.340 C 142.634 66.672 141.348 50.986 149.000 38.910 C 149.729 37.721 149.786 36.239 149.151 34.997 C 148.516 33.756 147.281 32.935 145.890 32.830 Q 137.000 32.000 128.000 32.000 C 86.934 31.846 46.964 45.237 14.280 70.100 C 10.842 72.717 8.616 76.619 8.110 80.910 C 7.602 85.192 8.882 89.494 11.650 92.800 L 115.650 218.230 C 118.694 221.906 123.227 224.024 128.000 224.000 L 128.000 224.000 C 132.759 224.012 137.275 221.896 140.310 218.230 L 207.760 136.920 C 208.492 136.039 208.812 134.887 208.638 133.755 C 208.464 132.623 207.813 131.620 206.850 131.000 Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
