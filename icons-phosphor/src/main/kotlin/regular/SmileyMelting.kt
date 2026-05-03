package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorRegularIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 140.000 C 176.000 146.627 170.627 152.000 164.000 152.000 C 157.373 152.000 152.000 146.627 152.000 140.000 C 152.000 133.373 157.373 128.000 164.000 128.000 C 170.627 128.000 176.000 133.373 176.000 140.000 ZM 128.000 92.000 C 128.000 85.373 122.627 80.000 116.000 80.000 C 109.373 80.000 104.000 85.373 104.000 92.000 C 104.000 98.627 109.373 104.000 116.000 104.000 C 122.627 104.000 128.000 98.627 128.000 92.000 ZM 201.000 54.000 C 160.936 15.048 97.252 14.718 56.785 53.251 C 16.319 91.785 13.534 155.409 50.480 197.330 C 52.372 199.513 55.294 200.506 58.124 199.928 C 60.954 199.351 63.253 197.293 64.139 194.544 C 65.025 191.795 64.360 188.781 62.400 186.660 C 30.850 151.381 32.854 97.466 66.936 64.627 C 101.019 31.788 154.971 31.788 189.054 64.627 C 223.136 97.466 225.140 151.381 193.590 186.660 C 190.644 189.954 190.926 195.014 194.220 197.960 C 197.514 200.906 202.574 200.624 205.520 197.330 C 242.458 155.986 240.470 92.935 201.000 54.000 ZM 152.000 168.000 L 136.000 168.000 C 114.260 168.000 88.000 150.160 88.000 128.000 C 88.002 125.762 88.186 123.528 88.550 121.320 C 89.051 118.488 87.993 115.605 85.780 113.769 C 83.566 111.933 80.538 111.427 77.847 112.442 C 75.157 113.458 73.218 115.839 72.770 118.680 C 72.258 121.760 72.001 124.877 72.000 128.000 C 72.000 142.880 79.460 157.130 93.000 168.150 C 105.400 178.220 121.070 184.000 136.000 184.000 L 152.000 184.000 C 156.418 184.000 160.000 187.582 160.000 192.000 C 160.000 196.418 156.418 200.000 152.000 200.000 L 96.000 200.000 C 82.745 200.000 72.000 210.745 72.000 224.000 C 72.000 237.255 82.745 248.000 96.000 248.000 C 100.418 248.000 104.000 244.418 104.000 240.000 C 104.000 235.582 100.418 232.000 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 152.000 216.000 C 165.255 216.000 176.000 205.255 176.000 192.000 C 176.000 178.745 165.255 168.000 152.000 168.000 Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
