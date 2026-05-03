package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CalendarSlash: ImageVector
    get() {
        if (_calendarSlash != null) return _calendarSlash!!
        _calendarSlash = phosphorThinIcon(
            name = "CalendarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 50.233 36.465 49.141 35.989 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 209.590 220.016 211.039 219.088 211.690 217.637 C 212.340 216.186 212.070 214.487 211.000 213.310 ZM 46.540 44.310 L 82.590 84.000 L 44.000 84.000 L 44.000 48.000 C 43.999 46.369 44.988 44.901 46.500 44.290 ZM 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 92.000 L 89.870 92.000 L 199.000 212.000 ZM 220.000 48.000 L 220.000 177.230 C 220.000 179.439 218.209 181.230 216.000 181.230 C 213.791 181.230 212.000 179.439 212.000 177.230 L 212.000 92.000 L 134.880 92.000 C 132.671 92.000 130.880 90.209 130.880 88.000 C 130.880 85.791 132.671 84.000 134.880 84.000 L 212.000 84.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 180.000 44.000 L 180.000 56.000 C 180.000 58.209 178.209 60.000 176.000 60.000 C 173.791 60.000 172.000 58.209 172.000 56.000 L 172.000 44.000 L 91.250 44.000 C 89.041 44.000 87.250 42.209 87.250 40.000 C 87.250 37.791 89.041 36.000 91.250 36.000 L 172.000 36.000 L 172.000 24.000 C 172.000 21.791 173.791 20.000 176.000 20.000 C 178.209 20.000 180.000 21.791 180.000 24.000 L 180.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 Z"),
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
        return _calendarSlash!!
    }

private var _calendarSlash: ImageVector? = null
