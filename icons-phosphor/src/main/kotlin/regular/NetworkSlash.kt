package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorRegularIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 96.000 54.000 L 96.000 40.000 C 96.000 31.163 103.163 24.000 112.000 24.000 L 144.000 24.000 C 152.837 24.000 160.000 31.163 160.000 40.000 L 160.000 72.000 C 160.000 80.837 152.837 88.000 144.000 88.000 L 127.610 88.000 C 123.192 88.000 119.610 84.418 119.610 80.000 C 119.610 75.582 123.192 72.000 127.610 72.000 L 144.000 72.000 L 144.000 40.000 L 112.000 40.000 L 112.000 54.000 C 112.000 58.418 108.418 62.000 104.000 62.000 C 99.582 62.000 96.000 58.418 96.000 54.000 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 117.190 128.000 L 72.000 128.000 L 72.000 160.000 L 80.000 160.000 C 88.837 160.000 96.000 167.163 96.000 176.000 L 96.000 208.000 C 96.000 216.837 88.837 224.000 80.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 176.000 C 32.000 167.163 39.163 160.000 48.000 160.000 L 56.000 160.000 L 56.000 128.000 L 24.000 128.000 C 19.582 128.000 16.000 124.418 16.000 120.000 C 16.000 115.582 19.582 112.000 24.000 112.000 L 102.640 112.000 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 80.000 176.000 L 48.000 176.000 L 48.000 208.000 L 80.000 208.000 ZM 232.000 112.000 L 164.000 112.000 C 159.582 112.000 156.000 115.582 156.000 120.000 C 156.000 124.418 159.582 128.000 164.000 128.000 L 184.000 128.000 L 184.000 150.830 C 184.000 155.248 187.582 158.830 192.000 158.830 C 196.418 158.830 200.000 155.248 200.000 150.830 L 200.000 128.000 L 232.000 128.000 C 236.418 128.000 240.000 124.418 240.000 120.000 C 240.000 115.582 236.418 112.000 232.000 112.000 Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
