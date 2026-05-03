package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorRegularIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.770 73.000 C 249.171 71.607 246.016 71.757 243.560 73.390 L 208.000 97.050 L 208.000 72.000 C 208.000 63.163 200.837 56.000 192.000 56.000 L 113.060 56.000 C 108.642 56.000 105.060 59.582 105.060 64.000 C 105.060 68.418 108.642 72.000 113.060 72.000 L 192.000 72.000 L 192.000 159.630 C 192.000 164.048 195.582 167.630 200.000 167.630 C 204.418 167.630 208.000 164.048 208.000 159.630 L 208.000 159.000 L 243.560 182.710 C 244.881 183.568 246.425 184.016 248.000 184.000 C 252.418 184.000 256.000 180.418 256.000 176.000 L 256.000 80.000 C 255.979 77.068 254.356 74.382 251.770 73.000 ZM 240.000 161.050 L 208.000 139.720 L 208.000 116.280 L 240.000 95.000 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 51.730 56.000 L 32.000 56.000 C 23.163 56.000 16.000 63.163 16.000 72.000 L 16.000 184.000 C 16.000 192.837 23.163 200.000 32.000 200.000 L 182.640 200.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 32.000 184.000 L 32.000 72.000 L 66.280 72.000 L 168.100 184.000 Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
