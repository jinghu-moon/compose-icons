package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorBoldIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.490 199.510 C 205.184 204.204 205.184 211.816 200.490 216.510 C 195.796 221.204 188.184 221.204 183.490 216.510 L 103.490 136.510 C 101.231 134.258 99.961 131.200 99.961 128.010 C 99.961 124.820 101.231 121.762 103.490 119.510 L 183.490 39.510 C 188.184 34.816 195.796 34.816 200.490 39.510 C 205.184 44.204 205.184 51.816 200.490 56.510 L 129.000 128.000 ZM 72.000 36.000 C 65.373 36.000 60.000 41.373 60.000 48.000 L 60.000 208.000 C 60.000 214.627 65.373 220.000 72.000 220.000 C 78.627 220.000 84.000 214.627 84.000 208.000 L 84.000 48.000 C 84.000 41.373 78.627 36.000 72.000 36.000 Z"),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
