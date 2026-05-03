package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorFillIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 184.000 96.000 C 184.000 91.582 187.582 88.000 192.000 88.000 C 196.418 88.000 200.000 91.582 200.000 96.000 L 200.000 146.750 C 200.000 151.168 196.418 154.750 192.000 154.750 C 187.582 154.750 184.000 151.168 184.000 146.750 ZM 152.000 104.000 C 152.000 99.582 155.582 96.000 160.000 96.000 C 164.418 96.000 168.000 99.582 168.000 104.000 L 168.000 114.750 C 168.000 119.168 164.418 122.750 160.000 122.750 C 155.582 122.750 152.000 119.168 152.000 114.750 ZM 72.000 152.000 C 72.000 156.418 68.418 160.000 64.000 160.000 C 59.582 160.000 56.000 156.418 56.000 152.000 L 56.000 104.000 C 56.000 99.582 59.582 96.000 64.000 96.000 C 68.418 96.000 72.000 99.582 72.000 104.000 ZM 197.660 197.660 C 196.159 199.162 194.123 200.006 192.000 200.006 C 189.877 200.006 187.841 199.162 186.340 197.660 L 136.000 147.310 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 131.310 L 104.000 115.310 L 104.000 184.000 C 104.000 188.418 100.418 192.000 96.000 192.000 C 91.582 192.000 88.000 188.418 88.000 184.000 L 88.000 99.500 C 88.000 99.440 88.000 99.380 88.000 99.320 L 58.340 69.660 C 55.214 66.534 55.214 61.466 58.340 58.340 C 61.466 55.214 66.534 55.214 69.660 58.340 L 197.660 186.340 C 199.162 187.841 200.006 189.877 200.006 192.000 C 200.006 194.123 199.162 196.159 197.660 197.660 Z"),
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
