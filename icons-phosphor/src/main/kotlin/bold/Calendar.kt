package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorBoldIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 188.000 28.000 L 188.000 24.000 C 188.000 17.373 182.627 12.000 176.000 12.000 C 169.373 12.000 164.000 17.373 164.000 24.000 L 164.000 28.000 L 92.000 28.000 L 92.000 24.000 C 92.000 17.373 86.627 12.000 80.000 12.000 C 73.373 12.000 68.000 17.373 68.000 24.000 L 68.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 68.000 52.000 C 68.000 58.627 73.373 64.000 80.000 64.000 C 86.627 64.000 92.000 58.627 92.000 52.000 L 164.000 52.000 C 164.000 58.627 169.373 64.000 176.000 64.000 C 182.627 64.000 188.000 58.627 188.000 52.000 L 204.000 52.000 L 204.000 76.000 L 52.000 76.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 100.000 L 204.000 100.000 L 204.000 204.000 ZM 112.000 124.000 L 112.000 180.000 C 112.000 186.627 106.627 192.000 100.000 192.000 C 93.373 192.000 88.000 186.627 88.000 180.000 L 88.000 143.320 C 82.081 145.263 75.659 142.352 73.218 136.621 C 70.776 130.889 73.128 124.242 78.630 121.320 L 94.630 113.320 C 98.342 111.463 102.750 111.655 106.285 113.829 C 109.821 116.003 111.982 119.850 112.000 124.000 ZM 173.490 157.880 L 163.900 168.000 L 168.000 168.000 C 174.627 168.000 180.000 173.373 180.000 180.000 C 180.000 186.627 174.627 192.000 168.000 192.000 L 136.000 192.000 C 131.207 191.998 126.875 189.145 124.981 184.741 C 123.087 180.338 123.995 175.231 127.290 171.750 L 155.450 142.000 C 155.806 141.393 155.996 140.703 156.000 140.000 C 156.005 138.185 154.787 136.595 153.035 136.126 C 151.282 135.657 149.433 136.426 148.530 138.000 C 145.156 143.605 137.914 145.474 132.248 142.202 C 126.583 138.931 124.582 131.724 127.750 126.000 C 134.086 115.024 147.005 109.672 159.247 112.952 C 171.489 116.232 180.001 127.326 180.000 140.000 C 180.018 146.086 178.037 152.010 174.360 156.860 C 174.092 157.218 173.801 157.559 173.490 157.880 Z"),
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
        return _calendar!!
    }

private var _calendar: ImageVector? = null
