package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorBoldIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.490 136.490 L 64.490 216.490 C 59.796 221.184 52.184 221.184 47.490 216.490 C 42.796 211.796 42.796 204.184 47.490 199.490 L 119.000 128.000 L 47.510 56.490 C 42.816 51.796 42.816 44.184 47.510 39.490 C 52.204 34.796 59.816 34.796 64.510 39.490 L 144.510 119.490 C 146.767 121.744 148.033 124.804 148.029 127.994 C 148.026 131.184 146.752 134.241 144.490 136.490 ZM 224.490 119.490 L 144.490 39.490 C 139.796 34.796 132.184 34.796 127.490 39.490 C 122.796 44.184 122.796 51.796 127.490 56.490 L 199.000 128.000 L 127.480 199.510 C 122.786 204.204 122.786 211.816 127.480 216.510 C 132.174 221.204 139.786 221.204 144.480 216.510 L 224.480 136.510 C 226.741 134.260 228.013 131.202 228.014 128.012 C 228.016 124.822 226.748 121.763 224.490 119.510 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
