package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorBoldIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 48.000 C 236.000 54.627 230.627 60.000 224.000 60.000 L 48.000 60.000 C 41.373 60.000 36.000 54.627 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 224.000 36.000 C 230.627 36.000 236.000 41.373 236.000 48.000 ZM 175.510 87.510 L 84.000 179.000 L 84.000 112.000 C 84.000 105.373 78.627 100.000 72.000 100.000 C 65.373 100.000 60.000 105.373 60.000 112.000 L 60.000 208.000 C 60.000 214.627 65.373 220.000 72.000 220.000 L 168.000 220.000 C 174.627 220.000 180.000 214.627 180.000 208.000 C 180.000 201.373 174.627 196.000 168.000 196.000 L 101.000 196.000 L 192.520 104.490 C 197.214 99.796 197.214 92.184 192.520 87.490 C 187.826 82.796 180.214 82.796 175.520 87.490 Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
