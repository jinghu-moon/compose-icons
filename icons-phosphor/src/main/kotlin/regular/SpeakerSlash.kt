package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorRegularIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 73.550 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 77.250 176.000 L 147.090 230.310 C 149.501 232.184 152.769 232.523 155.513 231.181 C 158.257 229.840 159.998 227.054 160.000 224.000 L 160.000 175.090 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 32.000 96.000 L 72.000 96.000 L 72.000 160.000 L 32.000 160.000 ZM 144.000 207.640 L 88.000 164.090 L 88.000 95.890 L 144.000 157.490 ZM 186.000 143.870 C 193.983 134.803 193.983 121.217 186.000 112.150 C 183.999 110.023 183.316 106.974 184.218 104.196 C 185.121 101.418 187.465 99.353 190.335 98.809 C 193.204 98.264 196.142 99.326 198.000 101.580 C 211.313 116.693 211.313 139.347 198.000 154.460 C 195.076 157.774 190.019 158.089 186.705 155.165 C 183.391 152.241 183.076 147.184 186.000 143.870 ZM 105.840 67.870 C 104.536 66.195 103.951 64.071 104.213 61.965 C 104.476 59.859 105.565 57.943 107.240 56.640 L 147.090 25.640 C 149.508 23.760 152.788 23.426 155.536 24.779 C 158.283 26.133 160.017 28.937 160.000 32.000 L 160.000 106.830 C 160.000 111.248 156.418 114.830 152.000 114.830 C 147.582 114.830 144.000 111.248 144.000 106.830 L 144.000 48.360 L 117.060 69.360 C 113.561 72.058 108.538 71.409 105.840 67.910 ZM 248.000 128.000 C 248.011 147.682 240.758 166.676 227.630 181.340 C 224.665 184.548 219.674 184.785 216.419 181.871 C 213.164 178.957 212.848 173.971 215.710 170.670 C 237.438 146.376 237.438 109.634 215.710 85.340 C 213.750 83.219 213.085 80.205 213.971 77.456 C 214.857 74.707 217.156 72.649 219.986 72.072 C 222.816 71.494 225.738 72.487 227.630 74.670 C 240.761 89.328 248.016 108.320 248.000 128.000 Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
