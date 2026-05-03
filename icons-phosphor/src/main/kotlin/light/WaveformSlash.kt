package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorLightIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 54.000 96.000 L 54.000 160.000 C 54.000 163.314 51.314 166.000 48.000 166.000 C 44.686 166.000 42.000 163.314 42.000 160.000 L 42.000 96.000 C 42.000 92.686 44.686 90.000 48.000 90.000 C 51.314 90.000 54.000 92.686 54.000 96.000 ZM 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 82.000 86.320 L 82.000 224.000 C 82.000 227.314 84.686 230.000 88.000 230.000 C 91.314 230.000 94.000 227.314 94.000 224.000 L 94.000 99.520 L 122.000 130.320 L 122.000 192.000 C 122.000 195.314 124.686 198.000 128.000 198.000 C 131.314 198.000 134.000 195.314 134.000 192.000 L 134.000 143.520 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 88.000 42.430 C 91.314 42.430 94.000 39.744 94.000 36.430 L 94.000 32.000 C 94.000 28.686 91.314 26.000 88.000 26.000 C 84.686 26.000 82.000 28.686 82.000 32.000 L 82.000 36.430 C 82.000 39.744 84.686 42.430 88.000 42.430 ZM 128.000 86.430 C 131.314 86.430 134.000 83.744 134.000 80.430 L 134.000 64.000 C 134.000 60.686 131.314 58.000 128.000 58.000 C 124.686 58.000 122.000 60.686 122.000 64.000 L 122.000 80.430 C 122.000 83.744 124.686 86.430 128.000 86.430 ZM 168.000 130.430 C 171.314 130.430 174.000 127.744 174.000 124.430 L 174.000 96.000 C 174.000 92.686 171.314 90.000 168.000 90.000 C 164.686 90.000 162.000 92.686 162.000 96.000 L 162.000 124.430 C 162.000 127.744 164.686 130.430 168.000 130.430 ZM 208.000 74.000 C 204.686 74.000 202.000 76.686 202.000 80.000 L 202.000 168.430 C 202.000 171.744 204.686 174.430 208.000 174.430 C 211.314 174.430 214.000 171.744 214.000 168.430 L 214.000 80.000 C 214.000 76.686 211.314 74.000 208.000 74.000 Z"),
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
        return _waveformSlash!!
    }

private var _waveformSlash: ImageVector? = null
