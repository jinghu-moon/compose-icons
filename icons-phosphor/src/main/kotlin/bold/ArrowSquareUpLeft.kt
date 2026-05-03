package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareUpLeft: ImageVector
    get() {
        if (_arrowSquareUpLeft != null) return _arrowSquareUpLeft!!
        _arrowSquareUpLeft = phosphorBoldIcon(
            name = "ArrowSquareUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 84.000 144.000 L 84.000 96.000 C 84.000 89.373 89.373 84.000 96.000 84.000 L 144.000 84.000 C 150.627 84.000 156.000 89.373 156.000 96.000 C 156.000 102.627 150.627 108.000 144.000 108.000 L 125.000 108.000 L 168.520 151.510 C 173.214 156.204 173.214 163.816 168.520 168.510 C 163.826 173.204 156.214 173.204 151.520 168.510 L 108.000 125.000 L 108.000 144.000 C 108.000 150.627 102.627 156.000 96.000 156.000 C 89.373 156.000 84.000 150.627 84.000 144.000 Z"),
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
        return _arrowSquareUpLeft!!
    }

private var _arrowSquareUpLeft: ImageVector? = null
