package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorDuotoneIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 128.000 C 224.037 151.619 215.331 174.417 199.560 192.000 L 56.440 192.000 C 40.217 173.920 31.480 150.346 32.000 126.060 C 33.000 74.580 75.150 32.730 126.630 32.000 C 152.327 31.633 177.099 41.585 195.400 59.629 C 213.701 77.672 224.003 102.300 224.000 128.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 176.000 140.000 C 176.000 146.627 170.627 152.000 164.000 152.000 C 157.373 152.000 152.000 146.627 152.000 140.000 C 152.000 133.373 157.373 128.000 164.000 128.000 C 170.627 128.000 176.000 133.373 176.000 140.000 ZM 128.000 92.000 C 128.000 85.373 122.627 80.000 116.000 80.000 C 109.373 80.000 104.000 85.373 104.000 92.000 C 104.000 98.627 109.373 104.000 116.000 104.000 C 122.627 104.000 128.000 98.627 128.000 92.000 ZM 201.000 54.000 C 181.600 34.727 155.346 23.937 128.000 24.000 L 126.510 24.000 C 85.778 24.595 49.143 48.917 32.784 86.224 C 16.424 123.532 23.353 166.956 50.510 197.320 C 52.347 199.678 55.346 200.816 58.285 200.269 C 61.224 199.722 63.612 197.582 64.478 194.721 C 65.344 191.860 64.543 188.755 62.400 186.670 C 30.850 151.391 32.854 97.476 66.936 64.637 C 101.019 31.798 154.971 31.798 189.054 64.637 C 223.136 97.476 225.140 151.391 193.590 186.670 C 190.713 189.972 191.025 194.973 194.291 197.891 C 197.557 200.809 202.562 200.559 205.520 197.330 C 242.458 155.986 240.470 92.935 201.000 54.000 ZM 152.000 168.000 L 136.000 168.000 C 114.260 168.000 88.000 150.160 88.000 128.000 C 88.002 125.762 88.186 123.528 88.550 121.320 C 89.051 118.488 87.993 115.605 85.780 113.769 C 83.566 111.933 80.538 111.427 77.847 112.442 C 75.157 113.458 73.218 115.839 72.770 118.680 C 72.258 121.760 72.001 124.877 72.000 128.000 C 72.000 142.880 79.460 157.130 93.000 168.150 C 105.400 178.220 121.070 184.000 136.000 184.000 L 152.000 184.000 C 156.418 184.000 160.000 187.582 160.000 192.000 C 160.000 196.418 156.418 200.000 152.000 200.000 L 96.000 200.000 C 82.745 200.000 72.000 210.745 72.000 224.000 C 72.000 237.255 82.745 248.000 96.000 248.000 C 100.418 248.000 104.000 244.418 104.000 240.000 C 104.000 235.582 100.418 232.000 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 152.000 216.000 C 165.255 216.000 176.000 205.255 176.000 192.000 C 176.000 178.745 165.255 168.000 152.000 168.000 Z"),
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
