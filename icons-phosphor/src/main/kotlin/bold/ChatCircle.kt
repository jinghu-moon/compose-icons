package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorBoldIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 90.380 19.992 55.466 39.561 35.840 71.656 C 16.213 103.750 14.701 143.746 31.850 177.230 L 21.000 209.660 C 18.573 216.861 20.437 224.816 25.810 230.190 C 31.184 235.563 39.139 237.427 46.340 235.000 L 78.770 224.190 C 118.590 244.519 166.818 238.211 200.070 208.325 C 233.322 178.439 244.722 131.155 228.743 89.399 C 212.764 47.644 172.708 20.051 128.000 20.000 ZM 128.000 212.000 C 113.233 212.006 98.726 208.118 85.940 200.730 C 84.117 199.672 82.048 199.114 79.940 199.110 C 78.648 199.113 77.365 199.322 76.140 199.730 L 46.350 209.660 L 56.280 179.870 C 57.368 176.608 57.004 173.036 55.280 170.060 C 36.241 137.145 41.686 95.546 68.556 68.641 C 95.426 41.737 137.019 36.237 169.958 55.234 C 202.897 74.231 218.966 112.986 209.135 149.718 C 199.304 186.450 166.025 211.996 128.000 212.000 Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
