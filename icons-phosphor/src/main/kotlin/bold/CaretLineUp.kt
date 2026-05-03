package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorBoldIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 183.510 C 221.184 188.204 221.184 195.816 216.490 200.510 C 211.796 205.204 204.184 205.204 199.490 200.510 L 128.000 129.000 L 56.490 200.490 C 51.796 205.184 44.184 205.184 39.490 200.490 C 34.796 195.796 34.796 188.184 39.490 183.490 L 119.490 103.490 C 121.742 101.231 124.800 99.961 127.990 99.961 C 131.180 99.961 134.238 101.231 136.490 103.490 ZM 48.000 84.000 L 208.000 84.000 C 214.627 84.000 220.000 78.627 220.000 72.000 C 220.000 65.373 214.627 60.000 208.000 60.000 L 48.000 60.000 C 41.373 60.000 36.000 65.373 36.000 72.000 C 36.000 78.627 41.373 84.000 48.000 84.000 Z"),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
