package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorBoldIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 56.000 L 236.000 200.000 C 236.000 206.627 230.627 212.000 224.000 212.000 C 217.373 212.000 212.000 206.627 212.000 200.000 L 212.000 56.000 C 212.000 49.373 217.373 44.000 224.000 44.000 C 230.627 44.000 236.000 49.373 236.000 56.000 ZM 196.000 96.000 L 196.000 160.000 C 196.000 171.046 187.046 180.000 176.000 180.000 L 32.000 180.000 C 20.954 180.000 12.000 171.046 12.000 160.000 L 12.000 96.000 C 12.000 84.954 20.954 76.000 32.000 76.000 L 176.000 76.000 C 187.046 76.000 196.000 84.954 196.000 96.000 ZM 172.000 100.000 L 36.000 100.000 L 36.000 156.000 L 172.000 156.000 Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
