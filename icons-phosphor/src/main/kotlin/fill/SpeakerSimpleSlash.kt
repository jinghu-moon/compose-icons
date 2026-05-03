package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorFillIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.920 210.620 C 223.883 212.729 224.561 215.730 223.694 218.478 C 222.827 221.225 220.550 223.294 217.733 223.895 C 214.915 224.496 211.992 223.535 210.080 221.380 L 168.000 175.090 L 168.000 223.690 C 168.050 226.604 166.565 229.330 164.090 230.870 C 161.261 232.553 157.689 232.331 155.090 230.310 L 85.250 176.000 L 40.000 176.000 C 31.163 176.000 24.000 168.837 24.000 160.000 L 24.000 96.000 C 24.000 87.163 31.163 80.000 40.000 80.000 L 81.550 80.000 L 50.080 45.380 C 47.173 42.103 47.442 37.097 50.684 34.151 C 53.926 31.204 58.935 31.413 61.920 34.620 ZM 200.530 160.000 C 204.798 159.633 208.058 156.033 208.000 151.750 L 208.000 104.270 C 208.068 99.979 204.805 96.367 200.530 96.000 C 198.318 95.853 196.144 96.631 194.527 98.147 C 192.910 99.664 191.995 101.783 192.000 104.000 L 192.000 152.000 C 191.995 154.217 192.910 156.336 194.527 157.853 C 196.144 159.369 198.318 160.147 200.530 160.000 ZM 161.000 119.870 C 162.107 121.125 163.878 121.559 165.440 120.957 C 167.001 120.354 168.023 118.844 168.000 117.170 L 168.000 32.240 C 168.037 29.788 166.982 27.446 165.120 25.850 C 162.235 23.463 158.080 23.396 155.120 25.690 L 111.830 59.330 C 110.951 60.015 110.397 61.035 110.302 62.146 C 110.207 63.256 110.579 64.356 111.330 65.180 ZM 231.470 80.000 C 227.195 80.367 223.932 83.979 224.000 88.270 L 224.000 167.730 C 223.942 172.013 227.202 175.613 231.470 175.980 C 233.682 176.127 235.856 175.349 237.473 173.833 C 239.090 172.316 240.005 170.197 240.000 167.980 L 240.000 88.000 C 240.005 85.783 239.090 83.664 237.473 82.147 C 235.856 80.631 233.682 79.853 231.470 80.000 Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
