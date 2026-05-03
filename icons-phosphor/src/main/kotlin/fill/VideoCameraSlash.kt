package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorFillIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 80.230 L 256.000 175.680 C 256.049 178.579 254.587 181.295 252.140 182.850 C 249.485 184.456 246.141 184.382 243.560 182.660 L 209.780 160.140 C 208.667 159.398 207.999 158.148 208.000 156.810 L 208.000 99.190 C 208.002 97.856 208.670 96.611 209.780 95.870 L 243.560 73.340 C 246.578 71.329 250.571 71.600 253.290 74.000 C 255.048 75.590 256.036 77.860 256.000 80.230 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 51.730 56.000 L 32.000 56.000 C 23.163 56.000 16.000 63.163 16.000 72.000 L 16.000 184.000 C 16.000 192.837 23.163 200.000 32.000 200.000 L 182.640 200.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 185.000 155.070 C 186.107 156.325 187.878 156.759 189.440 156.157 C 191.001 155.554 192.023 154.044 192.000 152.370 L 192.000 72.000 C 192.000 63.163 184.837 56.000 176.000 56.000 L 104.000 56.000 C 102.410 55.984 100.961 56.912 100.310 58.363 C 99.660 59.814 99.930 61.513 101.000 62.690 Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
