package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorBoldIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.490 127.510 C 218.749 129.762 220.019 132.820 220.019 136.010 C 220.019 139.200 218.749 142.258 216.490 144.510 L 136.490 224.510 C 134.238 226.769 131.180 228.039 127.990 228.039 C 124.800 228.039 121.742 226.769 119.490 224.510 L 39.490 144.510 C 34.796 139.816 34.796 132.204 39.490 127.510 C 44.184 122.816 51.796 122.816 56.490 127.510 L 128.000 199.000 L 199.510 127.480 C 201.765 125.231 204.821 123.970 208.006 123.976 C 211.191 123.981 214.243 125.253 216.490 127.510 ZM 119.490 144.510 C 121.742 146.769 124.800 148.039 127.990 148.039 C 131.180 148.039 134.238 146.769 136.490 144.510 L 216.490 64.510 C 221.184 59.816 221.184 52.204 216.490 47.510 C 211.796 42.816 204.184 42.816 199.490 47.510 L 128.000 119.000 L 56.490 47.510 C 51.796 42.816 44.184 42.816 39.490 47.510 C 34.796 52.204 34.796 59.816 39.490 64.510 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
