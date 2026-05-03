package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorRegularIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 96.000 L 56.000 160.000 C 56.000 164.418 52.418 168.000 48.000 168.000 C 43.582 168.000 40.000 164.418 40.000 160.000 L 40.000 96.000 C 40.000 91.582 43.582 88.000 48.000 88.000 C 52.418 88.000 56.000 91.582 56.000 96.000 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 80.000 87.090 L 80.000 224.000 C 80.000 228.418 83.582 232.000 88.000 232.000 C 92.418 232.000 96.000 228.418 96.000 224.000 L 96.000 104.690 L 120.000 131.090 L 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 L 136.000 148.690 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 88.000 44.430 C 92.418 44.430 96.000 40.848 96.000 36.430 L 96.000 32.000 C 96.000 27.582 92.418 24.000 88.000 24.000 C 83.582 24.000 80.000 27.582 80.000 32.000 L 80.000 36.430 C 80.000 40.848 83.582 44.430 88.000 44.430 ZM 128.000 88.430 C 132.418 88.430 136.000 84.848 136.000 80.430 L 136.000 64.000 C 136.000 59.582 132.418 56.000 128.000 56.000 C 123.582 56.000 120.000 59.582 120.000 64.000 L 120.000 80.430 C 120.000 84.848 123.582 88.430 128.000 88.430 ZM 168.000 132.430 C 172.418 132.430 176.000 128.848 176.000 124.430 L 176.000 96.000 C 176.000 91.582 172.418 88.000 168.000 88.000 C 163.582 88.000 160.000 91.582 160.000 96.000 L 160.000 124.430 C 160.000 128.848 163.582 132.430 168.000 132.430 ZM 208.000 72.000 C 203.582 72.000 200.000 75.582 200.000 80.000 L 200.000 168.430 C 200.000 172.848 203.582 176.430 208.000 176.430 C 212.418 176.430 216.000 172.848 216.000 168.430 L 216.000 80.000 C 216.000 75.582 212.418 72.000 208.000 72.000 Z"),
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
        return _waveformSlash!!
    }

private var _waveformSlash: ImageVector? = null
