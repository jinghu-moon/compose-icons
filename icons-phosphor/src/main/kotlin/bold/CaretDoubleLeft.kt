package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorBoldIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 199.510 C 213.184 204.204 213.184 211.816 208.490 216.510 C 203.796 221.204 196.184 221.204 191.490 216.510 L 111.490 136.510 C 109.231 134.258 107.961 131.200 107.961 128.010 C 107.961 124.820 109.231 121.762 111.490 119.510 L 191.490 39.510 C 196.184 34.816 203.796 34.816 208.490 39.510 C 213.184 44.204 213.184 51.816 208.490 56.510 L 137.000 128.000 ZM 57.000 128.000 L 128.520 56.490 C 133.214 51.796 133.214 44.184 128.520 39.490 C 123.826 34.796 116.214 34.796 111.520 39.490 L 31.520 119.490 C 29.261 121.742 27.991 124.800 27.991 127.990 C 27.991 131.180 29.261 134.238 31.520 136.490 L 111.520 216.490 C 116.214 221.184 123.826 221.184 128.520 216.490 C 133.214 211.796 133.214 204.184 128.520 199.490 Z"),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
