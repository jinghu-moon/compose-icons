package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorBoldIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 32.000 C 212.000 38.627 206.627 44.000 200.000 44.000 L 56.000 44.000 C 49.373 44.000 44.000 38.627 44.000 32.000 C 44.000 25.373 49.373 20.000 56.000 20.000 L 200.000 20.000 C 206.627 20.000 212.000 25.373 212.000 32.000 ZM 180.000 80.000 L 180.000 224.000 C 180.000 235.046 171.046 244.000 160.000 244.000 L 96.000 244.000 C 84.954 244.000 76.000 235.046 76.000 224.000 L 76.000 80.000 C 76.000 68.954 84.954 60.000 96.000 60.000 L 160.000 60.000 C 171.046 60.000 180.000 68.954 180.000 80.000 ZM 156.000 84.000 L 100.000 84.000 L 100.000 220.000 L 156.000 220.000 Z"),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
