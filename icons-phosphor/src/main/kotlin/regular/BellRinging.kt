package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) return _bellRinging!!
        _bellRinging = phosphorRegularIcon(
            name = "BellRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 71.100 C 220.079 73.131 215.254 71.600 213.220 67.680 C 205.584 52.595 194.026 39.845 179.760 30.770 C 176.021 28.412 174.902 23.469 177.260 19.730 C 179.618 15.991 184.561 14.872 188.300 17.230 C 204.926 27.875 218.426 42.746 227.420 60.320 C 229.451 64.241 227.920 69.066 224.000 71.100 ZM 35.710 72.000 C 38.698 71.999 41.436 70.333 42.810 67.680 C 50.446 52.595 62.004 39.845 76.270 30.770 C 80.009 28.412 81.128 23.469 78.770 19.730 C 76.412 15.991 71.469 14.872 67.730 17.230 C 51.104 27.875 37.604 42.746 28.610 60.320 C 27.325 62.799 27.427 65.769 28.877 68.155 C 30.328 70.542 32.918 71.999 35.710 72.000 ZM 221.810 175.940 C 224.695 180.887 224.716 186.998 221.865 191.965 C 219.014 196.932 213.727 199.996 208.000 200.000 L 167.200 200.000 C 163.414 218.643 147.023 232.040 128.000 232.040 C 108.977 232.040 92.586 218.643 88.800 200.000 L 48.000 200.000 C 42.277 199.989 36.996 196.922 34.150 191.956 C 31.304 186.991 31.327 180.884 34.210 175.940 C 43.220 160.390 48.000 138.280 48.000 112.000 C 48.000 67.817 83.817 32.000 128.000 32.000 C 172.183 32.000 208.000 67.817 208.000 112.000 C 208.000 138.270 212.780 160.380 221.810 175.940 ZM 150.620 200.000 L 105.380 200.000 C 108.776 209.578 117.837 215.979 128.000 215.979 C 138.163 215.979 147.224 209.578 150.620 200.000 ZM 208.000 184.000 C 197.360 165.730 192.000 141.510 192.000 112.000 C 192.000 76.654 163.346 48.000 128.000 48.000 C 92.654 48.000 64.000 76.654 64.000 112.000 C 64.000 141.520 58.620 165.740 48.000 184.000 Z"),
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
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
