package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorRegularIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 152.000 L 224.000 152.000 C 228.418 152.000 232.000 148.418 232.000 144.000 C 232.000 139.582 228.418 136.000 224.000 136.000 L 208.000 136.000 L 208.000 120.000 L 224.000 120.000 C 228.418 120.000 232.000 116.418 232.000 112.000 C 232.000 107.582 228.418 104.000 224.000 104.000 L 207.600 104.000 C 205.833 86.442 198.293 69.965 186.160 57.150 L 205.660 37.660 C 208.786 34.534 208.786 29.466 205.660 26.340 C 202.534 23.214 197.466 23.214 194.340 26.340 L 174.050 46.640 C 146.453 27.119 109.547 27.119 81.950 46.640 L 61.660 26.340 C 58.534 23.214 53.466 23.214 50.340 26.340 C 47.214 29.466 47.214 34.534 50.340 37.660 L 69.840 57.150 C 57.707 69.965 50.167 86.442 48.400 104.000 L 32.000 104.000 C 27.582 104.000 24.000 107.582 24.000 112.000 C 24.000 116.418 27.582 120.000 32.000 120.000 L 48.000 120.000 L 48.000 136.000 L 32.000 136.000 C 27.582 136.000 24.000 139.582 24.000 144.000 C 24.000 148.418 27.582 152.000 32.000 152.000 L 48.000 152.000 L 48.000 160.000 C 48.000 162.700 48.140 165.370 48.400 168.000 L 32.000 168.000 C 27.582 168.000 24.000 171.582 24.000 176.000 C 24.000 180.418 27.582 184.000 32.000 184.000 L 51.680 184.000 C 62.156 217.336 93.057 240.015 128.000 240.015 C 162.943 240.015 193.844 217.336 204.320 184.000 L 224.000 184.000 C 228.418 184.000 232.000 180.418 232.000 176.000 C 232.000 171.582 228.418 168.000 224.000 168.000 L 207.600 168.000 C 207.860 165.370 208.000 162.700 208.000 160.000 ZM 128.000 48.000 C 160.234 48.040 187.420 72.022 191.480 104.000 L 64.480 104.000 C 68.542 72.007 95.750 48.020 128.000 48.000 ZM 136.000 223.480 L 136.000 144.000 C 136.000 139.582 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 139.582 120.000 144.000 L 120.000 223.480 C 88.022 219.420 64.040 192.234 64.000 160.000 L 64.000 120.000 L 192.000 120.000 L 192.000 160.000 C 191.960 192.234 167.978 219.420 136.000 223.480 Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
