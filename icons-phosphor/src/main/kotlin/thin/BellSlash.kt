package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorThinIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 63.800 63.320 C 56.067 75.477 51.972 89.592 52.000 104.000 C 52.000 140.130 43.420 168.000 37.640 177.950 C 35.474 181.661 35.457 186.247 37.596 189.974 C 39.735 193.700 43.703 195.999 48.000 196.000 L 92.230 196.000 C 94.296 214.193 109.690 227.937 128.000 227.937 C 146.310 227.937 161.704 214.193 163.770 196.000 L 184.410 196.000 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 128.000 220.000 C 114.082 219.999 102.278 209.775 100.290 196.000 L 155.710 196.000 C 153.722 209.775 141.918 219.999 128.000 220.000 ZM 48.000 188.000 C 46.577 188.011 45.261 187.244 44.570 186.000 C 43.855 184.762 43.855 183.238 44.570 182.000 C 52.000 169.170 60.000 139.320 60.000 104.000 C 59.977 91.861 63.224 79.940 69.400 69.490 L 177.140 188.000 ZM 212.550 175.520 C 212.086 175.705 211.590 175.800 211.090 175.800 C 209.446 175.798 207.970 174.791 207.370 173.260 C 200.240 155.170 196.000 129.280 196.000 104.000 C 196.006 79.798 183.148 57.416 162.237 45.230 C 141.326 33.045 115.514 32.892 94.460 44.830 C 92.541 45.935 90.090 45.274 88.985 43.355 C 87.880 41.436 88.541 38.985 90.460 37.880 C 113.992 24.512 142.858 24.666 166.246 38.286 C 189.634 51.906 204.014 76.936 204.000 104.000 C 204.000 140.050 212.260 163.890 214.790 170.340 C 215.594 172.394 214.583 174.712 212.530 175.520 Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
