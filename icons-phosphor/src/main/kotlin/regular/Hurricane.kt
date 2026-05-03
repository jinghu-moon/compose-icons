package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorRegularIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 ZM 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 ZM 158.320 45.360 L 167.730 10.060 C 168.446 7.370 167.712 4.500 165.792 2.484 C 163.872 0.468 161.042 -0.404 158.320 0.180 C 137.530 5.282 117.718 13.758 99.670 25.270 C 60.630 50.370 40.000 85.890 40.000 128.000 C 40.020 164.909 63.042 197.893 97.680 210.640 L 88.270 245.940 C 87.554 248.630 88.288 251.500 90.208 253.516 C 92.128 255.532 94.958 256.404 97.680 255.820 C 118.470 250.718 138.282 242.242 156.330 230.730 C 195.370 205.630 216.000 170.110 216.000 128.000 C 215.983 91.090 192.959 58.104 158.320 45.360 ZM 148.060 217.000 C 135.344 225.098 121.682 231.603 107.380 236.370 L 115.110 207.370 C 116.248 203.101 113.709 198.718 109.440 197.580 C 77.933 189.153 56.015 160.614 56.000 128.000 C 56.000 91.230 73.480 61.280 107.940 39.000 C 120.656 30.902 134.318 24.397 148.620 19.630 L 140.890 48.630 C 139.752 52.899 142.291 57.282 146.560 58.420 C 178.067 66.847 199.985 95.386 200.000 128.000 C 200.000 164.770 182.520 194.720 148.060 217.000 Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
