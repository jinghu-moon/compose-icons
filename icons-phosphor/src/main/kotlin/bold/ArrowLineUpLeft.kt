package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorBoldIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 C 36.000 201.373 41.373 196.000 48.000 196.000 L 224.000 196.000 C 230.627 196.000 236.000 201.373 236.000 208.000 ZM 72.000 156.000 C 78.627 156.000 84.000 150.627 84.000 144.000 L 84.000 77.000 L 175.510 168.520 C 180.204 173.214 187.816 173.214 192.510 168.520 C 197.204 163.826 197.204 156.214 192.510 151.520 L 101.000 60.000 L 168.000 60.000 C 174.627 60.000 180.000 54.627 180.000 48.000 C 180.000 41.373 174.627 36.000 168.000 36.000 L 72.000 36.000 C 65.373 36.000 60.000 41.373 60.000 48.000 L 60.000 144.000 C 60.000 150.627 65.373 156.000 72.000 156.000 Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
