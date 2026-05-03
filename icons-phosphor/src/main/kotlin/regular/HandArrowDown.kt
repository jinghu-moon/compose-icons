package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) return _handArrowDown!!
        _handArrowDown = phosphorRegularIcon(
            name = "HandArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.330 141.060 C 224.298 136.413 216.442 134.849 209.090 136.830 L 167.250 146.450 C 169.222 138.119 167.275 129.344 161.963 122.629 C 156.652 115.915 148.561 111.999 140.000 112.000 L 89.940 112.000 C 81.449 111.979 73.301 115.352 67.310 121.370 L 44.690 144.000 L 16.000 144.000 C 7.163 144.000 0.000 151.163 0.000 160.000 L 0.000 200.000 C 0.000 208.837 7.163 216.000 16.000 216.000 L 120.000 216.000 C 120.654 216.000 121.306 215.920 121.940 215.760 L 185.940 199.760 C 186.348 199.663 186.746 199.529 187.130 199.360 L 226.000 182.820 L 226.440 182.620 C 234.035 178.825 239.135 171.382 239.935 162.930 C 240.734 154.478 237.119 146.211 230.370 141.060 ZM 16.000 160.000 L 40.000 160.000 L 40.000 200.000 L 16.000 200.000 ZM 219.430 168.210 L 181.430 184.390 L 119.000 200.000 L 56.000 200.000 L 56.000 155.310 L 78.630 132.690 C 81.620 129.676 85.694 127.986 89.940 128.000 L 140.000 128.000 C 146.627 128.000 152.000 133.373 152.000 140.000 C 152.000 146.627 146.627 152.000 140.000 152.000 L 112.000 152.000 C 107.582 152.000 104.000 155.582 104.000 160.000 C 104.000 164.418 107.582 168.000 112.000 168.000 L 144.000 168.000 C 144.602 167.998 145.202 167.931 145.790 167.800 L 212.790 152.390 L 213.100 152.310 C 217.336 151.134 221.776 153.342 223.396 157.429 C 225.015 161.515 223.292 166.166 219.400 168.210 ZM 154.340 77.660 C 151.214 74.534 151.214 69.466 154.340 66.340 C 157.466 63.214 162.534 63.214 165.660 66.340 L 184.000 84.690 L 184.000 24.000 C 184.000 19.582 187.582 16.000 192.000 16.000 C 196.418 16.000 200.000 19.582 200.000 24.000 L 200.000 84.690 L 218.340 66.340 C 221.466 63.214 226.534 63.214 229.660 66.340 C 232.786 69.466 232.786 74.534 229.660 77.660 L 197.660 109.660 C 196.159 111.162 194.123 112.006 192.000 112.006 C 189.877 112.006 187.841 111.162 186.340 109.660 Z"),
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
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
