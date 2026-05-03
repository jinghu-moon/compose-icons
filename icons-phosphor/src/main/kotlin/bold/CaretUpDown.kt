package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorBoldIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.490 167.510 C 186.749 169.762 188.019 172.820 188.019 176.010 C 188.019 179.200 186.749 182.258 184.490 184.510 L 136.490 232.510 C 134.238 234.769 131.180 236.039 127.990 236.039 C 124.800 236.039 121.742 234.769 119.490 232.510 L 71.490 184.510 C 66.796 179.816 66.796 172.204 71.490 167.510 C 76.184 162.816 83.796 162.816 88.490 167.510 L 128.000 207.000 L 167.510 167.480 C 169.765 165.231 172.821 163.970 176.006 163.976 C 179.191 163.981 182.243 165.253 184.490 167.510 ZM 88.490 88.510 L 128.000 49.000 L 167.510 88.520 C 172.204 93.214 179.816 93.214 184.510 88.520 C 189.204 83.826 189.204 76.214 184.510 71.520 L 136.510 23.520 C 134.258 21.261 131.200 19.991 128.010 19.991 C 124.820 19.991 121.762 21.261 119.510 23.520 L 71.510 71.520 C 66.816 76.214 66.816 83.826 71.510 88.520 C 76.204 93.214 83.816 93.214 88.510 88.520 Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
