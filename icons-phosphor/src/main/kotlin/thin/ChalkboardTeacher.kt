package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorThinIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 53.390 212.000 C 54.935 211.998 56.340 211.106 57.000 209.710 C 65.600 191.543 83.900 179.959 104.000 179.959 C 124.100 179.959 142.400 191.543 151.000 209.710 C 151.660 211.106 153.065 211.998 154.610 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 157.080 204.000 C 149.726 190.181 137.291 179.758 122.400 174.930 C 136.331 166.646 143.008 150.074 138.713 134.446 C 134.417 118.818 120.208 107.987 104.000 107.987 C 87.792 107.987 73.583 118.818 69.287 134.446 C 64.992 150.074 71.669 166.646 85.600 174.930 C 70.709 179.758 58.274 190.181 50.920 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 104.000 172.000 C 88.536 172.000 76.000 159.464 76.000 144.000 C 76.000 128.536 88.536 116.000 104.000 116.000 C 119.464 116.000 132.000 128.536 132.000 144.000 C 132.000 159.464 119.464 172.000 104.000 172.000 ZM 196.000 80.000 L 196.000 176.000 C 196.000 178.209 194.209 180.000 192.000 180.000 L 176.000 180.000 C 173.791 180.000 172.000 178.209 172.000 176.000 C 172.000 173.791 173.791 172.000 176.000 172.000 L 188.000 172.000 L 188.000 84.000 L 68.000 84.000 L 68.000 96.000 C 68.000 98.209 66.209 100.000 64.000 100.000 C 61.791 100.000 60.000 98.209 60.000 96.000 L 60.000 80.000 C 60.000 77.791 61.791 76.000 64.000 76.000 L 192.000 76.000 C 194.209 76.000 196.000 77.791 196.000 80.000 Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
