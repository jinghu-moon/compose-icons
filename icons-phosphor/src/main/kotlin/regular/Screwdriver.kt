package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorRegularIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 50.320 C 207.162 51.821 208.006 53.857 208.006 55.980 C 208.006 58.103 207.162 60.139 205.660 61.640 L 149.660 117.640 C 146.537 120.766 141.471 120.768 138.345 117.645 C 135.219 114.522 135.217 109.456 138.340 106.330 L 194.340 50.330 C 195.839 48.826 197.875 47.981 199.998 47.979 C 202.121 47.977 204.158 48.819 205.660 50.320 ZM 248.000 58.410 C 248.034 71.792 242.715 84.631 233.230 94.070 L 180.000 147.300 C 177.011 150.318 172.937 152.011 168.690 152.000 L 152.000 152.000 L 152.000 168.830 C 151.999 172.318 150.857 175.710 148.750 178.490 C 148.529 178.783 148.289 179.060 148.030 179.320 L 140.030 187.320 C 133.782 193.563 123.658 193.563 117.410 187.320 L 98.700 168.600 L 21.700 245.660 C 18.574 248.786 13.506 248.786 10.380 245.660 C 7.254 242.534 7.254 237.466 10.380 234.340 L 87.430 157.290 L 68.730 138.580 C 65.729 135.579 64.042 131.509 64.042 127.265 C 64.042 123.021 65.729 118.951 68.730 115.950 L 76.730 107.950 C 76.987 107.692 77.261 107.451 77.550 107.230 C 80.326 105.147 83.699 104.014 87.170 104.000 L 104.000 104.000 L 104.000 87.300 C 103.993 83.060 105.678 78.993 108.680 76.000 L 161.920 22.770 C 176.341 8.356 198.023 4.045 216.862 11.845 C 235.700 19.644 247.988 38.021 248.000 58.410 ZM 232.000 58.410 C 231.999 44.486 223.612 31.933 210.749 26.603 C 197.885 21.274 183.078 24.217 173.230 34.060 L 120.000 87.300 L 120.000 104.000 C 120.000 112.837 112.837 120.000 104.000 120.000 L 87.280 120.000 L 80.000 127.270 L 128.720 176.000 L 136.000 168.720 L 136.000 152.000 C 136.000 143.163 143.163 136.000 152.000 136.000 L 168.690 136.000 L 221.920 82.760 C 228.397 76.315 232.027 67.547 232.000 58.410 Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
