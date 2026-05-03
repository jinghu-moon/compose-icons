package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) return _chatCircleText!!
        _chatCircleText = phosphorBoldIcon(
            name = "ChatCircleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 108.000 C 172.000 114.627 166.627 120.000 160.000 120.000 L 96.000 120.000 C 89.373 120.000 84.000 114.627 84.000 108.000 C 84.000 101.373 89.373 96.000 96.000 96.000 L 160.000 96.000 C 166.627 96.000 172.000 101.373 172.000 108.000 ZM 160.000 136.000 L 96.000 136.000 C 89.373 136.000 84.000 141.373 84.000 148.000 C 84.000 154.627 89.373 160.000 96.000 160.000 L 160.000 160.000 C 166.627 160.000 172.000 154.627 172.000 148.000 C 172.000 141.373 166.627 136.000 160.000 136.000 ZM 236.000 128.000 C 236.008 165.620 216.439 200.534 184.344 220.160 C 152.250 239.787 112.254 241.299 78.770 224.150 L 46.340 235.000 C 39.139 237.427 31.184 235.563 25.810 230.190 C 20.437 224.816 18.573 216.861 21.000 209.660 L 31.810 177.230 C 11.481 137.410 17.789 89.182 47.675 55.930 C 77.561 22.678 124.845 11.278 166.601 27.257 C 208.356 43.236 235.949 83.291 236.000 128.000 ZM 212.000 128.000 C 211.987 92.687 189.888 61.152 156.699 49.087 C 123.511 37.022 86.320 47.002 63.632 74.063 C 40.943 101.123 37.602 139.484 55.270 170.060 C 56.994 173.036 57.358 176.608 56.270 179.870 L 46.340 209.660 L 76.130 199.730 C 77.355 199.322 78.638 199.113 79.930 199.110 C 82.038 199.114 84.107 199.672 85.930 200.730 C 111.922 215.770 143.965 215.790 169.976 200.785 C 195.987 185.779 212.009 158.029 212.000 128.000 Z"),
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
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
