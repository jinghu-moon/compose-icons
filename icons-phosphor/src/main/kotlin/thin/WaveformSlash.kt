package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorThinIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.000 96.000 L 52.000 160.000 C 52.000 162.209 50.209 164.000 48.000 164.000 C 45.791 164.000 44.000 162.209 44.000 160.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 C 50.209 92.000 52.000 93.791 52.000 96.000 ZM 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 84.000 85.550 L 84.000 224.000 C 84.000 226.209 85.791 228.000 88.000 228.000 C 90.209 228.000 92.000 226.209 92.000 224.000 L 92.000 94.350 L 124.000 129.550 L 124.000 192.000 C 124.000 194.209 125.791 196.000 128.000 196.000 C 130.209 196.000 132.000 194.209 132.000 192.000 L 132.000 138.350 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 88.000 40.430 C 90.209 40.430 92.000 38.639 92.000 36.430 L 92.000 32.000 C 92.000 29.791 90.209 28.000 88.000 28.000 C 85.791 28.000 84.000 29.791 84.000 32.000 L 84.000 36.430 C 84.000 38.639 85.791 40.430 88.000 40.430 ZM 128.000 84.430 C 130.209 84.430 132.000 82.639 132.000 80.430 L 132.000 64.000 C 132.000 61.791 130.209 60.000 128.000 60.000 C 125.791 60.000 124.000 61.791 124.000 64.000 L 124.000 80.430 C 124.000 82.639 125.791 84.430 128.000 84.430 ZM 168.000 128.430 C 170.209 128.430 172.000 126.639 172.000 124.430 L 172.000 96.000 C 172.000 93.791 170.209 92.000 168.000 92.000 C 165.791 92.000 164.000 93.791 164.000 96.000 L 164.000 124.430 C 164.000 126.639 165.791 128.430 168.000 128.430 ZM 208.000 76.000 C 205.791 76.000 204.000 77.791 204.000 80.000 L 204.000 168.430 C 204.000 170.639 205.791 172.430 208.000 172.430 C 210.209 172.430 212.000 170.639 212.000 168.430 L 212.000 80.000 C 212.000 77.791 210.209 76.000 208.000 76.000 Z"),
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
