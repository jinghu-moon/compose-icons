package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowElbowDownLeft: ImageVector
    get() {
        if (_arrowElbowDownLeft != null) return _arrowElbowDownLeft!!
        _arrowElbowDownLeft = phosphorBoldIcon(
            name = "ArrowElbowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 32.000 L 204.000 176.000 C 204.000 182.627 198.627 188.000 192.000 188.000 L 77.000 188.000 L 104.520 215.510 C 109.214 220.204 109.214 227.816 104.520 232.510 C 99.826 237.204 92.214 237.204 87.520 232.510 L 39.520 184.510 C 37.261 182.258 35.991 179.200 35.991 176.010 C 35.991 172.820 37.261 169.762 39.520 167.510 L 87.520 119.510 C 92.214 114.816 99.826 114.816 104.520 119.510 C 109.214 124.204 109.214 131.816 104.520 136.510 L 77.000 164.000 L 180.000 164.000 L 180.000 32.000 C 180.000 25.373 185.373 20.000 192.000 20.000 C 198.627 20.000 204.000 25.373 204.000 32.000 Z"),
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
        return _arrowElbowDownLeft!!
    }

private var _arrowElbowDownLeft: ImageVector? = null
