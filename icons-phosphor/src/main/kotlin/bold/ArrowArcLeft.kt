package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorBoldIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 184.000 C 236.000 190.627 230.627 196.000 224.000 196.000 C 217.373 196.000 212.000 190.627 212.000 184.000 C 212.002 150.023 191.536 119.391 160.146 106.388 C 128.756 93.386 92.624 100.574 68.600 124.600 L 53.110 140.000 L 88.000 140.000 C 94.627 140.000 100.000 145.373 100.000 152.000 C 100.000 158.627 94.627 164.000 88.000 164.000 L 24.000 164.000 C 17.373 164.000 12.000 158.627 12.000 152.000 L 12.000 88.000 C 12.000 81.373 17.373 76.000 24.000 76.000 C 30.627 76.000 36.000 81.373 36.000 88.000 L 36.000 123.160 L 51.660 107.610 C 82.553 76.739 128.999 67.513 169.345 84.233 C 209.692 100.952 235.998 140.326 236.000 184.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
