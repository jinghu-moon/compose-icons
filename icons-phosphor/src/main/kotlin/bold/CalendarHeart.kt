package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorBoldIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 188.000 28.000 L 188.000 24.000 C 188.000 17.373 182.627 12.000 176.000 12.000 C 169.373 12.000 164.000 17.373 164.000 24.000 L 164.000 28.000 L 92.000 28.000 L 92.000 24.000 C 92.000 17.373 86.627 12.000 80.000 12.000 C 73.373 12.000 68.000 17.373 68.000 24.000 L 68.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 68.000 52.000 C 68.000 58.627 73.373 64.000 80.000 64.000 C 86.627 64.000 92.000 58.627 92.000 52.000 L 164.000 52.000 C 164.000 58.627 169.373 64.000 176.000 64.000 C 182.627 64.000 188.000 58.627 188.000 52.000 L 204.000 52.000 ZM 152.000 84.000 C 143.139 83.993 134.590 87.267 128.000 93.190 C 117.422 83.728 102.271 81.365 89.313 87.155 C 76.356 92.945 68.009 105.807 68.000 120.000 C 68.000 137.000 77.530 153.560 96.320 169.220 C 104.455 175.958 113.273 181.827 122.630 186.730 C 126.010 188.421 129.990 188.421 133.370 186.730 C 142.727 181.827 151.545 175.958 159.680 169.220 C 178.470 153.560 188.000 137.000 188.000 120.000 C 188.000 100.118 171.882 84.000 152.000 84.000 ZM 128.000 162.290 C 114.850 154.430 92.000 137.230 92.000 120.000 C 92.000 113.373 97.373 108.000 104.000 108.000 C 110.627 108.000 116.000 113.373 116.000 120.000 C 116.000 126.627 121.373 132.000 128.000 132.000 C 134.627 132.000 140.000 126.627 140.000 120.000 C 140.000 113.373 145.373 108.000 152.000 108.000 C 158.627 108.000 164.000 113.373 164.000 120.000 C 164.000 137.230 141.140 154.440 128.000 162.290 Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
