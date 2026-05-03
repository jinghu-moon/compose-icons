package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorBoldIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.490 199.510 C 173.184 204.204 173.184 211.816 168.490 216.510 C 163.796 221.204 156.184 221.204 151.490 216.510 L 71.490 136.510 C 69.231 134.258 67.961 131.200 67.961 128.010 C 67.961 124.820 69.231 121.762 71.490 119.510 L 151.490 39.510 C 156.184 34.816 163.796 34.816 168.490 39.510 C 173.184 44.204 173.184 51.816 168.490 56.510 L 97.000 128.000 Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
