package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorBoldIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 191.510 C 221.184 196.204 221.184 203.816 216.490 208.510 C 211.796 213.204 204.184 213.204 199.490 208.510 L 128.000 137.000 L 56.490 208.490 C 51.796 213.184 44.184 213.184 39.490 208.490 C 34.796 203.796 34.796 196.184 39.490 191.490 L 119.490 111.490 C 121.742 109.231 124.800 107.961 127.990 107.961 C 131.180 107.961 134.238 109.231 136.490 111.490 ZM 56.490 128.510 L 128.000 57.000 L 199.510 128.520 C 204.204 133.214 211.816 133.214 216.510 128.520 C 221.204 123.826 221.204 116.214 216.510 111.520 L 136.510 31.520 C 134.258 29.261 131.200 27.991 128.010 27.991 C 124.820 27.991 121.762 29.261 119.510 31.520 L 39.510 111.520 C 34.816 116.214 34.816 123.826 39.510 128.520 C 44.204 133.214 51.816 133.214 56.510 128.520 Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
