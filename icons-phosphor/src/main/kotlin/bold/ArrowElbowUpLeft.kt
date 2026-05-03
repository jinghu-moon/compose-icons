package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorBoldIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 80.000 L 204.000 224.000 C 204.000 230.627 198.627 236.000 192.000 236.000 C 185.373 236.000 180.000 230.627 180.000 224.000 L 180.000 92.000 L 77.000 92.000 L 104.520 119.510 C 109.214 124.204 109.214 131.816 104.520 136.510 C 99.826 141.204 92.214 141.204 87.520 136.510 L 39.520 88.510 C 37.261 86.258 35.991 83.200 35.991 80.010 C 35.991 76.820 37.261 73.762 39.520 71.510 L 87.520 23.510 C 92.214 18.816 99.826 18.816 104.520 23.510 C 109.214 28.204 109.214 35.816 104.520 40.510 L 77.000 68.000 L 192.000 68.000 C 198.627 68.000 204.000 73.373 204.000 80.000 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
