package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorBoldIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 168.490 95.510 C 173.184 100.204 173.184 107.816 168.490 112.510 C 163.796 117.204 156.184 117.204 151.490 112.510 L 128.000 89.000 L 104.490 112.520 C 99.796 117.214 92.184 117.214 87.490 112.520 C 82.796 107.826 82.796 100.214 87.490 95.520 L 119.490 63.520 C 121.742 61.261 124.800 59.991 127.990 59.991 C 131.180 59.991 134.238 61.261 136.490 63.520 ZM 168.490 143.510 C 170.749 145.762 172.019 148.820 172.019 152.010 C 172.019 155.200 170.749 158.258 168.490 160.510 L 136.490 192.510 C 134.238 194.769 131.180 196.039 127.990 196.039 C 124.800 196.039 121.742 194.769 119.490 192.510 L 87.490 160.510 C 82.796 155.816 82.796 148.204 87.490 143.510 C 92.184 138.816 99.796 138.816 104.490 143.510 L 128.000 167.000 L 151.510 143.480 C 153.765 141.231 156.821 139.970 160.006 139.976 C 163.191 139.981 166.243 141.253 168.490 143.510 Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
