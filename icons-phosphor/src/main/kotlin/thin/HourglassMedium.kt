package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) return _hourglassMedium!!
        _hourglassMedium = phosphorThinIcon(
            name = "HourglassMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 75.640 L 196.000 40.000 C 196.000 33.373 190.627 28.000 184.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 76.000 C 60.000 79.777 61.778 83.334 64.800 85.600 L 121.330 128.000 L 64.800 170.400 C 61.778 172.666 60.000 176.223 60.000 180.000 L 60.000 216.000 C 60.000 222.627 65.373 228.000 72.000 228.000 L 184.000 228.000 C 190.627 228.000 196.000 222.627 196.000 216.000 L 196.000 180.360 C 195.992 176.602 194.232 173.063 191.240 170.790 L 134.630 128.000 L 191.240 85.210 C 194.232 82.937 195.992 79.398 196.000 75.640 ZM 128.000 123.000 L 86.670 92.000 L 169.000 92.000 ZM 188.000 180.370 L 188.000 216.000 C 188.000 218.209 186.209 220.000 184.000 220.000 L 72.000 220.000 C 69.791 220.000 68.000 218.209 68.000 216.000 L 68.000 180.000 C 68.000 178.741 68.593 177.555 69.600 176.800 L 124.000 136.000 L 124.000 168.000 C 124.000 170.209 125.791 172.000 128.000 172.000 C 130.209 172.000 132.000 170.209 132.000 168.000 L 132.000 136.000 L 186.410 177.130 C 187.422 177.894 188.012 179.092 188.000 180.360 ZM 188.000 75.650 C 187.999 76.904 187.411 78.085 186.410 78.840 L 179.580 84.000 L 76.000 84.000 L 69.600 79.200 C 68.593 78.445 68.000 77.259 68.000 76.000 L 68.000 40.000 C 68.000 37.791 69.791 36.000 72.000 36.000 L 184.000 36.000 C 186.209 36.000 188.000 37.791 188.000 40.000 Z"),
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
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
