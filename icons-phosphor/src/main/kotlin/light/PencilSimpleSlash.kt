package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorLightIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 93.050 98.470 L 38.100 153.420 C 35.468 156.037 33.991 159.598 34.000 163.310 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 92.690 222.000 C 96.404 222.007 99.968 220.531 102.590 217.900 L 154.460 166.000 L 203.570 220.000 C 205.801 222.452 209.598 222.631 212.050 220.400 C 214.502 218.169 214.681 214.372 212.450 211.920 ZM 94.100 209.420 C 93.725 209.792 93.218 210.000 92.690 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 163.310 C 46.002 162.780 46.214 162.273 46.590 161.900 L 101.130 107.360 L 146.380 157.140 ZM 225.910 74.790 L 181.220 30.100 C 178.594 27.474 175.033 25.999 171.320 25.999 C 167.607 25.999 164.046 27.474 161.420 30.100 L 119.750 71.770 C 117.438 74.117 117.451 77.890 119.779 80.221 C 122.108 82.552 125.880 82.569 128.230 80.260 L 136.000 72.480 L 183.520 120.000 L 173.080 130.440 C 171.545 131.952 170.938 134.172 171.492 136.255 C 172.045 138.338 173.673 139.964 175.757 140.515 C 177.840 141.066 180.059 140.457 181.570 138.920 L 225.910 94.590 C 228.536 91.964 230.011 88.403 230.011 84.690 C 230.011 80.977 228.536 77.416 225.910 74.790 ZM 217.420 86.100 L 192.000 111.520 L 144.490 64.000 L 169.910 38.590 C 170.690 37.815 171.950 37.815 172.730 38.590 L 217.420 83.270 C 217.796 83.645 218.007 84.154 218.007 84.685 C 218.007 85.216 217.796 85.725 217.420 86.100 Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
