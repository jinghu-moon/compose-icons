package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorBoldIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 56.000 L 44.000 200.000 C 44.000 206.627 38.627 212.000 32.000 212.000 C 25.373 212.000 20.000 206.627 20.000 200.000 L 20.000 56.000 C 20.000 49.373 25.373 44.000 32.000 44.000 C 38.627 44.000 44.000 49.373 44.000 56.000 ZM 244.000 96.000 L 244.000 160.000 C 244.000 171.046 235.046 180.000 224.000 180.000 L 80.000 180.000 C 68.954 180.000 60.000 171.046 60.000 160.000 L 60.000 96.000 C 60.000 84.954 68.954 76.000 80.000 76.000 L 224.000 76.000 C 235.046 76.000 244.000 84.954 244.000 96.000 ZM 220.000 100.000 L 84.000 100.000 L 84.000 156.000 L 220.000 156.000 Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
