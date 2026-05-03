package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorBoldIcon(
            name = "ArrowCircleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 168.490 151.510 C 173.184 156.204 173.184 163.816 168.490 168.510 C 163.796 173.204 156.184 173.204 151.490 168.510 L 108.000 125.000 L 108.000 144.000 C 108.000 150.627 102.627 156.000 96.000 156.000 C 89.373 156.000 84.000 150.627 84.000 144.000 L 84.000 96.000 C 84.000 89.373 89.373 84.000 96.000 84.000 L 144.000 84.000 C 150.627 84.000 156.000 89.373 156.000 96.000 C 156.000 102.627 150.627 108.000 144.000 108.000 L 125.000 108.000 Z"),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
