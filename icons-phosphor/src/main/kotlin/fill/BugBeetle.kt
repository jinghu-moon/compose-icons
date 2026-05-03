package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorFillIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 120.000 L 208.000 120.000 L 208.000 104.000 L 224.000 104.000 C 228.418 104.000 232.000 107.582 232.000 112.000 C 232.000 116.418 228.418 120.000 224.000 120.000 ZM 32.000 104.000 C 27.582 104.000 24.000 107.582 24.000 112.000 C 24.000 116.418 27.582 120.000 32.000 120.000 L 48.000 120.000 L 48.000 104.000 ZM 208.000 160.000 C 208.000 162.700 207.860 165.370 207.600 168.000 L 224.000 168.000 C 228.418 168.000 232.000 171.582 232.000 176.000 C 232.000 180.418 228.418 184.000 224.000 184.000 L 204.320 184.000 C 193.844 217.336 162.943 240.015 128.000 240.015 C 93.057 240.015 62.156 217.336 51.680 184.000 L 32.000 184.000 C 27.582 184.000 24.000 180.418 24.000 176.000 C 24.000 171.582 27.582 168.000 32.000 168.000 L 48.400 168.000 C 48.140 165.370 48.000 162.700 48.000 160.000 L 48.000 152.000 L 32.000 152.000 C 27.582 152.000 24.000 148.418 24.000 144.000 C 24.000 139.582 27.582 136.000 32.000 136.000 L 48.000 136.000 L 48.000 120.000 L 208.000 120.000 L 208.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 139.582 232.000 144.000 C 232.000 148.418 228.418 152.000 224.000 152.000 L 208.000 152.000 ZM 136.000 144.000 C 136.000 139.582 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 139.582 120.000 144.000 L 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 C 132.418 216.000 136.000 212.418 136.000 208.000 ZM 69.840 57.150 C 57.707 69.965 50.167 86.442 48.400 104.000 L 207.600 104.000 C 205.833 86.442 198.293 69.965 186.160 57.150 L 205.660 37.660 C 208.786 34.534 208.786 29.466 205.660 26.340 C 202.534 23.214 197.466 23.214 194.340 26.340 L 174.050 46.640 C 146.453 27.119 109.547 27.119 81.950 46.640 L 61.660 26.340 C 58.534 23.214 53.466 23.214 50.340 26.340 C 47.214 29.466 47.214 34.534 50.340 37.660 Z"),
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
