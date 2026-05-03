package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorFillIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.464 33.019 50.421 32.075 48.258 32.006 C 46.095 31.936 43.996 32.746 42.440 34.250 C 39.355 37.395 39.294 42.410 42.300 45.630 L 44.460 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 189.920 208.000 L 202.080 221.380 C 203.512 222.955 205.513 223.894 207.639 223.990 C 209.765 224.085 211.842 223.330 213.410 221.890 C 216.582 218.755 216.715 213.676 213.710 210.380 ZM 104.000 128.000 L 117.190 128.000 L 131.730 144.000 L 104.270 144.000 C 99.981 144.063 96.372 140.803 96.000 136.530 C 95.853 134.318 96.631 132.144 98.147 130.527 C 99.664 128.910 101.783 127.995 104.000 128.000 ZM 56.000 128.000 L 72.000 128.000 C 74.217 127.995 76.336 128.910 77.853 130.527 C 79.369 132.144 80.147 134.318 80.000 136.530 C 79.628 140.803 76.019 144.063 71.730 144.000 L 56.270 144.000 C 51.981 144.063 48.372 140.803 48.000 136.530 C 47.853 134.318 48.631 132.144 50.147 130.527 C 51.664 128.910 53.783 127.995 56.000 128.000 ZM 152.000 176.000 L 56.270 176.000 C 51.981 176.063 48.372 172.803 48.000 168.530 C 47.853 166.318 48.631 164.144 50.147 162.527 C 51.664 160.910 53.783 159.995 56.000 160.000 L 146.280 160.000 L 158.180 173.090 C 156.658 174.935 154.391 176.002 152.000 176.000 ZM 240.000 64.000 L 240.000 192.000 C 239.996 196.480 238.113 200.753 234.810 203.780 C 234.026 204.513 232.981 204.900 231.910 204.855 C 230.838 204.810 229.829 204.336 229.110 203.540 L 175.000 144.000 L 200.000 144.000 C 202.217 144.005 204.336 143.090 205.853 141.473 C 207.369 139.856 208.147 137.682 208.000 135.470 C 207.633 131.202 204.033 127.942 199.750 128.000 L 160.450 128.000 L 93.790 54.690 C 92.720 53.513 92.450 51.814 93.100 50.363 C 93.751 48.912 95.200 47.984 96.790 48.000 L 224.000 48.000 C 232.837 48.000 240.000 55.163 240.000 64.000 Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
